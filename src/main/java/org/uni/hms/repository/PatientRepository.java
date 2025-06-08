package org.uni.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uni.hms.entity.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity,Integer> {
}
