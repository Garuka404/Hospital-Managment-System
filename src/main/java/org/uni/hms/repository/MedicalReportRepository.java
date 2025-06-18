package org.uni.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uni.hms.entity.MedicalReportEntity;

public interface MedicalReportRepository extends JpaRepository<MedicalReportEntity,Integer>{
}
