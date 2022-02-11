import javax.persistence.Embeddable;

@Embeddable
public class Address {
	 public String getHouseno() {
		return houseno;
	}

	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}

	public String getStreetno() {
		return streetno;
	}

	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getVillegage() {
		return villegage;
	}

	public void setVillegage(String villegage) {
		this.villegage = villegage;
	}

	public String getDistric() {
		return distric;
	}

	public void setDistric(String distric) {
		this.distric = distric;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", streetno=" + streetno + ", locality=" + locality + ", city=" + city
				+ ", villegage=" + villegage + ", distric=" + distric + ", state=" + state + ", pin=" + pin
				+ ", getHouseno()=" + getHouseno() + ", getStreetno()=" + getStreetno() + ", getLocality()="
				+ getLocality() + ", getCity()=" + getCity() + ", getVillegage()=" + getVillegage() + ", getDistric()="
				+ getDistric() + ", getState()=" + getState() + ", getPin()=" + getPin() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	private String houseno,streetno, locality, city, villegage, distric, state, pin;
}
