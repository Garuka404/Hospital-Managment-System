package org.uni.hms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "appointment")
public class AppointmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String qr;
    private Integer roomNumber;
    private Integer q_Number;
    private String status;
    private String discription;
    private String type;
    private LocalDateTime dateTime;
    private Integer patientId;
    private Integer adminId;
}