package com.minimarket.web.model.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer extends User {

    private String address;
    private String phoneNumber;

    // Constructors
    public Customer() {}

    public Customer(String name, String email, String password, String address, String phoneNumber) {
        super(name, email, password);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
