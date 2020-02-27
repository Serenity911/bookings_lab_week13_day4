package com.codeclan.example.bookingSystem.components;

import com.codeclan.example.bookingSystem.models.Booking;
import com.codeclan.example.bookingSystem.models.Course;
import com.codeclan.example.bookingSystem.models.Customer;
import com.codeclan.example.bookingSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.bookingSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.bookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("Bob", "Edinburgh", 23);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Jim", "Glasgow", 30);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Alex", "Edinburgh", 25);
        customerRepository.save(customer3);

        Course course1 = new Course("Java Programming", "Edinburgh", 4);
        courseRepository.save(course1);
        Course course2 = new Course("Js Programming", "Glasgow", 5);
        courseRepository.save(course2);

        Booking booking1 = new Booking("27-02-20", customer1, course1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("01-03-20", customer2, course1);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("01-04-20", customer3, course2);
        bookingRepository.save(booking3);

    }
}
