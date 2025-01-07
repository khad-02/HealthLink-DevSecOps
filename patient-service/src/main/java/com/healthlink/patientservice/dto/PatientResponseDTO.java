package com.healthlink.patientservice.dto;

import lombok.Data;

@Data
public class PatientResponseDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String country;
}
