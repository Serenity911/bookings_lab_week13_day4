package com.codeclan.example.bookingSystem.repositories.CourseRepository;

import com.codeclan.example.bookingSystem.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    public List<Course> findCoursesByCustomerId(Long id);
}
