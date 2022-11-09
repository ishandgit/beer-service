package com.ishand.msdemo.msscbeerservice.mappers;

import org.mapstruct.Mapper;

import com.ishand.msdemo.msscbeerservice.domain.Beer;
import com.ishand.msdemo.msscbeerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
	
	BeerDto BeerToBeerDto(Beer beer) ;
		
	
	
	Beer BeerDtoToBeer(BeerDto dto) ;
}
