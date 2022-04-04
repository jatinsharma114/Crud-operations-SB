package com.example.Experiment.demoMyZone.repository;

import com.example.Experiment.demoMyZone.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
