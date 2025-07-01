package org.uni.hms.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.uni.hms.dto.Patient;
import org.uni.hms.entity.PatientEntity;
import org.uni.hms.repository.PatientRepository;
import org.uni.hms.service.PatientService;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class PatientServiceImpl implements PatientService {

    final PatientRepository repository;
    final ModelMapper mapper;

    @Override
    public void setPatient(Patient patient) {
        repository.save(mapper.map(patient, PatientEntity.class));
    }

    @Override
    public List<Patient> getAllPatient() {
        List<Patient> patientsList = new ArrayList<>();
        repository.findAll().forEach(patient -> patientsList.add(mapper.map(patient, Patient.class)));
        return patientsList;
    }

    @Override
    public void updatePatient(Patient patient) {
        repository.save(mapper.map(patient, PatientEntity.class));
    }

    public void deletePatient(Integer id) {
        repository.deleteById(id);
    }

    public Patient searchPatientById(Integer id) {
        return mapper.map(repository.findById(id),Patient.class);
    }
    public List<Patient> searchPatientByName(String name){
        List<Patient> patientsList = new ArrayList<>();
        repository.findByName(name).forEach(patient ->{
            patientsList.add(mapper.map(patient,Patient.class));
        });
        return patientsList;
    }
    public List<Patient> searchPatientByNic(String nic){
        List<Patient> patientsList = new ArrayList<>();
        repository.findByNic(nic).forEach(patient ->{
            patientsList.add(mapper.map(patient,Patient.class));
        });
        return patientsList;
    }
    public List<Patient> searchPatientByContact(String contact){
        List<Patient> patientsList = new ArrayList<>();
        repository.findByContact(contact).forEach(patient ->{
            patientsList.add(mapper.map(patient,Patient.class));
        });
        return patientsList;
    }
    public void emailSender(){
         log.info("email sended ......");
    }
}
