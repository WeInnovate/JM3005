package com.jm3005.learn.hibernate.associations.onetomany.bi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JM3005_ONETOMANY_BI_ASSIGNMENT")
public class Assignment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "description")
	private String description;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "course_id")
	private Course course;

	public Assignment() {
		super();
	}

	public Assignment(String description) {
		super();
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Assignment [id=" + id + ", description=" + description + "]";
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	/*@Override
	public String toString() {
		return "Assignment [id=" + id + ", description=" + description + ", course=" + course + "]";
	}*/
}
