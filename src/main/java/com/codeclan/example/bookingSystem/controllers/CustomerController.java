package com.codeclan.example.bookingSystem.controllers;

import com.codeclan.example.bookingSystem.models.Customer;
import com.codeclan.example.bookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/search/findAllCustomerByCourseId")
    public List<Customer> findAllCustomerByCourseId(@RequestParam Long id) {
        return customerRepository.findAllCustomerByCourseId(id);
    }

    @GetMapping(value = "/search/findAllCustomersByTownByCourseId")
    public List<Customer> findAllCustomersByTownByCourseId(@RequestParam String town, @RequestParam Long id) {
        return customerRepository.findAllCustomersByTownByCourseId(town, id);
    }

    @GetMapping(value = "search/findAllCustomersOlderThanByTownByCourseId")
    public List<Customer> findAllCustomersOlderThanByTownByCourseId(@RequestParam int age, @RequestParam String town, @RequestParam Long id){
        return customerRepository.findAllCustomersOlderThanByTownByCourseId(age, town, id);
    }
}
