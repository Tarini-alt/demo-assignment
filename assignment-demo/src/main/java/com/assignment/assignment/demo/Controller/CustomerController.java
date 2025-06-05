package com.assignment.assignment.demo.Controller;

import com.assignment.assignment.demo.entity.Customer;
import com.assignment.assignment.demo.entity.dto.CustomerDto;
import com.assignment.assignment.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/get-all-customers")
    public List <Customer> getAllCustomers(){

        return this.customerService.getAllCustomers();
    }

    @RequestMapping(value = "get-customer", method = RequestMethod.POST)
    public Customer getCustomer(@RequestBody Integer customerId){
        return this.customerService.getCustomer(customerId);
    }

    @RequestMapping(value = "/save and update customer",method = RequestMethod.POST)
    public CustomerDto saveAndUpdateCustomer(@RequestBody CustomerDto customerDto){
        CustomerDto result = this.customerService.saveAndUpdateCustomer(customerDto);

        return result;
    }


}
