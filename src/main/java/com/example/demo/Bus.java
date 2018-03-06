package com.example.demo;


import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Hotels")
public class Bus {
	 private String Id ;
	 private String NbreR;
	 private Marque Marq;
	 private List<Localisation> local; 
	 private List<Driver> Drivers;
	 
	public Bus(String id, String nbreR, Marque marq, List<Localisation> local, List<Driver> drivers) {
		super();
		Id = id;
		NbreR = nbreR;
		Marq = marq;
		this.local = local;
		Drivers = drivers;
	}
	
	public Bus() {};
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getNbreR() {
		return NbreR;
	}
	public void setNbreR(String nbreR) {
		NbreR = nbreR;
	}
	public Marque getMarq() {
		return Marq;
	}
	public void setMarq(Marque marq) {
		Marq = marq;
	}
	public List<Localisation> getLocal() {
		return local;
	}
	public void setLocal(List<Localisation> local) {
		this.local = local;
	}
	public List<Driver> getDrivers() {
		return Drivers;
	}
	public void setDrivers(List<Driver> drivers) {
		Drivers = drivers;
	} 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	

}
