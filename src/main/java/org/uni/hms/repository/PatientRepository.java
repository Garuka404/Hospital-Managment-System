package org.uni.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uni.hms.entity.PatientEntity;

import java.util.List;

public interface PatientRepository extends JpaRepository<PatientEntity,Integer> {

    List<PatientEntity> findByName(String name);
    List<PatientEntity> findByNic(String nic);
    List<PatientEntity> findByContact(String contact);
}
