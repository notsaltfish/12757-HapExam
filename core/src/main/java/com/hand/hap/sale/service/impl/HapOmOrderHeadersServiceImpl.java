package com.hand.hap.sale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.sale.dto.HapOmOrderHeaders;
import com.hand.hap.sale.dto.HapOmOrderLines;
import com.hand.hap.sale.dto.SaleOrderInfoDTO;
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
	

	@Override
	public ResponseData getQueryOrderInfo(SaleOrderInfoDTO saleOrderInfoDTO, int page, int pageSize) {
		PageHelper.startPage(page,pageSize);
		List<SaleOrderInfoDTO> datas = hapOmOrderHeadersMapper.selectOrderInfo(saleOrderInfoDTO);
		ResponseData response = new ResponseData();
		response.setRows(datas);
		//response.setTotal(hapOmOrderHeadersMapper.);;
		return response;
	}

	@Override
	public ResponseData updateOrderInfo(SaleOrderInfoDTO order) {
		HapOmOrderHeaders headers = getHeaders(order);
		HapOmOrderLines lines = getLines(order);
		hapOmOrderHeadersMapper.updateByPrimaryKeySelective(headers);
		hapOmOrderLineMapper.updateByHeadersId(lines);
		ResponseData data = new ResponseData();
		data.setSuccess(true);
		return data;
	}

	private HapOmOrderLines getLines(SaleOrderInfoDTO order) {
		HapOmOrderLines lines = new HapOmOrderLines();
		lines.setHeaderId(order.getHeaderId());
		lines.setOrderdQuantity(order.getOrderQuantity());
		lines.setOrderQuantityUom(order.getOrderQuantityUOM());
		lines.setUnitSellingPrice(order.getUnitSellingPrice());
		lines.setCompanyId(order.getCompanyId());
		lines.setDescription(order.getDescription());
		lines.setInventoryItemId(order.getInventoryItemId());
		return lines;
	}

	private HapOmOrderHeaders getHeaders(SaleOrderInfoDTO order) {
		HapOmOrderHeaders headers = new HapOmOrderHeaders();
		headers.setHeaderId(order.getHeaderId());
		headers.setCompanyId(order.getCompanyId());
		headers.setCustomerId(order.getCustomerId());
		headers.setOrderDate(order.getOrderDate());
		headers.setOrderStatus(order.getOrderStatus());
		
		return headers;
	}
	
	
}
