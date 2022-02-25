package com.air.airproject.service;

import com.air.airproject.model.TechnicalWorker;
import com.air.airproject.repository.TechnicalWorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TechnicalWorkerService {

	private final TechnicalWorkerRepository repository;

	public List<TechnicalWorker> getAll( Integer size,  Integer page) {
		return repository.findAll(PageRequest.of(page, size)).getContent();
	}

	public TechnicalWorker create(TechnicalWorker technicalWorker) {
		return repository.save(technicalWorker);
	}

	public TechnicalWorker get(Integer id) {
		return repository.getById(id);
	}

	public TechnicalWorker update(TechnicalWorker technicalWorker) {
		return repository.save(technicalWorker);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
