package com.codeclan.example.bookingSystem.controllers;

import com.codeclan.example.bookingSystem.models.Course;
import com.codeclan.example.bookingSystem.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/search/findCoursesByCustomerId")
    public List<Course> findCoursesByCustomerId(@RequestParam Long id){
        return courseRepository.findCoursesByCustomerId(id);

    }

}
