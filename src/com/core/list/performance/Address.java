/**
 * 
 */
package com.core.list.performance;

/**
 * @author Prasad
 *
 */
public class Address {

	private String empId;
	private String street;
	private String pincode;
	private String state;
	private String country;

	public Address(String empId, String street, String pincode, String state, String country) {
		super();
		this.empId = empId;
		this.street = street;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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
