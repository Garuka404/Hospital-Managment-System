package org.uni.hms.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.uni.hms.dto.MedicalReport;
import org.uni.hms.service.MedicalReportService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/medical-report")
public class MedicalReportController {

    final MedicalReportService service;

    @PostMapping("/add-report")
    public void addMedicalReport(@RequestBody MedicalReport report){
        service.addMedicalReport(report);
    }
    @GetMapping("/get-all")
    public List<MedicalReport> getAllMedicalReport(){
        return service.getAllMedicalReport();
    }
    @DeleteMapping("/delete-report/{id}")
    public void deleteMedicalReport(@PathVariable Integer id){
        service.deleteMedicalReport(id);
    }
}
