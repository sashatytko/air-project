package com.air.airproject.controller;

import com.air.airproject.model.Airport;
import com.air.airproject.service.AirportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/v1/airport")
@RequiredArgsConstructor
public class AirportController {

	private final AirportService service;

	@GetMapping
	public List<Airport> getAll(@RequestParam Integer size, @RequestParam Integer page) {
		return service.getAll(size, page);
	}


	@PostMapping
	public Airport create(@RequestBody Airport airport) {
		return service.create(airport);
	}


	@GetMapping("/{id}")
	public Airport get(@PathVariable Integer id) {
		return service.get(id);
	}


	@PutMapping
	public Airport update(@RequestBody Airport airport) {
		return service.update(airport);
	}


	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}
