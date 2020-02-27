package com.codeclan.example.bookingSystem.repositories.CustomerRepository;

import com.codeclan.example.bookingSystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> findAllCustomerByCourseId(Long id);
    List<Customer> findAllCustomersByTownByCourseId(String town, Long id);
    List<Customer> findAllCustomersOlderThanByTownByCourseId(int age, String town, Long id);
}
