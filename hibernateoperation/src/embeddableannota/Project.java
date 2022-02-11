package embeddableannota;


import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Project {
  @Id
  @GeneratedValue
	private int prjid;
	private String group;
	@Embedded
	private Course course;

	public int getPrjid() {
		return prjid;
	}

	public void setPrjid(int prjid) {
		this.prjid = prjid;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Project(int prjid, String group, Course course) {
		super();
		this.prjid = prjid;
		this.group = group;
		this.course = course;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Project(Course course) {
		super();
		this.course = course;
	}

	@Override
	public String toString() {
		return "Project [prjid=" + prjid + ", group=" + group + ", course=" + course + "]";
	}
	
}
