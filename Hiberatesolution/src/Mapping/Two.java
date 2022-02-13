package Mapping;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;



@Entity
public  class Two implements Serializable{

	@Id
	@GeneratedValue
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "two")
	private One one;
	
	public One getOne() {
		return one;
	}
	public void setOne(One one) {
		this.one = one;
	}
	private int tid;
	private String tname;
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
	public Two(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	public Two() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Two [tid=" + tid + ", tname=" + tname + "]";
	}
	
}
