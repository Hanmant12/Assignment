package com.example.Demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Hanmant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mid;
	private String dep;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Raje raje;
	
	public Raje getRaje() {
		return raje;
	}
	public void setRaje(Raje raje) {
		this.raje = raje;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public Hanmant(int mid, String dep) {
		super();
		this.mid = mid;
		this.dep = dep;
	}
	public Hanmant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
