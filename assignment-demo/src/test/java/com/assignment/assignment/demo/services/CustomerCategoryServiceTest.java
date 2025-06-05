package com.assignment.assignment.demo.services;

import com.assignment.assignment.demo.entity.CustomerCategory;
import com.assignment.assignment.demo.entity.dto.CustomerCategoryDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerCategoryServiceTest {

    @Autowired
    private CustomerCategoryService customerCategoryService;

    @Test
    void getAllCustomerCategories(){
        this.customerCategoryService.getAllCustomerCategories();
    }

    @Test
    void getCustomerCategoryById() {
        this.customerCategoryService.getCustomerCategoryById(1);
    }

    @Test
    void addCustomerCategory() {
        CustomerCategory customerCategory = new CustomerCategory();
        customerCategory.setCustomerCategoryName("Normal Customers");
        customerCategory.setStatus("ACT");

        customerCategory.setCustomerCategoryName("Neutral Customers");
        customerCategory.setStatus("ACT");

        customerCategory.setCustomerCategoryName("Non-loyal Customers");
        customerCategory.setStatus("ACT");

        customerCategory.setCustomerCategoryName("Bad Customers");
        customerCategory.setStatus("ACT");

        customerCategory.setCustomerCategoryName("No Reviews");
        customerCategory.setStatus("INACT");

        customerCategoryService.addCustomerCategory(customerCategory);
    }

    @Test
    void saveAndUpdateCustomerCategory() {
        CustomerCategoryDto catDto = new CustomerCategoryDto(11,"Local customers","ACT");
        catDto.setCustomerCategoryId(11);
        catDto.setCustomerCategoryName("Local Customers");
        catDto.setStatus("ACT");


        this.customerCategoryService.saveAndUpdateCustomerCategory(catDto);

    }
}