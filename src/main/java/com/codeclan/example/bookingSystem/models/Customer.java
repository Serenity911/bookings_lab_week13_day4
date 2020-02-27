package com.codeclan.example.bookingSystem.models;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "customer_town")
    private String customerTown;

    @Column(name = "age")
    private int age;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Customer(String fullName, String customerTown, int age) {
        this.fullName = fullName;
        this.customerTown = customerTown;
        this.age = age;
    }

    public Customer() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTown() {
        return customerTown;
    }

    public void setTown(String town) {
        this.customerTown = town;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
