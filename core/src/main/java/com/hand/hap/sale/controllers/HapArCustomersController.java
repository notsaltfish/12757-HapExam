package com.hand.hap.sale.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hand.hap.sale.service.IHapArCustomersService;
import com.hand.hap.system.controllers.BaseController;

@Controller
public class HapArCustomersController extends BaseController{

	
	@Autowired
	IHapArCustomersService iHapArCustomersService;
}
