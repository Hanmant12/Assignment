package com.example.Demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DEPARTMENT {

	@Id
	@GeneratedValue
	private int id;
	private int mark;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public DEPARTMENT(int id, int mark) {
		super();
		this.id = id;
		this.mark = mark;
	}
	public DEPARTMENT() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DEPARTMENT [id=" + id + ", mark=" + mark + "]";
	}
	
}
