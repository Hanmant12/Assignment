package manytomany;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String pname;
	@ManyToMany
	@JoinTable(name="eid",
          joinColumns= {@JoinColumn(name="projt")},
          inverseJoinColumns = {@JoinColumn(name="eprj")}
 			
			)
	private Collection<employee> emp=new ArrayList<>();
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Collection<employee> getEmp() {
		return emp;
	}
	public void setEmp(Collection<employee> emp) {
		this.emp = emp;
	}
	@Override
	public int hashCode() {
		return Objects.hash(emp, pid, pname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return Objects.equals(emp, other.emp) && pid == other.pid && Objects.equals(pname, other.pname);
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", emp=" + emp + "]";
	}
	
	
}
