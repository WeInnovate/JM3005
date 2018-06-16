package com.jm3005.learn.hibernate.associations.onetoone.bi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JM3005_CAR_DETAIL")
public class CarDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "color")
	private String color;

	@Column(name = "mileAge")
	private double mileAge;

	@Column(name = "abs")
	private boolean abs;

	@OneToOne(mappedBy = "carDetail", cascade=CascadeType.ALL)
	private Car car;

	public CarDetail() {

	}

	public CarDetail(String color, double mileAge, boolean abs) {
		super();
		this.id = id;
		this.color = color;
		this.mileAge = mileAge;
		this.abs = abs;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMileAge() {
		return mileAge;
	}

	public void setMileAge(double mileAge) {
		this.mileAge = mileAge;
	}

	public boolean isAbs() {
		return abs;
	}

	public void setAbs(boolean abs) {
		this.abs = abs;
	}

	@Override
	public String toString() {
		return "CarDetail [id=" + id + ", color=" + color + ", mileAge=" + mileAge + ", abs=" + abs + "]";
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
