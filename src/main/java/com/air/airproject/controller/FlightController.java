package com.air.airproject.controller;

import com.air.airproject.model.Flight;
import com.air.airproject.service.FlightService;
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

@RestController("/v1/flight")
@RequiredArgsConstructor
public class FlightController {

	private final FlightService service;

	@GetMapping
	public List<Flight> getAll(@RequestParam Integer size, @RequestParam Integer page) {
		return service.getAll(size, page);
	}


	@PostMapping
	public Flight create(@RequestBody Flight flight) {
		return service.create(flight);
	}


	@GetMapping("/{id}")
	public Flight get(@PathVariable Integer id) {
		return service.get(id);
	}


	@PutMapping
	public Flight update(@RequestBody Flight flight) {
		return service.update(flight);
	}


	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}
