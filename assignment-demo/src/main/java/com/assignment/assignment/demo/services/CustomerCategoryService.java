package com.assignment.assignment.demo.services;

import com.assignment.assignment.demo.dao.CustomerCategoryDao;
import com.assignment.assignment.demo.entity.CustomerCategory;
import com.assignment.assignment.demo.entity.dto.CustomerCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerCategoryService {

    @Autowired
    private CustomerCategoryDao customerCategoryDao;

    public List <CustomerCategory> getAllCustomerCategories(){
        List <CustomerCategory> customerCategories = this.customerCategoryDao.findAll();

        return customerCategories;
    }

    public CustomerCategory addCustomerCategory(CustomerCategory customerCategory){
        CustomerCategory newCustomerCategory = this.customerCategoryDao.saveAndFlush(customerCategory);

        return newCustomerCategory;
    }
    public CustomerCategory getCustomerCategoryById(Integer customerCategoryId){
        CustomerCategory customerCategory = this.customerCategoryDao.findByCustomerCategoryId(customerCategoryId);

        return customerCategory;
    }

    public void saveAndUpdateCustomerCategory(CustomerCategoryDto customerCategoryDto){
        CustomerCategory customerCategory = null;

        if (customerCategoryDto.getCustomerCategoryId() == null){
            customerCategory = new CustomerCategory();
        }else {
            customerCategory = customerCategoryDao.findByCustomerCategoryId(customerCategoryDto.getCustomerCategoryId());
        }

        customerCategory.setCustomerCategoryName(customerCategoryDto.getCustomerCategoryName());
        customerCategory.setStatus(customerCategoryDto.getStatus());

        customerCategoryDao.saveAndFlush(customerCategory);
    }
}


