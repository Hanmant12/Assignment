package com.example.Demo;

import org.springframework.stereotype.Component;

@Component
public class Bright {
	private String clg;
	private String add;
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	void print()
	{
		System.out.println(clg+" "+add);
	}
	
}
