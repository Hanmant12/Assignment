import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String phone, email;
    private Long cid;
    public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
   
	
}
