package com.hospital.model;

import java.time.LocalDateTime;

public class Appointment {
    private int patientId;
    private LocalDateTime dateTime;
    // Add more attributes as needed

    public Appointment(int patientId, LocalDateTime dateTime) {
        this.patientId = patientId;
        this.dateTime = dateTime;
    }

    // Getters and setters
    // ...
}
