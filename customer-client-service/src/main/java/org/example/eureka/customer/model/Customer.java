package org.example.eureka.customer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A simple model class
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {

    /**
     * Customer Identification Number
     */
    private int id;

    /**
     * First name
     */
    private String firstName;

    /**
     * Last Name
     */
    private String lastName;

    public Customer() {
        //intentionally empty
    }

    public Customer(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}