package com.hand.hap.sale.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;
import com.hand.hap.sale.dto.HapOmOrderHeaders;
import com.hand.hap.sale.dto.SaleOrderDetail;
import com.hand.hap.sale.dto.SaleOrderInfoDTO;

public interface HapOmOrderHeadersMapper extends Mapper<HapOmOrderHeaders>{
	List<SaleOrderInfoDTO> selectOrderInfo(SaleOrderInfoDTO order);

	void deleteAllByHeaderId(Long headerId);

	void deleteByHeaderId(Long headerId);

	long insertSelective2(HapOmOrderHeaders header);
	
	List<SaleOrderDetail> selectExcelInfo(SaleOrderInfoDTO order);

	void updateByPrimaryKeySelective2(HapOmOrderHeaders header);

	long selectCountHeader(SaleOrderInfoDTO saleOrderInfoDTO);
}