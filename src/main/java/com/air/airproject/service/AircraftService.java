package com.air.airproject.service;

import com.air.airproject.model.Aircraft;
import com.air.airproject.repository.AircraftRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AircraftService {

	private final AircraftRepository repository;

	public List<Aircraft> getAll(Integer size, Integer page) {
		return repository.findAll(PageRequest.of(page, size)).getContent();
	}


	public Aircraft create(Aircraft aircraft) {
		return repository.save(aircraft);
	}


	public Aircraft get(Integer id) {
		return repository.getById(id);
	}


	public Aircraft update(Aircraft aircraft) {
		return repository.save(aircraft);
	}


	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
