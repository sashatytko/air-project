package com.air.airproject.repository;

import com.air.airproject.model.Waypoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaypointRepository extends JpaRepository<Waypoint, Integer> {
}
