package com.hospital.model;

public class Patient {
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    // Add more attributes as needed

    public Patient(int id, String name, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    // ...
}
