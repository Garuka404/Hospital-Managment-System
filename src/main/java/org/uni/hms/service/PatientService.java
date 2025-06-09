package org.uni.hms.service;

import org.uni.hms.dto.Patient;

import java.util.List;

public interface PatientService{
    void setPatient(Patient patient);
    List<Patient> getAllPatient();
    void updatePatient(Patient patient);
    void deletePatient(Integer id);
    Patient searchPatientById(Integer id);
    List<Patient> searchPatientByName(String name);
    List<Patient> searchPatientByNic(String nic);
    List<Patient> searchPatientByContact(String contact);
}
