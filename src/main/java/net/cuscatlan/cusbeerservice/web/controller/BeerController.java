package net.cuscatlan.cusbeerservice.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.cuscatlan.cusbeerservice.web.data.BeerDto;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día 25 ago. 2022
 *
 */

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
		
		// Pendiente la implementación
		return new ResponseEntity<>(BeerDto.builder().build(),HttpStatus.OK);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping
	public ResponseEntity saveBeer(@RequestBody BeerDto beerDto) {
		
		// Pendiente de implementar
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@SuppressWarnings("rawtypes")
	@PutMapping("/{beerId}")
	public ResponseEntity updateBeerById(@RequestBody BeerDto beerDto, @PathVariable("beerId") UUID beerId) {
		
		// Pendiente de implementar
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
}
