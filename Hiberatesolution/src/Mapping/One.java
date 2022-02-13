package Mapping;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class One implements Serializable {

	@Id
	@GeneratedValue
	private int pone;
	private String name;
	@OneToMany(cascade = CascadeType.ALL ,mappedBy ="one")
	private Set<Two> two;
	
	
	public Set<Two> getTwo() {
		return two;
	}
	public void setTwo(Set<Two> two) {
		this.two = two;
	}
	public int getPone() {
		return pone;
	}
	public void setPone(int pone) {
		this.pone = pone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public One(int pone, String name) {
		super();
		this.pone = pone;
		this.name = name;
	}
	public One() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "One [pone=" + pone + ", name=" + name + "]";
	}
	
	
}
