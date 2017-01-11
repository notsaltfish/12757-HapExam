package com.hand.hap.sale.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.hap.sale.dto.HapArCustomers;
import com.hand.hap.sale.mapper.HapArCustomersMapper;
import com.hand.hap.sale.service.IHapArCustomersService;
import com.hand.hap.system.service.impl.BaseServiceImpl;


@Service
public class HapArCustomersServiceImpl extends BaseServiceImpl<HapArCustomers> implements IHapArCustomersService {

	@Autowired
	HapArCustomersMapper hapArCustomersMapper;
	
	
}
