package com.hand.hap.sale.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.hap.sale.dto.HapOmOrderLines;
import com.hand.hap.sale.mapper.HapOmOrderLinesMapper;
import com.hand.hap.sale.service.IHapOmOrderLinesService;
import com.hand.hap.system.service.impl.BaseServiceImpl;

@Service
public class HapOmOrderLinesServiceImpl extends BaseServiceImpl<HapOmOrderLines>implements IHapOmOrderLinesService{
	
	@Autowired
	HapOmOrderLinesMapper hapOmOrderLinesMapper;
}
