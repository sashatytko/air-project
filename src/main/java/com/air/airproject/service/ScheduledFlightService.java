package com.air.airproject.service;

import com.air.airproject.model.ScheduledFlight;
import com.air.airproject.repository.ScheduledFlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduledFlightService {

	private final ScheduledFlightRepository repository;

	public List<ScheduledFlight> getAll(Integer size,  Integer page) {
		return repository.findAll(PageRequest.of(page, size)).getContent();
	}

	public ScheduledFlight create(ScheduledFlight scheduledFlight) {
		return repository.save(scheduledFlight);
	}

	public ScheduledFlight get(Integer id) {
		return repository.getById(id);
	}

	public ScheduledFlight update(ScheduledFlight scheduledFlight) {
		return repository.save(scheduledFlight);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
