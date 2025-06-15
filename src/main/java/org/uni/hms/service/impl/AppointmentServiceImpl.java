package org.uni.hms.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.uni.hms.dto.Appointment;
import org.uni.hms.entity.AppointmentEntity;
import org.uni.hms.repository.AppointmentRepository;
import org.uni.hms.service.AppointmentService;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class AppointmentServiceImpl implements AppointmentService {

    final AppointmentRepository repository;
    final ModelMapper mapper;

    public void setAppointment(Appointment appointment){
        repository.save(mapper.map(appointment, AppointmentEntity.class));

    }
    public void deleteAppointment(Integer id){
        repository.deleteById(id);
    }
    public List<Appointment> getALlAppointment(){
        List<Appointment> appointmentList=new ArrayList<>();
        repository.findAll().forEach(appointmentEntity ->{
             appointmentList.add(mapper.map(appointmentEntity,Appointment.class));
        });
        log.info("Info level");
        return appointmentList;
    }
    public void updateAppointment(Appointment appointment){
        repository.save(mapper.map(appointment, AppointmentEntity.class));
    }
    public Appointment searchById(Integer id){
        return mapper.map(repository.findById(id), Appointment.class);
    }
    public List<Appointment> searchByAdminId(Integer id){
        List<Appointment> appointmentList=new ArrayList<>();
        repository.findByAdminId(id).forEach(appointment ->{
            appointmentList.add(mapper.map(appointment, Appointment.class));
        });
        return appointmentList;
    }
}
