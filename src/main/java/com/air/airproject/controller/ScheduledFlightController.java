package com.air.airproject.controller;

import com.air.airproject.model.ScheduledFlight;
import com.air.airproject.service.ScheduledFlightService;
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

@RestController("/v1/scheduled-flight")
@RequiredArgsConstructor
public class ScheduledFlightController {

	private final ScheduledFlightService service;

	@GetMapping
	public List<ScheduledFlight> getAll(@RequestParam Integer size, @RequestParam Integer page) {
		return service.getAll(size, page);
	}


	@PostMapping
	public ScheduledFlight create(@RequestBody ScheduledFlight scheduledFlight) {
		return service.create(scheduledFlight);
	}


	@GetMapping("/{id}")
	public ScheduledFlight get(@PathVariable Integer id) {
		return service.get(id);
	}


	@PutMapping
	public ScheduledFlight update(@RequestBody ScheduledFlight scheduledFlight) {
		return service.update(scheduledFlight);
	}


	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}
