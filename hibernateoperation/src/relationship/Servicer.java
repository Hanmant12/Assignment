package relationship;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Servicer {

	@Id
	@GeneratedValue
	private int sid;
	private String sname;
	@OneToOne
	private Laptop Laptop;
	public Servicer(int sid, String sname, relationship.Laptop laptop) {
		super();
		this.sid = sid;
		this.sname = sname;
		Laptop = laptop;
	}
	public Laptop getLaptop() {
		return Laptop;
	}
	public void setLaptop(Laptop laptop) {
		Laptop = laptop;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Servicer(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public Servicer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Servicer [sid=" + sid + ", sname=" + sname + ", Laptop=" + Laptop + "]";
	}
	
	
}
