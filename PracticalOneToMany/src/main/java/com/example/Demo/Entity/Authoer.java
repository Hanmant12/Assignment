package com.example.Demo.Entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Authoer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String name;
	@OneToMany(cascade = CascadeType.ALL,mappedBy ="authoer" )
	private Collection<Book> book=new ArrayList<>();
	public Collection<Book> getBook() {
		return book;
	}
	public void setBook(Collection<Book> book) {
		this.book = book;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(aid, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Authoer other = (Authoer) obj;
		return aid == other.aid && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Authoer [aid=" + aid + ", name=" + name + "]";
	}
	
}
