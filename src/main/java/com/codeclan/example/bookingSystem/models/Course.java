package com.codeclan.example.bookingSystem.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_town")
    private String courseTown;

    @Column(name = "course_rating")
    private int courseRating;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties("course")
    @OneToMany(mappedBy = "course")
    private List<Booking> bookings;


    public Course(String courseName, String courseTown, int courseRating) {
        this.courseName = courseName;
        this.courseTown = courseTown;
        this.courseRating = courseRating;
        this.bookings = new ArrayList<>();
    }

    public Course() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTown() {
        return courseTown;
    }

    public void setCourseTown(String courseTown) {
        this.courseTown = courseTown;
    }

    public int getCourseRating() {
        return courseRating;
    }

    public void setCourseRating(int courseRating) {
        this.courseRating = courseRating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

//    public void addBooking(Booking booking){
//        this.bookings.add(booking);
//    }
}
