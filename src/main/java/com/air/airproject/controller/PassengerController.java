package com.air.airproject.controller;

import com.air.airproject.model.Passenger;
import com.air.airproject.service.PassengerService;
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

@RestController("/v1/passenger")
@RequiredArgsConstructor
public class PassengerController {

	private final PassengerService service;

	@GetMapping
	public List<Passenger> getAll(@RequestParam Integer size, @RequestParam Integer page) {
		return service.getAll(size, page);
	}


	@PostMapping
	public Passenger create(@RequestBody Passenger passenger) {
		return service.create(passenger);
	}


	@GetMapping("/{id}")
	public Passenger get(@PathVariable Integer id) {
		return service.get(id);
	}


	@PutMapping
	public Passenger update(@RequestBody Passenger passenger) {
		return service.update(passenger);
	}


	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}
