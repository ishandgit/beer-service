package com.ishand.msdemo.msscbeerservice.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class BeerDto {

	@Null
	private UUID id;
	@Null
	private Integer version;
	
	@Null
	private OffsetDateTime createdDate;
	@Null
	private OffsetDateTime lastModifiedDate;
	
	@NotBlank
	private String beerName;
	@NotNull
	private BeerStyleEnum beerStyle;
	
	@NotNull
	@Positive
	private Long upc;
	
	@Positive
	@NotNull
	private BigDecimal price;
	private Integer quantityOnHand;
}
