package com.air.airproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.LocalTime;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Airport {

	@Id
	private Integer id;
	@ManyToMany(mappedBy = "airports")
	private Set<Flight> flights;
	private String ICAOCode;
	private String IATACode;
	private double lat;
	private double lng;
	private int elevation;
	private LocalTime operationalTimeStart;
	private LocalTime operationalTimeFinish;
	private String phoneNo;
	private String postalAddress;
}
