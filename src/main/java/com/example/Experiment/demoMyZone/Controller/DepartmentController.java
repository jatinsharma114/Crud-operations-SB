package com.example.Experiment.demoMyZone.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Experiment.demoMyZone.models.Department;
import com.example.Experiment.demoMyZone.request.DepartmentRequest;
import com.example.Experiment.demoMyZone.request.DepartmentUpdateRequest;
import com.example.Experiment.demoMyZone.service.DepartmentService;

import antlr.collections.List;

@RestController
public class DepartmentController {


    @Autowired
    DepartmentService departmentService;

    @GetMapping("/checkMePostman")
    public String checkMePostman(){
        return "It's running You can run this application!!";
    }

    //1. -----------------------------Add New Department Object in DB-----------------------------------
    @PostMapping("/department")
    public Department saveDepartment(@Valid @RequestBody DepartmentRequest departmentRequest){
        return departmentService.saveDepartment(departmentRequest.to());
    }
    //2. -------------------------------Get all stored Data---------------------------------------------
    @GetMapping("/department/alldata")
    public java.util.List<Department> getDapartmentdata(){
        return departmentService.getDepartmentData();
    }
    //3. ----------------------------Get data by passing the ID------------------------------------------
    @GetMapping("/department/id")
    public Department departmentById(@RequestParam("id") int id)    {
        return  departmentService.getById(id);
    }
    //4. ----------------------------Delete the departemnt Object------------------------------------------
    @DeleteMapping("/department/id")
    public void deleteIdOfDepartment(@RequestParam("id") int id){
        departmentService.departmentIddelete(id);
    }
    //5. --------Update an Existing Resources Or Create a Resource if not ecist ---------------------------
    @PutMapping("/department/update/{id}")
    public Department updateDepartmentData(@PathVariable("id") int depatmentId, @RequestBody DepartmentUpdateRequest departmentUpdateRequest){
        return departmentService.updateDepartment(depatmentId, departmentUpdateRequest);
    }

     //6. --------Update an Existing Resources of Some Selected file which we want only ------------------
     @PatchMapping("/department/updateFiles/{id}")
     public Department updateDeprtmentDataOfSomeFields(@PathVariable("id") int depatmentId, @RequestBody DepartmentUpdateRequest departmentUpdateRequest) {
        return departmentService.updateSomeFiledOfUser(depatmentId, departmentUpdateRequest);
     }

}
