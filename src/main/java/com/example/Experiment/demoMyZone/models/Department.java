package com.example.Experiment.demoMyZone.models;


import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
public class Department {

    //Connecting layer of Hibernate with Data Base
    //That's why here our ID and AUTO.
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
