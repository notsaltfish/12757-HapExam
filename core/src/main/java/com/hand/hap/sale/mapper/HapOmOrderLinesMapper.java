package com.hand.hap.sale.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;
import com.hand.hap.sale.dto.HapOmOrderLines;
import com.hand.hap.sale.dto.SaleOrderInfoDTO;

public interface HapOmOrderLinesMapper extends Mapper<HapOmOrderLines>{

	void updateByHeadersId(List<HapOmOrderLines> list);

	void updateByList(List<HapOmOrderLines> lines);

	void insertByList(List<HapOmOrderLines> lines);

	void deleteByArray(long[] lineId);

	void deleteByHeaderId(Long headerId);
  
}