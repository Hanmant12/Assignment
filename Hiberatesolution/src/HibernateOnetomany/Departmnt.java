package HibernateOnetomany;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Departmnt {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="mark_id")
	private Collection<Mark> mark=new ArrayList<>();
	public Collection<Mark> getMark() {
		return mark;
	}
	public void setMark(Collection<Mark> mark) {
		this.mark = mark;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(did, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departmnt other = (Departmnt) obj;
		return did == other.did && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Departmnt [did=" + did + ", name=" + name + "]";
	}
	
}
