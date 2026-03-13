package com.example.demo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{// persist(),merge(),remove(),find()--> 1 row operation
										
	// createQuery()-->for multi row operations
@Query("select e from Employee e where e.empDesg=?1")
	public abstract List<Employee> getEmployeesByDesg(String empDesg);
@Query("select e from Employee e where e.empSal between :intialSal and :finalSal")
	public abstract List<Employee> getEmployeesBetweenSal(int intialSal, int finalSal);
}
//Repository
//Crud Repository
//Jpa Repository