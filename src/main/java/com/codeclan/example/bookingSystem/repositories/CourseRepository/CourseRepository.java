package com.codeclan.example.bookingSystem.repositories.CourseRepository;

import com.codeclan.example.bookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
    List<Course> findByCourseRating(int courseRating);

}
