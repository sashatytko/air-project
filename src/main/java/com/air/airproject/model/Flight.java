package com.air.airproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Flight {

	@Id
	private String id;
	private String flightNo;
	private String departureAipCode;
	private String arrivalAipCode;
	@ManyToMany
	@JoinTable(
			name = "flight_airport",
			joinColumns = @JoinColumn(name = "flight_id"),
			inverseJoinColumns = @JoinColumn(name = "airport_id")
	)
	private List<Airport> airports;
	@ManyToMany
	@JoinTable(
			name = "flight_waypoint",
			joinColumns = @JoinColumn(name = "flight_id"),
			inverseJoinColumns = @JoinColumn(name = "waypoint_id")
	)
	private List<Waypoint> plan;
	@OneToMany(mappedBy = "flight")
	private Set<ScheduledFlight> scheduledFlights;
	private LocalDateTime arrivalTime;
	private LocalDateTime departureTime;
}
