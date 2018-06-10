package com.jm3005.learn.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JM3005_STUDENT_AUTO")
public class StudentAuto {

	@Id
	@Column(name = "roll_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long rollNo;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "percentage")
	private Double percentage;

	public Long getRollNo() {
		return rollNo;
	}

	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "StudentAuto [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", percentage=" + percentage + "]";
	}

	public StudentAuto() {
		super();
	}

	public StudentAuto(String name, int age, Double percentage) {
		super();
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}
}
