package coreproject.MavenProject1;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
@Entity
@Table(name="tblemployee")


public class Employee {
@Column(name="eid")
private int eid;
@Column(name="fName")
private String fName;
@Column(name="lName")
private String lName;
@Column(name="salary")
private float salary;
@Column(name="doj")
private Date  doj;
@Column(name="city")
private String city;
@Column(name="dept")
private String dept;

public Employee() {
	super();
}

public int getEid() {
	return eid;
}

public void setEid(int eid) {
	this.eid = eid;
}

public String getfName() {
	return fName;
}

public void setfName(String fName) {
	this.fName = fName;
}

public String getlName() {
	return lName;
}

public void setlName(String lName) {
	this.lName = lName;
}

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}

public Date getDoj() {
	return doj;
}

public void setDoj(Date doj) {
	this.doj = doj;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}
}
