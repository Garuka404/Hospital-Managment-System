package org.uni.hms.service;

import org.uni.hms.dto.Prescription;

import java.util.List;

public interface PrescriptionService {
    void setPrescription(Prescription prescription);
    List<Prescription> getAllPrescription();
}
