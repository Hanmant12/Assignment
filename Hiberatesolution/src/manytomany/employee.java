package manytomany;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	
	@ManyToMany(mappedBy ="emp",cascade = CascadeType.ALL )
	private Collection<Project> project=new ArrayList<>();

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Collection<Project> getProject() {
		return project;
	}

	public void setProject(Collection<Project> project) {
		this.project = project;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eid, ename, project);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee other = (employee) obj;
		return eid == other.eid && Objects.equals(ename, other.ename) && Objects.equals(project, other.project);
	}

	@Override
	public String toString() {
		return "employee [eid=" + eid + ", ename=" + ename + ", project=" + project + "]";
	}
	
	
}
