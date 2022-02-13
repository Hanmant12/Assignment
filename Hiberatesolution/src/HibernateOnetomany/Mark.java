package HibernateOnetomany;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mark {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mid;
	private String name;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Mark [mid=" + mid + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(mid, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mark other = (Mark) obj;
		return mid == other.mid && Objects.equals(name, other.name);
	}
	
	
}
