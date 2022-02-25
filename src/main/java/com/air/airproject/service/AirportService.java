package com.air.airproject.service;

import com.air.airproject.model.Airport;
import com.air.airproject.repository.AirportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AirportService {

	private final AirportRepository repository;

	public List<Airport> getAll(Integer size,  Integer page) {
		return repository.findAll(PageRequest.of(page, size)).getContent();
	}


	public Airport create(Airport airport) {
		return repository.save(airport);
	}


	public Airport get(Integer id) {
		return repository.getById(id);
	}


	public Airport update(Airport airport) {
		return repository.save(airport);
	}


	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
