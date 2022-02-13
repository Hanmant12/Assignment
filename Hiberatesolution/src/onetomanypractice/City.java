package onetomanypractice;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cids;
	private String name;
	@ManyToOne
	private School school;
	
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public int getCids() {
		return cids;
	}
	public void setCids(int cids) {
		this.cids = cids;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cids, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return cids == other.cids && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "City [cids=" + cids + ", name=" + name + "]";
	}
	
	
}
