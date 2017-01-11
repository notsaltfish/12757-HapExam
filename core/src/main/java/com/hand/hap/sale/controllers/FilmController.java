package com.hand.hap.sale.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.sale.service.IFilmService;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

@Controller
public class FilmController extends BaseController{

	@Autowired
	IFilmService filmService;
	
	@RequestMapping("/film/selectbytitle")
	@ResponseBody
	public ResponseData selectByTitle(@RequestParam(defaultValue="AIRPLANE SIERRA",value="title",required=true)String title
			,HttpServletRequest request){
		IRequest iRequest = createRequestContext(request);
		return new ResponseData(filmService.selectByTitle(title, iRequest));
	}
	
	
}
