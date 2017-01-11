package com.hand.hap.sale.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;
import com.hand.hap.sale.dto.Film;

public interface FilmMapper extends Mapper<Film>{
	List<Film> selectByFilmTitle(String title);
	
}
