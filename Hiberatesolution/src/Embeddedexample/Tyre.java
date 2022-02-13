package Embeddedexample;

import java.util.Objects;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tyre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tid;
	private String tname;
	@Embedded
	private Type type;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Type getTyre() {
		return type;
	}
	public void setTyre(Type tyre) {
		this.type = tyre;
	}
	@Override
	public String toString() {
		return "Tyre [tid=" + tid + ", tname=" + tname + "]";
	}
	
	
}
