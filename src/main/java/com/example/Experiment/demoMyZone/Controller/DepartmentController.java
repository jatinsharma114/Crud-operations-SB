package com.example.Experiment.demoMyZone.Controller;



public class DepartmentController {


    @Autowired
    DepartmentService departmentService;


    //1. -------------------------------------------------------------------------------------------------
    @PostMapping("/department")
    public Department saveDepartment(@Valid @RequestBody DepartmentRequest departmentRequest){
        return departmentService.saveDepartment(departmentRequest.to());
        
    }
    //2. -------------------------------------------------------------------------------------------------
    @GetMapping("/department/alldata")
    public List<Department> getDapartmentdata(){
        return departmentService.getDepartmentData();
    }
    //3. -------------------------------------------------------------------------------------------------
    @GetMapping("/department/id")
    public Department departmentById(@RequestParam("id") int id){
        return  departmentService.getById(id);
    }
    //4. -------------------------------------------------------------------------------------------------
    @DeleteMapping("/department/id")
    public void deleteIdOfDepartment(@RequestParam("id") int id){
        departmentService.departmentIddelete(id);
    }
    //5. -------------------------------------------------------------------------------------------------
    @PutMapping("/department/update/{id}")
    public Department updateDepartmentData(@PathVariable("id") int depatmentId, @RequestBody DepartmentUpdateRequest departmentUpdateRequest){

        return departmentService.updateDepartment(depatmentId, departmentUpdateRequest);
    }



}
