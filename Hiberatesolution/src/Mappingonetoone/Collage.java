package Mappingonetoone;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Collage {

	@Id
	@GeneratedValue
	private int cid;
	private String cname;
	@OneToOne(cascade = CascadeType.ALL)
	private Std stds;
	@Override
	public int hashCode() {
		return Objects.hash(cid, cname, stds);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Collage other = (Collage) obj;
		return cid == other.cid && Objects.equals(cname, other.cname) && Objects.equals(stds, other.stds);
	}
	@Override
	public String toString() {
		return "Collage [cid=" + cid + ", cname=" + cname + ", stds=" + stds + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Std getStds() {
		return stds;
	}
	public void setStds(Std stds) {
		this.stds = stds;
	}
	
	
	
}
