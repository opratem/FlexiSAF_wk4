package com.flexisaf.FlexiSAF_wk4.repository;

import com.flexisaf.FlexiSAF_wk4.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Custom query examples (optional):
    Employee findByEmail(String email);
}
