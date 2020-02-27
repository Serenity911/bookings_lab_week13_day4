package com.codeclan.example.bookingSystem.repositories.CustomerRepository;

import com.codeclan.example.bookingSystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    public List<Customer> findAllCustomerByCourseId(Long id);
}
