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
import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class ScheduledFlight {

	@Id
	private Integer id;
	private String callSign;
	private Integer SQUAWK;
	private Long cruisingLevel;
	@ManyToOne
	@JoinColumn(name = "aircraft_id")
	private Aircraft aircraft;
	@ManyToOne
	@JoinColumn(name = "flight_id")
	private Flight flight;
	@ManyToMany
	@JoinTable(
			name = "flight_passenger",
			joinColumns = @JoinColumn(name = "scheduled_flight_id"),
			inverseJoinColumns = @JoinColumn(name = "passenger_id")
	)
	private Set<Passenger> passengers;
	@ManyToMany
	@JoinTable(
			name = "flight_technical_workers",
			joinColumns = @JoinColumn(name = "scheduled_flight_id"),
			inverseJoinColumns = @JoinColumn(name = "technical_worker_id")
	)
	private Set<TechnicalWorker> technicalWorkers;
	private LocalDate departure;
}
