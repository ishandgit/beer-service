package com.ishand.msdemo.msscbeerservice.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ishand.msdemo.msscbeerservice.domain.Beer;
import com.ishand.msdemo.msscbeerservice.mappers.BeerMapper;
import com.ishand.msdemo.msscbeerservice.repositories.BeerRepository;
import com.ishand.msdemo.msscbeerservice.web.controller.NotFoundException;
import com.ishand.msdemo.msscbeerservice.web.model.BeerDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BeerServiceImpl implements BeerService {
	
	private final BeerRepository beerRepository;
	private final BeerMapper beerMapper;

	@Override
	public BeerDto getById(UUID beerId) {
		
		return beerMapper.beerToBeerDto(beerRepository.findById(beerId).orElseThrow(NotFoundException::new));
	}

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {
		
		return beerMapper.beerToBeerDto(beerRepository.save(beerMapper.beerDtoToBeer(beerDto)));
	}

	@Override
	public BeerDto updateBeerById(UUID beerId, BeerDto beerDto) {
		Beer beer = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);
		beer.setBeerName(beerDto.getBeerName());
		beer.setBeerStyle(beerDto.getBeerStyle().name());
		beer.setPrice(beerDto.getPrice());
		beer.setUpc(beerDto.getUpc());
		
		
		return beerMapper.beerToBeerDto(beerRepository.save(beer));
	}

}
