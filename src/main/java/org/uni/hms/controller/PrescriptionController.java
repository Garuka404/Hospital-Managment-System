package org.uni.hms.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.uni.hms.dto.Prescription;
import org.uni.hms.service.PrescriptionService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/prescription")
public class PrescriptionController {

    final PrescriptionService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void savePrescription(@RequestBody Prescription prescription){
        service.setPrescription(prescription);
    }
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Prescription>getAllPrescription(){
        return service.getAllPrescription();
    }
}
