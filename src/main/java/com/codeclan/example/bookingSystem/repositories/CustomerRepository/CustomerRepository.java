package com.codeclan.example.bookingSystem.repositories.CustomerRepository;

import com.codeclan.example.bookingSystem.models.Course;
import com.codeclan.example.bookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
    List<Customer> findAllCustomerByCourseId(Long id);
    List<Customer> findAllCustomersByTownByCourseId(String town, Long id);
    List<Customer> findAllCustomersOlderThanByTownByCourseId(int age, String town, Long id);

}
