import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee extends Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3407124019752971757L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeID;
    private String departmentName;
    @OneToOne(cascade = CascadeType.ALL)
    private Laptop laptop;
    
    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true,
            targetEntity = Contact.class,
            fetch = FetchType.LAZY)
    private List<Contact> contact; // Unidirectional Relationship
    public Employee(long employeeID, String departmentName) {
		super();
		this.employeeID = employeeID;
		this.departmentName = departmentName;
		this.laptop = laptop;
		this.contact = contact;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Contact> getContactDetails() {
		return contact;
	}
	public void setContactDetails(List<Contact> contact) {
		this.contact = contact;
	}
	//private Set<ContactDetails> contactDetails;
	public long getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", departmentName=" + departmentName + ", laptop=" + laptop + "]";
	}
    
    
}
