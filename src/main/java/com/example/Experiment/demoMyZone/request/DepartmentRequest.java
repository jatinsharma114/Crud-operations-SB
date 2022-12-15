package com.example.Experiment.demoMyZone.request;

import com.example.Experiment.demoMyZone.models.Department;
import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@Setter

public class DepartmentRequest {


    private int departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;


    //Values set in Models
    public String to(){

        return "";
    }
}