package com.hand.hap.sale.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.sale.dto.Film;
import com.hand.hap.system.service.IBaseService;

public interface IFilmService extends ProxySelf<IFilmService>, IBaseService<Film>{
	
	List<Film> selectByTitle(String title,IRequest request);
}
