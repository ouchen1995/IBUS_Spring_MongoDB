package com.example.demo;

import java.util.Date;

import org.springframework.data.mongodb.core.aggregation.DateOperators.Hour;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="localisation")
public class Localisation {

	private String Id;
	private Date d;
	private Hour H;
	private Bus bus;
	private Coordonne C;

	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}
	public Hour getH() {
		return H;
	}
	public void setH(Hour h) {
		H = h;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public Localisation(String id, Date d, Hour h, Bus bus, Coordonne C) {
		super();
		Id = id;
		this.d = d;
		H = h;
		this.bus = bus;
		this.C = C;
	}
	
	public Localisation() {}
	public Coordonne getC() {
		return C;
	}
	public void setC(Coordonne c) {
		C = c;
	};
	
	

	
	

}
