package com.air.airproject.controller;

import com.air.airproject.model.Aircraft;
import com.air.airproject.service.AircraftService;
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

@RestController("/v1/aircraft")
@RequiredArgsConstructor
public class AircraftController {

	private final AircraftService service;

	@GetMapping
	public List<Aircraft> getAll(@RequestParam Integer size, @RequestParam Integer page) {
		return service.getAll(size, page);
	}


	@PostMapping
	public Aircraft create(@RequestBody Aircraft aircraft) {
		return service.create(aircraft);
	}


	@GetMapping("/{id}")
	public Aircraft get(@PathVariable Integer id) {
		return service.get(id);
	}


	@PutMapping
	public Aircraft update(@RequestBody Aircraft aircraft) {
		return service.update(aircraft);
	}


	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}
