package com.example.Experiment.demoMyZone.service;

import com.example.Experiment.demoMyZone.models.Department;
import com.example.Experiment.demoMyZone.repository.DepartmentRepository;
import com.example.Experiment.demoMyZone.request.DepartmentUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {


    @Autowired
    DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }


    public List<Department> getDepartmentData(){
        return  departmentRepository.findAll();
    }

    //ok
    public Department getById(int depaartmentId){
        return departmentRepository.findById(depaartmentId).orElse(null);
    }

    public void departmentIddelete(int id){
        departmentRepository.deleteById(id);

    }



    public Department updateDepartment(int depatmentId, DepartmentUpdateRequest departmentUpdateRequest) {

        //Optional -> JAVA 8
        Optional<Department> depDetails = departmentRepository.findById(depatmentId);
        System.out.println("The object from DB is here--------->  " +depDetails);

        if(!depDetails.isPresent())
        {
            System.out.println("not exist");
        }

        Department optionalObjFromDB = depDetails.get();
//---------------------------------------------------------------------
        optionalObjFromDB.setDepartmentAddress(departmentUpdateRequest.getDepartmentAddress());
        optionalObjFromDB.setDepartmentCode(departmentUpdateRequest.getDepartmentCode());
        //        Department Obj                   JSON Folate (Client Update Data)
        optionalObjFromDB.setDepartmentName(departmentUpdateRequest.getDepartmentName());

        //Saving Data again in Data-Base
        return departmentRepository.save(optionalObjFromDB);

    }
}
