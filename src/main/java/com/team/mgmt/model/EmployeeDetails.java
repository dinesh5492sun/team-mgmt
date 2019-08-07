package com.team.mgmt.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({ "employeeId", "firstName", "middleName", "lastName", "email", "phone", "gender", "address", "mal",
//		"primarySkill", "proficiency" })
public class EmployeeDetails /*implements Serializable*/ {
	////@JsonProperty("employeeId")
	private Long employeeId;
	////@JsonProperty("firstName")
	private String firstName;
	//@JsonProperty("middleName")
	private String middleName;
	//@JsonProperty("lastName")
	private String lastName;
	//@JsonProperty("email")
	private String email;
	//@JsonProperty("phone")
	private String phone;
	//@JsonProperty("gender")
	private String gender;
	//@JsonProperty("address")
	private String address;
	//@JsonProperty("mal")
	private String mal;
	//@JsonProperty("primarySkill")
	private String primarySkill;
	//@JsonProperty("proficiency")
	private String proficiency;

	//@JsonProperty("employeeId")
	public Long getEmployeeId() {
		return employeeId;
	}

	//@JsonProperty("employeeId")
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	//@JsonProperty("firstName")
	public String getFirstName() {
		return firstName;
	}

	//@JsonProperty("firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//@JsonProperty("middleName")
	public String getMiddleName() {
		return middleName;
	}

	//@JsonProperty("middleName")
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	//@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}

	//@JsonProperty("lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	//@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	//@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}

	//@JsonProperty("phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}

	//@JsonProperty("gender")
	public String getGender() {
		return gender;
	}

	//@JsonProperty("gender")
	public void setGender(String gender) {
		this.gender = gender;
	}

	//@JsonProperty("address")
	public String getAddress() {
		return address;
	}

	//@JsonProperty("address")
	public void setAddress(String address) {
		this.address = address;
	}

	//@JsonProperty("mal")
	public String getMal() {
		return mal;
	}

	//@JsonProperty("mal")
	public void setMal(String mal) {
		this.mal = mal;
	}

	//@JsonProperty("primarySkill")
	public String getPrimarySkill() {
		return primarySkill;
	}

	//@JsonProperty("primarySkill")
	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	//@JsonProperty("proficiency")
	public String getProficiency() {
		return proficiency;
	}

	//@JsonProperty("proficiency")
	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}

/*	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", gender=" + gender
				+ ", address=" + address + ", mal=" + mal + ", primarySkill=" + primarySkill + ", proficiency="
				+ proficiency + "]";
	}
*/
}
