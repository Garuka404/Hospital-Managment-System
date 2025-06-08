package org.uni.hms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Patient {
    private Integer id;
    private String nic;
    private String name;
    private String address;
    private String contact;
    private String age;
    private String allergies;
    private String note;
    private String gender;
    private String bloodGroup;

}
