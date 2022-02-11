import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.annotations.Columns;

//import org.hibernate.annotations.Entity;


@Entity
public class Laptop {
	@Id
	@GeneratedValue()
	private int lid;
	//@Column(name="CPU")
	
    private String cpu;
	// @Column(name="harddisk",length=66,insertable=true, updatable=true)
	 private String hdd, ram;
	 @Version
	 private int version;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + "]";
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpu, hdd, lid, ram);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(cpu, other.cpu) && Objects.equals(hdd, other.hdd) && lid == other.lid
				&& Objects.equals(ram, other.ram);
	}
}
