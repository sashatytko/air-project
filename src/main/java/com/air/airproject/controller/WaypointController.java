package com.air.airproject.controller;

import com.air.airproject.model.Waypoint;
import com.air.airproject.service.WaypointService;
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

@RestController("/v1/waypoint")
@RequiredArgsConstructor
public class WaypointController {

	private final WaypointService service;

	@GetMapping
	public List<Waypoint> getAll(@RequestParam Integer size, @RequestParam Integer page) {
		return service.getAll(size, page);
	}


	@PostMapping
	public Waypoint create(@RequestBody Waypoint waypoint) {
		return service.create(waypoint);
	}


	@GetMapping("/{id}")
	public Waypoint get(@PathVariable Integer id) {
		return service.get(id);
	}


	@PutMapping
	public Waypoint update(@RequestBody Waypoint waypoint) {
		return service.update(waypoint);
	}


	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}
