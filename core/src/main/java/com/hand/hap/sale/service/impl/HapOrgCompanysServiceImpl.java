package com.hand.hap.sale.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.hap.sale.dto.HapOrgCompanys;
import com.hand.hap.sale.mapper.HapOrgCompanysMapper;
import com.hand.hap.sale.service.IHapOrgCompanysService;
import com.hand.hap.system.service.impl.BaseServiceImpl;

@Service
public class HapOrgCompanysServiceImpl extends BaseServiceImpl<HapOrgCompanys>implements IHapOrgCompanysService{
	
	@Autowired
	HapOrgCompanysMapper hapOrgCompanysMapper;
}
