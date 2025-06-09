package org.uni.hms.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.uni.hms.dto.Patient;
import org.uni.hms.service.PatientService;

import java.util.List;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class PatientController{

    final PatientService service;

    @GetMapping("/all")
    public List<Patient> allPatient(){
        return  service.getAllPatient();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void savePatient(@RequestBody Patient patient){
        service.setPatient(patient);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void updatePatient(@RequestBody Patient patient){
        service.updatePatient(patient);
    }
    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletePatient(@PathVariable Integer id){
        service.deletePatient(id);
    }
    @GetMapping("/search-by-id/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public  Patient searchById(@PathVariable Integer id){
        return  service.searchPatientById(id);
    }
    @GetMapping("/search-by-name/{name}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Patient> searchPatientByName(@PathVariable String name){
        return service.searchPatientByName(name);
    }
    @GetMapping("/search-by-nic/{nic}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Patient> searchPatientByNic(@PathVariable String nic){
        return service.searchPatientByNic(nic);
    }
    @GetMapping("/search-by-contact/{contact}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Patient> searchPatientByContact(@PathVariable String contact){
        return service.searchPatientByContact(contact);
    }

}
