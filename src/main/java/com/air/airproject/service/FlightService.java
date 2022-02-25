package com.air.airproject.service;

import com.air.airproject.model.Flight;
import com.air.airproject.repository.FlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FlightService {

	private final FlightRepository repository;

	public List<Flight> getAll(Integer size,  Integer page) {
		return repository.findAll(PageRequest.of(page, size)).getContent();
	}

	public Flight create(Flight flight) {
		return repository.save(flight);
	}

	public Flight get(Integer id) {
		return repository.getById(id);
	}

	public Flight update(Flight flight) {
		return repository.save(flight);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
