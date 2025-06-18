package org.uni.hms.service.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.uni.hms.dto.MedicalReport;
import org.uni.hms.entity.MedicalReportEntity;
import org.uni.hms.repository.MedicalReportRepository;
import org.uni.hms.service.MedicalReportService;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalReportServiceImpl implements MedicalReportService {

    final ModelMapper mapper;
    final MedicalReportRepository repository;
    @Override
    public void addMedicalReport(MedicalReport report) {
           repository.save(mapper.map(report, MedicalReportEntity.class));
    }

    @Override
    public List<MedicalReport> getAllMedicalReport() {
        List<MedicalReport> reportList=new ArrayList<>();
        repository.findAll().forEach(report ->{
            reportList.add(mapper.map(report, MedicalReport.class));
        });
        return reportList;
    }

    @Override
    public void deleteMedicalReport(Integer id) {
        repository.deleteById(id);
    }
}
