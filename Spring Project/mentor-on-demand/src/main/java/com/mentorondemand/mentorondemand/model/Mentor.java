package com.mentorondemand.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mentor")
public class Mentor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "contact_number")
	private long contactNumber;
	
	@Column(name = "reg_date_time")
	private String regDateTime;
	
	@Column(name = "reg_code")
	private String regCode;
	
	@Column(name = "linkedin_url")
	private String linkedinURL;
	
	@Column(name = "year_of_experience")
	private String yearOfExperience;
	
	@Column(name = "active")
	private boolean active;

	public Mentor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mentor(long id, String userName, String password, String firstName, String lastName, long contactNumber,
			String regDateTime, String regCode, String linkedinURL, String yearOfExperience) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.regDateTime = regDateTime;
		this.regCode = regCode;
		this.linkedinURL = linkedinURL;
		this.yearOfExperience = yearOfExperience;
		this.active=true;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getRegDateTime() {
		return regDateTime;
	}

	public void setRegDateTime(String regDateTime) {
		this.regDateTime = regDateTime;
	}

	public String getRegCode() {
		return regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

	public String getLinkedinURL() {
		return linkedinURL;
	}

	public void setLinkedinURL(String linkedinURL) {
		this.linkedinURL = linkedinURL;
	}

	public String getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(String yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Mentor [id=" + id + ", userName=" + userName + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", contactNumber=" + contactNumber + ", regDateTime=" + regDateTime
				+ ", regCode=" + regCode + ", linkedinURL=" + linkedinURL + ", yearOfExperience=" + yearOfExperience
				+ ", active=" + active + "]";
	}
	
}
