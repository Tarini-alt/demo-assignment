package com.assignment.assignment.demo.services;

import com.assignment.assignment.demo.dao.CustomerCategoryDao;
import com.assignment.assignment.demo.dao.CustomerDao;
import com.assignment.assignment.demo.entity.Customer;
import com.assignment.assignment.demo.entity.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private CustomerCategoryDao customerCategoryDao;

    public List<Customer> getAllCustomers(){
        List<Customer> customers = this.customerDao.findAll();

        return customers;
    }

    public Customer getCustomer(Integer customerId){
        Customer customer = this.customerDao.findByCustomerId(customerId);
        return customer;
    }
     public List<Customer> getAllMaleCustomers(){
        List<Customer> customers = this.customerDao.findAll();

        return customers;
     }

    public Customer getCustomerById(Integer customerId){
        Customer customer = this.customerDao.findByCustomerId(customerId);
        return customer;
    }

    public Customer addCustomer(Customer customer){
        Customer newCustomer = this.customerDao.saveAndFlush(customer);
        return customer;
    }

    public CustomerDto saveAndUpdateCustomer(CustomerDto customerDto){
        Customer customer = null;

        if (customerDto.getCustomerId() == null){
            customer = new Customer();
        }else {

            customer = customerDao.findByCustomerId(customerDto.getCustomerId());
        }

        customer.setCustomerCategory(customerCategoryDao.findByCustomerCategoryId(customerDto.getCustomerCategoryId()));
        customer.setCustomerName(customerDto.getCustomerName());
        customer.setMobileNumber(customerDto.getMobileNumber());
        customer.setAddress(customerDto.getAddress());
        customer.setGender(customerDto.getGender());
        customer.setStatus(customerDto.getStatus());

        customer = customerDao.saveAndFlush(customer);
        CustomerDto cusDto = new CustomerDto(customer);

        return cusDto;

    }

}
