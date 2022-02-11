package hibernateoperation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Std {

	@Id
	@GeneratedValue()
	private int idq;
	private String clg;
	public int getIdq() {
		return idq;
	}
	public void setIdq(int idq) {
		this.idq = idq;
	}
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	public Std(int idq, String clg) {
		super();
		this.idq = idq;
		this.clg = clg;
	}
	public Std() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Std [idq=" + idq + ", clg=" + clg + "]";
	}
	
}
