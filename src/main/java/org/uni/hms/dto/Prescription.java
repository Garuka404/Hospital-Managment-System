package org.uni.hms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Prescription {
    private Integer id;
    private String type;
    private LocalDateTime dateTime;
    private String discription;
    private String patientstatus;
    private Integer adminId;
    private Integer patientId;

}
