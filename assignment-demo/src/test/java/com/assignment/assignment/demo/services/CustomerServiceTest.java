package com.assignment.assignment.demo.services;

import com.assignment.assignment.demo.entity.Customer;
import com.assignment.assignment.demo.entity.CustomerCategory;
import com.assignment.assignment.demo.entity.dto.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;

    @Test
    void getAllCustomers() {
        this.customerService.getAllCustomers();
    }

    @Test
    void getCustomerById() {
        this.customerService.getCustomerById(4);
    }

    @Test
    void addCustomer() {
        Customer customer = new Customer();
        customer.setCustomerName("Dasun Chamara");
        customer.setMobileNumber(0753454123);
        customer.setAddress("No.23, Queen's road, Mathara");
        customer.setGender("Male");
        customer.setStatus("ACT");

        customer.setCustomerName("Nipuni Amaya");
        customer.setMobileNumber(0724567577);
        customer.setAddress("No90/8, Krgalle road, Kegalle");
        customer.setGender("Female");
        customer.setStatus("ACT");

        customer.setCustomerName("Sajith");
        customer.setMobileNumber(076546545);
        customer.setAddress("No.23, Kandy Road, Colombo");
        customer.setGender("Male");
        customer.setStatus("ACT");

        customer.setCustomerName("Nimali Sachinika");
        customer.setMobileNumber(0774035335);
        customer.setAddress("No.12, Vauniya road, Mihinthale");
        customer.setGender("Female");
        customer.setStatus("ACT");

        customer.setCustomerName("Kamani Perera");
        customer.setMobileNumber(0763554770);
        customer.setAddress("No.88, upper province, Kandy");
        customer.setGender("Female");
        customer.setStatus("ACT");

        customer.setCustomerName("Udari Sadunika");
        customer.setMobileNumber(0754576770);
        customer.setAddress("No.87, Galle road, Galle");
        customer.setGender("Female");
        customer.setStatus("ACT");

        customer.setCustomerName("Sadun Chamara");
        customer.setMobileNumber(0776554567);
        customer.setAddress("N0.12, Peradeniya road, Kandy");
        customer.setGender("Male");
        customer.setStatus("ACT");


        customerService.addCustomer(customer);


    }
    @Test
    void saveAndUpdateCustomer() {
        CustomerDto cusDto = new CustomerDto();
        cusDto.setCustomerId(4);
        cusDto.setCustomerName("Kasun Kumara");
        cusDto.setMobileNumber(0752234765);
        cusDto.setAddress("No.101, Nugegoda");
        cusDto.setGender("Male");
        cusDto.setStatus("ACT");
        cusDto.setCustomerCategoryId(2);

        this.customerService.saveAndUpdateCustomer(cusDto);
    }

    @Test
    void getAllMaleCustomers() {
        this.customerService.getAllMaleCustomers();
    }
}