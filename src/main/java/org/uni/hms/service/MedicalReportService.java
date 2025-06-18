package org.uni.hms.service;

import org.uni.hms.dto.MedicalReport;

import java.util.List;

public interface MedicalReportService {
    void addMedicalReport(MedicalReport report);

    List<MedicalReport> getAllMedicalReport();

    void deleteMedicalReport(Integer id);
}
