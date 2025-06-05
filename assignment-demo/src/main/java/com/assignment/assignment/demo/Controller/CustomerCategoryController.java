package com.assignment.assignment.demo.Controller;

import com.assignment.assignment.demo.entity.CustomerCategory;
import com.assignment.assignment.demo.services.CustomerCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerCategoryController {

    @Autowired
    private CustomerCategoryService customerCategoryService;

    @RequestMapping("/get-all-categories")
   public List <CustomerCategory> getAllCustomerCategories(){
       return this.customerCategoryService.getAllCustomerCategories();
   }

   @RequestMapping(value = "get customer category", method = RequestMethod.POST)
   public CustomerCategory getCustomerCategories(@RequestBody Integer CustomerCategoryID){
        return this.customerCategoryService.getCustomerCategoryById(CustomerCategoryID);
   }
}
