package com.example.Experiment.demoMyZone.request;


import com.example.Experiment.demoMyZone.models.Department;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class DepartmentUpdateRequest {


    private int departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;


    //Values set in Models
    public String to(){

        return "";
    }





}
