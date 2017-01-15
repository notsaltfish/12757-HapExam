package com.hand.hap.sale.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hand.hap.core.IRequest;
import com.hand.hap.excel.dto.ColumnInfo;
import com.hand.hap.excel.dto.ExportConfig;
import com.hand.hap.excel.service.IExportService;
import com.hand.hap.sale.dto.SaleOrderDetail;
import com.hand.hap.sale.dto.SaleOrderInfoDTO;
import com.hand.hap.sale.service.IHapOmOrderHeadersService;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

@Controller
@RequestMapping("/orderheader")
public class HapOmOrderHeadersController extends BaseController{

	@Autowired
	IHapOmOrderHeadersService iHapOmOrderHeaders;
	@Autowired
    IExportService excelService;
	 @Autowired
	   ObjectMapper objectMapper;
	
	@ResponseBody
	@RequestMapping(path="getorderinfo")
	public ResponseData getOrderInfo( SaleOrderInfoDTO order,
			@RequestParam(defaultValue = DEFAULT_PAGE) int  page,
			 @RequestParam(defaultValue = DEFAULT_PAGE_SIZE)int pagesize){
		
		
		return iHapOmOrderHeaders.getQueryOrderInfo(order, page, pagesize);
	}
	
	@ResponseBody
	@RequestMapping(path="getorderheader",method=RequestMethod.POST)
	public ResponseData getOrderHeader(SaleOrderInfoDTO order){
		
		
		return iHapOmOrderHeaders.getQueryOrderInfo(order, 1, 10);
	}
	
	@ResponseBody
	@RequestMapping(path="updateorderInfo",method = RequestMethod.POST)
	public ResponseData updateOrderInfo( @RequestBody SaleOrderInfoDTO[] order ){
		
		return iHapOmOrderHeaders.updateOrderInfo(order[0]);
	}
	
	
	@ResponseBody
	@RequestMapping(path="getorderdetail",method=RequestMethod.POST)
	public ResponseData getOrderDetail(long headerId
																	){
		SaleOrderInfoDTO order = new SaleOrderInfoDTO();
		order.setHeaderId(headerId);
		return iHapOmOrderHeaders.getSaleOrderDetail(order);
	}
	
	@ResponseBody
	@RequestMapping(path="submit",method=RequestMethod.POST)
	public ResponseData submit(@RequestBody SaleOrderInfoDTO[] order){
	
		return iHapOmOrderHeaders.updateOrSave(order);
	}
	
	/*@RequestMapping("excelexport")
	public ResponseData excelExport(@RequestBody SaleOrderInfoDTO[] orders
																,HttpServletResponse response){
		
		
		return null;
	}*/
	
	
	@RequestMapping(value = "excelexport")
    public void createXLS(HttpServletRequest request, @RequestParam String config,
            HttpServletResponse httpServletResponse) {
        IRequest requestContext = createRequestContext(request);
        try {
            JavaType type = objectMapper.getTypeFactory().constructParametrizedType(ExportConfig.class,
                    ExportConfig.class, SaleOrderInfoDTO.class, ColumnInfo.class);
            ExportConfig<SaleOrderInfoDTO, ColumnInfo> exportConfig = objectMapper.readValue(config, type);
            excelService.exportAndDownloadExcel("com.hand.hap.sale.mapper.HapOmOrderHeadersMapper.selectExcelInfo",
                    exportConfig, request, httpServletResponse, requestContext);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	@ResponseBody
	@RequestMapping(path="deleteline")
	public ResponseData deleteLine(@RequestBody SaleOrderDetail[] details){
		
		System.out.println("dsds");
		//return iHapOmOrderHeaders.deleteLine(lineId);
		return iHapOmOrderHeaders.deleteLine(details);
	}
	
	@RequestMapping(path="deleteheader")
	public ResponseData create(long headerId ){
		return iHapOmOrderHeaders.deleteHeader(headerId);
	}
	
}
