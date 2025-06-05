package com.assignment.assignment.demo.dao;

import com.assignment.assignment.demo.entity.CustomerCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerCategoryDao extends JpaRepository <CustomerCategory, Integer>{

    CustomerCategory findByCustomerCategoryId(Integer customerCategoryId);
}
