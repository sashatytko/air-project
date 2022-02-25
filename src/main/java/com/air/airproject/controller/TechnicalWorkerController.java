package com.air.airproject.controller;

import com.air.airproject.model.TechnicalWorker;
import com.air.airproject.service.TechnicalWorkerService;
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

@RestController("/v1/technical-worker")
@RequiredArgsConstructor
public class TechnicalWorkerController {

	private final TechnicalWorkerService service;

	@GetMapping
	public List<TechnicalWorker> getAll(@RequestParam Integer size, @RequestParam Integer page) {
		return service.getAll(size, page);
	}


	@PostMapping
	public TechnicalWorker create(@RequestBody TechnicalWorker technicalWorker) {
		return service.create(technicalWorker);
	}


	@GetMapping("/{id}")
	public TechnicalWorker get(@PathVariable Integer id) {
		return service.get(id);
	}


	@PutMapping
	public TechnicalWorker update(@RequestBody TechnicalWorker technicalWorker) {
		return service.update(technicalWorker);
	}


	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}
