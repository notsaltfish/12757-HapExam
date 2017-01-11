package com.hand.hap.sale.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.hap.sale.dto.HapInvInventoryItems;
import com.hand.hap.sale.mapper.HapInvInventoryItemsMapper;
import com.hand.hap.sale.service.IHapInvInventoryItemsService;
import com.hand.hap.system.service.impl.BaseServiceImpl;

@Service
public class HapInvInventoryItemsServiceImpl extends BaseServiceImpl<HapInvInventoryItems>implements IHapInvInventoryItemsService{

	@Autowired
	HapInvInventoryItemsMapper hapInvInventoryItemsMapper;
	

}
