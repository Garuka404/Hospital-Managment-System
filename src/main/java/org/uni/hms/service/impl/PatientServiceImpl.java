package org.uni.hms.service.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.uni.hms.dto.Patient;
import org.uni.hms.entity.PatientEntity;
import org.uni.hms.repository.PatientRepository;
import org.uni.hms.service.PatientService;

@RequiredArgsConstructor
@Service
public class PatientServiceImpl implements PatientService {

  final  PatientRepository repository;
  final ModelMapper mapper;

    public void setPatient(Patient patient){
       repository.save(mapper.map(patient,PatientEntity.class));
    }
}
