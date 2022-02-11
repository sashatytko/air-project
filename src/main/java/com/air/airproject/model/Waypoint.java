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
public class Waypoint {

	@Id
	private Integer id;
	private String name;
	private double lat;
	private double lng;
	@ManyToMany(mappedBy = "plan")
	private Set<Flight> flights;
	private boolean isReportObligatory;
}
