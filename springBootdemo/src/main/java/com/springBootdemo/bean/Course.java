package com.springBootdemo.bean;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Course")
public class Course {

	@Id
	private int courseID;
	
    private String title;
    private Date startDate;
    private Date endDate;

    public Course(int courseID, String title, Date startDate, Date endDate) {
        this.courseID = courseID;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and setters
    public int getCourseID() {
        return courseID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
