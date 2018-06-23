package com.jm3005.learn.hibernate.associations.onetomany.bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "JM3005_ONETOMANY_BI_COURSE")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "title")
	private String title;

	@OneToMany(mappedBy = "course", cascade = { CascadeType.ALL})
	private List<Assignment> assignments;

	public Course() {
		super();
	}

	public Course(String title) {
		super();
		this.title = title;
		this.assignments = assignments;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}
	
	public void addAssignment(Assignment assignment){
		if(assignments == null){
			assignments = new ArrayList<Assignment>();
		}
		
		assignment.setCourse(this);
		assignments.add(assignment);
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", assignments=" + assignments + "]";
	}
}
