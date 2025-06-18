package org.uni.hms.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MedicalReport {
    private Integer id;
    private String category;
    private String padfSrc;
    private LocalDate dateTime;
    private Integer PtrientId;
    private Integer labNumber;


}
