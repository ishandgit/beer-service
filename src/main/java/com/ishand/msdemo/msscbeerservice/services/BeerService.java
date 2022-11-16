package com.ishand.msdemo.msscbeerservice.services;

import java.util.UUID;

import org.springframework.http.ResponseEntity;

import com.ishand.msdemo.msscbeerservice.web.model.BeerDto;

public interface BeerService {

	public BeerDto getById(UUID beerId);

	public BeerDto saveNewBeer(BeerDto beerDto);

	public BeerDto updateBeerById(UUID beerId, BeerDto beerDto);

}
