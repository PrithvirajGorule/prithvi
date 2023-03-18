package coreproject.MavenProject1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tblStudent")

public class Student {
	
	@Column(name="sid")
	private int sid;
	@Column(name="name")
	private String name;
	@Column(name="city")
	private String city;
	@Column(name="mail")
	private String mail;
	@Column(name="mobile")
	private String mobile;
	
	public Student() {
		super();
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
