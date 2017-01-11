package com.hand.hap.sale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.hap.core.IRequest;
import com.hand.hap.sale.dto.Film;
import com.hand.hap.sale.mapper.FilmMapper;
import com.hand.hap.sale.service.IFilmService;
import com.hand.hap.system.service.impl.BaseServiceImpl;

@Service
public class FimServiceImpl extends BaseServiceImpl<Film>  implements IFilmService {
	
	@Autowired
	FilmMapper filmMapper;

	@Override
	public List<Film> selectByTitle(String title,IRequest request) {
		return filmMapper.selectByFilmTitle(title);
	}

}
