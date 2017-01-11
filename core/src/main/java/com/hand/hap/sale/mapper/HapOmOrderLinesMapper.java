package com.hand.hap.sale.mapper;

import com.hand.hap.mybatis.common.Mapper;
import com.hand.hap.sale.dto.HapOmOrderLines;

public interface HapOmOrderLinesMapper extends Mapper<HapOmOrderLines>{

	void updateByHeadersId(HapOmOrderLines lines);
  
}