package com.air.airproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Aircraft {

	@Id
	private Integer id;
	private String aircraftType;
	private String registration;
	private String serialNumber;
	private LocalDate released;
	private String ICAOAddress;
	@OneToMany(mappedBy = "aircraft")
	private List<ScheduledFlight> scheduledFlight;
}
