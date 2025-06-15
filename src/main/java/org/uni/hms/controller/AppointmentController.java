package org.uni.hms.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.uni.hms.dto.Appointment;
import org.uni.hms.service.AppointmentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/appointment")
@CrossOrigin
@Slf4j
public class AppointmentController {

    final AppointmentService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAppointment(@RequestBody Appointment appointment){
        service.setAppointment(appointment);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateAppointment(@RequestBody Appointment appointment){
        service.updateAppointment(appointment);
    }
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteAppointment(@PathVariable Integer id){
        service.deleteAppointment(id);
    }
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Appointment> allAppointment(){
        return service.getALlAppointment();
    }
    @GetMapping("/search-by-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Appointment searchById(@PathVariable Integer id){
      return service.searchById(id);
    }
    @GetMapping("/search-by-adminId/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Appointment> searchByAdminId(@PathVariable Integer id){
        return service.searchByAdminId(id);
    }

}
