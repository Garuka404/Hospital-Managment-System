package org.uni.hms.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uni.hms.dto.Patient;
import org.uni.hms.service.PatientService;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class PatientController{

    final PatientService service;

    @PostMapping("/save")
    public void savePatient(@RequestBody Patient patient){
        service.setPatient(patient);
    }
}
