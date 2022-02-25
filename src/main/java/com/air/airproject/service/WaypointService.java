package com.air.airproject.service;

import com.air.airproject.model.Waypoint;
import com.air.airproject.repository.WaypointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WaypointService {

	private final WaypointRepository repository;

	public List<Waypoint> getAll(Integer size,  Integer page) {
		return repository.findAll(PageRequest.of(page, size)).getContent();
	}

	public Waypoint create(Waypoint waypoint) {
		return repository.save(waypoint);
	}

	public Waypoint get(Integer id) {
		return repository.getById(id);
	}

	public Waypoint update(Waypoint waypoint) {
		return repository.save(waypoint);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
