package com.air.airproject.service;

import com.air.airproject.model.Passenger;
import com.air.airproject.repository.PassengerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PassengerService {

	private final PassengerRepository repository;

	public List<Passenger> getAll(Integer size,  Integer page) {
		return repository.findAll(PageRequest.of(page, size)).getContent();
	}

	public Passenger create(Passenger passenger) {
		return repository.save(passenger);
	}

	public Passenger get(Integer id) {
		return repository.getById(id);
	}

	public Passenger update(Passenger passenger) {
		return repository.save(passenger);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
