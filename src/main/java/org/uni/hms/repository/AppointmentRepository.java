package org.uni.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uni.hms.entity.AppointmentEntity;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity,Integer> {
    List<AppointmentEntity> findByAdminId(Integer id);
}
