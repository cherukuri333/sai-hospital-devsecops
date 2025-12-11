package com.sai.hospitals.patient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @GetMapping("/patients")
    public String getPatients() {
        return "Patient list from Patient Service";
    }
}
