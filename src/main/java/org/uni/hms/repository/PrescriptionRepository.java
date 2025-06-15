package org.uni.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uni.hms.entity.PrescriptionEntity;

public interface PrescriptionRepository extends JpaRepository<PrescriptionEntity,Integer> {
}
