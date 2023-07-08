package com.example.Experiment.demoMyZone.request;

import com.example.Experiment.demoMyZone.models.Department;
import lombok.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@Setter

public class DepartmentRequest {


    public int departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;


    //Values set in Modelss
    public Department to(){

        return Department.builder()
                .departmentName(departmentName)
                .departmentCode(departmentCode)
                .departmentAddress(departmentAddress)
                .build();
    }
    
}