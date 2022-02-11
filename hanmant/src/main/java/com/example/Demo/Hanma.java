package com.example.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hanma {
   private String name;
   private String city;
   @Autowired
   private Bright Bright;
public Bright getBright() {
	return Bright;
}
public void setBright(Bright bright) {
	Bright = bright;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
void display()
{
	System.out.println(city+" "+name);
	Bright.print();
}
}
