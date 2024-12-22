package com.minimarket.web.model.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "admins")
public class Admin extends User {

    private String role;

    // Constructors
    public Admin() {}

    public Admin(String name, String email, String password, String role) {
        super(name, email, password);
        this.role = role;
    }

    // Getters and Setters
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
