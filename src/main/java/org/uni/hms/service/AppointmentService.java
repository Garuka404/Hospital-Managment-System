package org.uni.hms.service;

import org.uni.hms.dto.Appointment;

import java.util.List;

public interface AppointmentService {
   void setAppointment(Appointment appointment);
    void deleteAppointment(Integer id);
    List<Appointment> getALlAppointment();
    void updateAppointment(Appointment appointment);
    Appointment searchById(Integer id);
    List<Appointment> searchByAdminId(Integer id);
}
