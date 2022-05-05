package com.codegym.md4springbootcmsth.repository;

import com.codegym.md4springbootcmsth.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Long> {
}
