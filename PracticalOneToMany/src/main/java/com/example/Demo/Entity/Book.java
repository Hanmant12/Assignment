package com.example.Demo.Entity;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {

	@Id
	@GeneratedValue()
	private int bid;
	private String bname;
	@ManyToOne(cascade = CascadeType.ALL)
	private Authoer authoer;
	
	public Authoer getAuthoer() {
		return authoer;
	}
	public void setAuthoer(Authoer authoer) {
		this.authoer = authoer;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bid, bname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return bid == other.bid && Objects.equals(bname, other.bname);
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + "]";
	}
	
}
