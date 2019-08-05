package com.team.mgmt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "FORECAST")
@Entity
@Data
public class Forecast implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "FORECAST_ID")
	private Long forecastID;
	
	@Column(name = "FORECAST_END")
	private String forecastEnd;
}
