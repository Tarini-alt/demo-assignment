package com.assignment.assignment.demo.dao;

import com.assignment.assignment.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository <Customer, Integer>{

    Customer findByCustomerId(Integer customerId);

    Customer findCustomerByGender(String gender);
}
