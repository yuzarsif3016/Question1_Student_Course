package com.yourcompany.admission.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String title;

    private String startDate;

    private String endDate;

    private int fees;

    @Column(name = "min_score")
    private int minScore;

    // Constructors, getters, and setters

    // Constructors
    public Course() {
    }

    public Course(String title, String startDate, String endDate, int fees, int minScore) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.fees = fees;
        this.minScore = minScore;
    }

    // Getters and Setters
    

    // equals and hashCode methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id.equals(course.id);
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getMinScore() {
		return minScore;
	}

	public void setMinScore(int minScore) {
		this.minScore = minScore;
	}

	@Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // toString method

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", fees=" + fees +
                ", minScore=" + minScore +
                '}';
    }

    // Getters and Setters

    // Other getters and setters
}
