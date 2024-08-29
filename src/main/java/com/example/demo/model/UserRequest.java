package com.example.demo.model;
public class UserRequest {
    private String id;
    private String address;
    private String phoneNumber;

    // Constructors
    public UserRequest() {
    }

    public UserRequest(String id, String address, String phoneNumber) {
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
