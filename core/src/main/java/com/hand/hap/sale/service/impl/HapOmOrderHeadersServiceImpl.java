package com.hand.hap.sale.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.sale.dto.HapInvInventoryItems;
import com.hand.hap.sale.dto.HapOmOrderHeaders;
import com.hand.hap.sale.dto.HapOmOrderLines;
import com.hand.hap.sale.dto.SaleOrderDetail;
import com.hand.hap.sale.dto.SaleOrderInfoDTO;
import com.hand.hap.sale.mapper.HapInvInventoryItemsMapper;
import com.hand.hap.sale.mapper.HapOmOrderHeadersMapper;
import com.hand.hap.sale.mapper.HapOmOrderLinesMapper;
import com.hand.hap.sale.service.IHapOmOrderHeadersService;
import com.hand.hap.system.dto.ResponseData;
import com.hand.hap.system.service.impl.BaseServiceImpl;

@Service
public class HapOmOrderHeadersServiceImpl extends BaseServiceImpl<HapOmOrderHeaders> implements IHapOmOrderHeadersService{
	
	@Autowired
	HapOmOrderHeadersMapper hapOmOrderHeadersMapper;
	@Autowired
	HapOmOrderLinesMapper hapOmOrderLineMapper;
	@Autowired
	HapInvInventoryItemsMapper hapInvInventoryItemsMapper;

	@Override
	public ResponseData getQueryOrderInfo(SaleOrderInfoDTO saleOrderInfoDTO, int page, int pageSize) {
		PageHelper.startPage(page,pageSize);
		List<SaleOrderInfoDTO> datas = hapOmOrderHeadersMapper.selectOrderInfo(saleOrderInfoDTO);
		for(SaleOrderInfoDTO dto:datas){
			Long totalMoney = 0l;
			for(HapOmOrderLines line: dto.getLines()){
				totalMoney += line.getOrderdQuantity()*line.getUnitSellingPrice();
			}
			dto.setTotalMoney(totalMoney);
		}
		long count = hapOmOrderHeadersMapper.selectCountHeader(saleOrderInfoDTO);
		ResponseData response = new ResponseData();
		response.setTotal(count);
		response.setRows(datas);
		//response.setTotal(hapOmOrderHeadersMapper.);;
		return response;
	}

	public ResponseData getSaleOrderDetail(SaleOrderInfoDTO saleOrderInfoDTO){
		List<SaleOrderInfoDTO> datas = hapOmOrderHeadersMapper.selectOrderInfo(saleOrderInfoDTO);
		List<SaleOrderDetail> details=saleOrderInfoDTOToSaleOrderDetail(datas);
		ResponseData response = new ResponseData();
		response.setRows(details);
		//response.setTotal(hapOmOrderHeadersMapper.);;
		return response;
	}
	
	
	
	
	
	@Override
	public ResponseData updateOrSave(SaleOrderInfoDTO[] order) {
		SaleOrderInfoDTO dto = order[0];
		HapOmOrderHeaders header = getHeaders(dto);
		long headerId = 0;
		if(header.getHeaderId()!=null){
			hapOmOrderHeadersMapper.updateByPrimaryKeySelective2(header);
		}else{
			try{
			
				hapOmOrderHeadersMapper.insertSelective2(header);
				
			}catch (Exception e){
				
			}
		}
		if(dto.getDetails()!=null){
			dto.setHeaderId(header.getHeaderId());
			List<HapOmOrderLines> lines = getLines(dto);
			for(HapOmOrderLines line:lines){
				if(line.getLineId()!=null){
					
					hapOmOrderLineMapper.updateByPrimaryKeySelective(line);
				}else{

					hapOmOrderLineMapper.insertSelective(line);
				}
			}
		}
		
		ResponseData data = new ResponseData();
		List<HapOmOrderHeaders> list = new ArrayList<HapOmOrderHeaders>();
		list.add(header);
		data.setSuccess(true);
		data.setRows(list);
		return data;
	}

	private List<HapOmOrderLines> getLines(SaleOrderInfoDTO order) {
		List<HapOmOrderLines> lines = new ArrayList<HapOmOrderLines>();
		List<SaleOrderDetail> details = order.getDetails();
		long maxLineNumber = hapInvInventoryItemsMapper.selectMaxLineNumber(order.getHeaderId());
		HapOmOrderLines line = null;
		for(SaleOrderDetail detail:details){
			Long itemId = hapInvInventoryItemsMapper.selectIdByCode(detail.getItemCode());
			line = new HapOmOrderLines();
			line.setLineNumber(maxLineNumber++);
			line.setInventoryItemId(itemId);
			line.setHeaderId(order.getHeaderId());
			line.setOrderdQuantity(detail.getOrderdQuantity());
			line.setOrderQuantityUom(detail.getOrderQuantityUom());
			line.setUnitSellingPrice(detail.getUnitSellingPrice());
			line.setCompanyId(order.getCompanyId());
			line.setDescription(detail.getDescription());
			line.setAddition1(detail.getAddition1());
			line.setAddition2(detail.getAddition2());
			line.setAddition3(detail.getAddition3());
			line.setAddition4(detail.getAddition4());
			line.setAddition5(detail.getAddition5());
			
			line.setLineId(detail.getLineId());
			lines.add(line);
		}
		
		return lines;
	}

	//
	public List<SaleOrderDetail> saleOrderInfoDTOToSaleOrderDetail(List<SaleOrderInfoDTO> datas ){
		List<SaleOrderDetail> details  = new ArrayList<SaleOrderDetail>();
		SaleOrderDetail detail = null;
		for(SaleOrderInfoDTO dto:datas){
			List<HapOmOrderLines> lines = dto.getLines();
			List<HapInvInventoryItems> items = dto.getItems(); 
			for(int i=0;i<lines.size();i++){
				detail =new SaleOrderDetail();
				detail.setLinesInfo(lines.get(i));
				for(int j=0;j<items.size();j++){
					if(lines.get(i).getInventoryItemId().longValue()==items.get(j).getInventoryItemId().longValue()){
						detail.setItemsInfo(items.get(j));
					}
				}
				detail.setHeaderInfo(dto);
				details.add(detail);
			}
		}
		
		return details;
	}
	
	
	@Override
	public ResponseData updateOrderInfo(SaleOrderInfoDTO order) {
		
		HapOmOrderHeaders headers = getHeaders(order);
		//List<HapOmOrderLines> lines = getLines(order);
		hapOmOrderHeadersMapper.updateByPrimaryKeySelective(headers);
		hapOmOrderLineMapper.updateByList(order.getLines());
		
		ResponseData data = new ResponseData();
		data.setSuccess(true);
		return data;
	}

/*	private List<HapOmOrderLines> getLines(SaleOrderInfoDTO order) {
		List<HapOmOrderLines> lines = new ArrayList<HapOmOrderLines>();
		lines.setHeaderId(order.getHeaderId());
		lines.setOrderdQuantity(order.getOrderQuantity());
		lines.setOrderQuantityUom(order.getOrderQuantityUOM());
		lines.setUnitSellingPrice(order.getUnitSellingPrice());
		lines.setCompanyId(order.getCompanyId());
		lines.setDescription(order.getDescription());
		
		lines.setInventoryItemId(order.getInventoryItemId());
		return lines;
	}
*/
	private HapOmOrderHeaders getHeaders(SaleOrderInfoDTO order) {
		HapOmOrderHeaders headers = new HapOmOrderHeaders();
		headers.setHeaderId(order.getHeaderId());
		headers.setCompanyId(order.getCompanyId());
		headers.setCustomerId(order.getCustomerId());
		headers.setOrderDate(order.getOrderDate());
		headers.setOrderStatus(order.getOrderStatus());
		headers.setOrderNumber(order.getOrderNumber());
		
		return headers;
	}

	@Override
	public ResponseData insertBySaleOrderDTO(IRequest irequest, SaleOrderInfoDTO order) {
		HapOmOrderHeaders headers = getHeaders(order);
		//HapOmOrderLines lines = getLines(order);
		try{
		this.insert(irequest, headers);
		
		//mapper批量插入line还没写好 ps:写好了
		hapOmOrderLineMapper.insertByList(order.getLines());
		}catch(Exception e){
			
		}
		ResponseData data = new ResponseData();
		data.setSuccess(true);
		return data;
	}

	@Override
	public ResponseData deleteLine(SaleOrderDetail[] details) {
		long[] lineId = new long[details.length];
		for(int i=0;i<details.length;i++){
			lineId[i] = details[i].getLineId();
		}
		hapOmOrderLineMapper.deleteByArray(lineId);
		ResponseData data = new ResponseData();
		data.setSuccess(true);
		return data;
	}

	@Override
	public ResponseData deleteHeader(Long headerId) {
		hapOmOrderLineMapper.deleteByHeaderId(headerId);
		hapOmOrderHeadersMapper.deleteByHeaderId(headerId);
		ResponseData data = new ResponseData();
		data.setSuccess(true);
		return data;
	}
	
	
}
