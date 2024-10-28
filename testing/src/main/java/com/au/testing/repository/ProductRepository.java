package com.au.testing.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.au.testing.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
//	Optional<Product> findByPanNumber(String PanNumber);
	@Query("select p from Product p where p.empPanNumber=?1")
	Optional<Product> findByPanNumber(String PanNumber);
	
//	@Query("update p from Product p set p.EmpSalary LIKE %XXX")
//	List<Product> getSalaryEmp(int salary);
}
