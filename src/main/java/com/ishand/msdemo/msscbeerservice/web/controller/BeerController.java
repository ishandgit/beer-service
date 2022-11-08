package com.ishand.msdemo.msscbeerservice.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ishand.msdemo.msscbeerservice.web.model.BeerDto;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
		return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);

	}

	@PostMapping
	public ResponseEntity saveNewBeer(@RequestBody @Validated BeerDto beerDto){
		return new ResponseEntity(HttpStatus.CREATED);
	}

	@PutMapping("/{beerId}")
	public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody @Validated BeerDto beerDto) {
		return new ResponseEntity(HttpStatus.NO_CONTENT);
		
	}

}
