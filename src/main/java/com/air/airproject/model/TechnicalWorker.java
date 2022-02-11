package com.air.airproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class TechnicalWorker {

	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	@ManyToMany(mappedBy = "technicalWorkers")
	private List<ScheduledFlight> flights;
	private String position;
}
