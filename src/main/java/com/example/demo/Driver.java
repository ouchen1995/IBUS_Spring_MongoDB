package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="driver")
public class Driver {

	private String Id;
	private String Name;
	private String Age;
	private String Experience; 
	private List<Bus> Lbus;
	
	public Driver() {};
	
	public Driver(String id, String name, String age, String experience, List<Bus> lbus) {
		super();
		Id = id;
		Name = name;
		Age = age;
		Experience = experience;
		Lbus = lbus;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String experience) {
		Experience = experience;
	}
	public List<Bus> getLbus() {
		return Lbus;
	}
	public void setLbus(List<Bus> lbus) {
		Lbus = lbus;
	}
	
	
	
	
	
	
}
