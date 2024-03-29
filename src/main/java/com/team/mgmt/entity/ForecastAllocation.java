package com.team.mgmt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import lombok.Data;

@Table(name = "FORECAST_ALLOCATION")
@Entity
@Data
public class ForecastAllocation  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long Id;
	
	@OneToOne
	@Cascade(value={org.hibernate.annotations.CascadeType.ALL})
	@JoinColumn(name="EMPLOYEE_ID")
	private EmpBasic employeeId;
	
	
	@OneToOne
	@Cascade(value={org.hibernate.annotations.CascadeType.ALL})
	@JoinColumn(name="FORECAST_ID")
	private Forecast forecastID;

		
	@OneToOne
	@Cascade(value={org.hibernate.annotations.CascadeType.ALL})
	@JoinColumn(name="WORKSTREAM_ID")
	private WorkStreams workStreams;
	
	@Column(name = "HOUR_ALLOCATION")
	private String  hourAllocation;	

}
