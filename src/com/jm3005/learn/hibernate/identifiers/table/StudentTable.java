package com.jm3005.learn.hibernate.identifiers.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "HFW_STUDENT_TABLE")
public class StudentTable {

	@Id
	@GeneratedValue(generator = "abc", strategy = GenerationType.TABLE)
	@TableGenerator(name = "abc", 
	table = "HFW_ID_GENERATOR", 
	pkColumnName = "sequence_name", 
	valueColumnName = "NEXT_VAL", 
	pkColumnValue = "ROLL_NUMBER_TABLE_SEQ", 
	allocationSize = 1)
	@Column(name = "roll_number")
	private long rollNumber;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "mobile")
	private String mobile;

	@Column(name = "address")
	private String address;

	public StudentTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentTable(String name, String email, String mobile, String address) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}

	public long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(long rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", address=" + address + "]";
	}

}
