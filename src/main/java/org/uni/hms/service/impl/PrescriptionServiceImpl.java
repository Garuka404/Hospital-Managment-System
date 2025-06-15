package org.uni.hms.service.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.uni.hms.dto.Prescription;
import org.uni.hms.entity.PrescriptionEntity;
import org.uni.hms.repository.PrescriptionRepository;
import org.uni.hms.service.PrescriptionService;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PrescriptionServiceImpl implements PrescriptionService {
    final PrescriptionRepository repository;
    final ModelMapper mapper;

    public void setPrescription(Prescription prescription){
        repository.save(mapper.map(prescription, PrescriptionEntity.class));
    }
    public List<Prescription> getAllPrescription(){
        List<Prescription> prescriptionList=new ArrayList<>();
        repository.findAll().forEach(prescription ->{
            prescriptionList.add(mapper.map(prescription,Prescription.class));
        });
        return  prescriptionList;
    }
}
