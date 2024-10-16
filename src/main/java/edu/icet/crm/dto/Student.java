package edu.icet.crm.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Student {
    private String name;
    private Integer age;
    private String contactnumber;
}
