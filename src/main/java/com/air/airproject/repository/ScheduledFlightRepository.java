package com.air.airproject.repository;

import com.air.airproject.model.ScheduledFlight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduledFlightRepository extends JpaRepository<ScheduledFlight, Integer> {
}
