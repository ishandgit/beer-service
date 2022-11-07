package com.ishand.msdemo.msscbeerservice.bootstrap;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ishand.msdemo.msscbeerservice.domain.Beer;
import com.ishand.msdemo.msscbeerservice.repositories.BeerRepository;

@Component
public class BeerLoader implements CommandLineRunner {

	private final BeerRepository beerRepository;
	

	public BeerLoader(BeerRepository beerRepository) {
		super();
		this.beerRepository = beerRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		loadBeerObjects();

	}

	private void loadBeerObjects() {
		// TODO Auto-generated method stub
		if (beerRepository.count() == 0) {
			beerRepository.save(Beer.builder().beerName("Mango Bobs").beerStyle("IPA").minOnHand(12).quantityToBrew(200)
					.upc(337010000001L).price(new BigDecimal("12.95")).build());

			beerRepository.save(Beer.builder().beerName("Galaxy Cat").beerStyle("PALE_ALE").minOnHand(12)
					.quantityToBrew(200).upc(337010000002L).price(new BigDecimal("11.95")).build());

		}
		System.out.println("Loaded Beers: " + beerRepository.count());

	}

}
