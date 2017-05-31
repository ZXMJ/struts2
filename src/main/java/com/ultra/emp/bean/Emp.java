package com.ultra.emp.bean;

public class Emp {

	private Integer empId;
	private String firstName;
	private String lastName;
	private String email;

	public Emp() {
	}

	public Emp(Integer empId, String firstName, String lastName, String email) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

}
