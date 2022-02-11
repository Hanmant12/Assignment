package com.example.Demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Raje {

	@Id
	@GeneratedValue
	private int gid;
	private String name;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Raje(int gid, String name) {
		super();
		this.gid = gid;
		this.name = name;
	}
	public Raje() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Raje [gid=" + gid + ", name=" + name + "]";
	}
	
	
}
