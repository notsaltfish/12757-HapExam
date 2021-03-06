package com.hand.hap.sale.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.sale.dto.HapOmOrderHeaders;
import com.hand.hap.sale.dto.SaleOrderDetail;
import com.hand.hap.sale.dto.SaleOrderInfoDTO;
import com.hand.hap.system.dto.ResponseData;
import com.hand.hap.system.service.IBaseService;

public interface IHapOmOrderHeadersService extends ProxySelf<IHapOmOrderHeadersService>, IBaseService<HapOmOrderHeaders>{
	
	ResponseData getQueryOrderInfo(SaleOrderInfoDTO saleOrderInfoDTO,int page,int pageSize);

	ResponseData updateOrderInfo(SaleOrderInfoDTO order);

	ResponseData insertBySaleOrderDTO(IRequest irequest, SaleOrderInfoDTO order);

	ResponseData getSaleOrderDetail(SaleOrderInfoDTO order);

	ResponseData updateOrSave(SaleOrderInfoDTO[] order);

	ResponseData deleteLine(SaleOrderDetail[] details);

	ResponseData deleteHeader(Long headerId);
		
	
}
