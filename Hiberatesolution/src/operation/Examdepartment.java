package operation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ajinky")
public class Examdepartment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String subject;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Examdepartment(int id, String subject) {
		super();
		this.id = id;
		this.subject = subject;
	}
	public Examdepartment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Examdepartment [id=" + id + ", subject=" + subject + "]";
	}
	
	
	
}
