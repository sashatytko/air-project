package com.air.airproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Passenger {

	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	@ManyToMany(mappedBy = "passengers")
	private Set<ScheduledFlight> scheduledFlights;
}
