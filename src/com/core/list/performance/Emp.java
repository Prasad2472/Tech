package com.core.list.performance;

public class Emp {

	private String empId;
	private String firstname;
	private String lastname;

	public Emp(String empId, String firstname, String lastname) {
		super();
		this.empId = empId;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (String.class == obj.getClass())
			if (!empId.equals(obj))
				return false;
		return true;
	}
}
