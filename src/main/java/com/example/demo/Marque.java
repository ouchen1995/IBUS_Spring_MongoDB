package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection ="marque")
public class Marque {

	private String Id,Marque;
    private List<Bus> Lbus;
    
    public Marque() {};
    
	public Marque(String id, String marque, List<Bus> lbus) {
		super();
		Id = id;
		Marque = marque;
		Lbus = lbus;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getMarque() {
		return Marque;
	}
	public void setMarque(String marque) {
		Marque = marque;
	}
	public List<Bus> getLbus() {
		return Lbus;
	}
	public void setLbus(List<Bus> lbus) {
		Lbus = lbus;
	}
    
    
    
    
	
}
