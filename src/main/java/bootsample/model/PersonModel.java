package bootsample.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="person_tbl")
public class PersonModel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String fname;
	private String lname;
	private String course;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_enrolled;
	
	public PersonModel(){}
	
	public PersonModel(String fname, String lname, String course, Date enrolledDate) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.course = course;
		this.date_enrolled = enrolledDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Date getEnrolledDate() {
		return date_enrolled;
	}
	public void setEnrolledDate(Date enrolledDate) {
		this.date_enrolled = enrolledDate;
	}
	
	
	@Override
	public String toString() {
		return "PersonModel [id=" + id + ", fname=" + fname + ", lname=" + lname + ", course=" + course
				+ ", enrolledDate=" + date_enrolled + "]";
	}
	
	
}



