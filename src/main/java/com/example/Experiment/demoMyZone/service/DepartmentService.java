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

        if (depDetails.isPresent())  {
               Department optionalObjFromDB = depDetails.get();
               
               optionalObjFromDB.setDepartmentAddress(departmentUpdateRequest.getDepartmentAddress());
               optionalObjFromDB.setDepartmentCode(departmentUpdateRequest.getDepartmentCode());
               optionalObjFromDB.setDepartmentName(departmentUpdateRequest.getDepartmentName());
               System.out.println("Saving object after modify : " + optionalObjFromDB.toString());
               return departmentRepository.save(optionalObjFromDB);
            }
        return null;
    }


    //Here we are just updating the particular Data Which User want to Update.
    //Selected Fileds by the User.
    public Department updateSomeFiledOfUser(int departmentId, DepartmentUpdateRequest departmentUpdateRequest) {
        Optional<Department> depDetails = departmentRepository.findById(departmentId);
    
        if (depDetails.isPresent()) {
            Department optionalObjFromDB = depDetails.get();
            System.out.println("Fetch the object from the DB :: " + optionalObjFromDB);
    

            //Avoid Unnecessary Calls so store the value in the Object.
            String departmentAddress = departmentUpdateRequest.getDepartmentAddress();
            if(departmentAddress != null) {
                optionalObjFromDB.setDepartmentAddress(departmentAddress);
            }
 
            String departmentCode= departmentUpdateRequest.getDepartmentCode();
            if(departmentCode != null) {
                optionalObjFromDB.setDepartmentCode(departmentCode);
            }
            
            String departmentName = departmentUpdateRequest.getDepartmentName();
            if(departmentName != null) {
                optionalObjFromDB.setDepartmentName(departmentName);
            }
    
            System.out.println("Saving object after modify: " + optionalObjFromDB.toString());
            return departmentRepository.save(optionalObjFromDB);
        }
    
        return null;
    }    
}
