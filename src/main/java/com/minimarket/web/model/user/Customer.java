// Customer.java
package com.minimarket.web.model.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "customers")
public class Customer extends User implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private LocalDate dateOfBirth;
    
    private String membershipNumber;
    
    private int loyaltyPoints;

    public Customer() {
        setRole(UserRole.CUSTOMER);
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(String membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }
}
