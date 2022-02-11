package relationship;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Laptop {

	@Id
	@GeneratedValue
	private int lid;
	private String name;
	public Laptop(int lid, String name) {
		super();
		this.lid = lid;
		this.name = name;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", name=" + name + "]";
	}
	
}
