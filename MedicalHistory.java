package com.hospital.model;

public class MedicalHistory {
    private int patientId;
    private String diagnosis;
    private String treatment;
    // Add more attributes as needed

    public MedicalHistory(int patientId, String diagnosis, String treatment) {
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    // Getters and setters
    // ...
}
