package com.ishand.msdemo.msscbeerservice.web.model;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageImpl;

public class BeerPagedList extends PageImpl<BeerDto> {

	public BeerPagedList(List<BeerDto> content) {
		super(content);
		// TODO Auto-generated constructor stub
	}
	
	public BeerPagedList(List<BeerDto> content, Pageable pageable, Long total) {
		super(content);
		// TODO Auto-generated constructor stub
	}

}
