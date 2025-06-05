package com.assignment.assignment.demo.entity.dto;

import com.assignment.assignment.demo.entity.Customer;

public class CustomerDto {

    private Integer customerId;

    private Integer customerCategoryId;

    private String customerName;

    private Integer mobileNumber;

    private String address;

    private String gender;

    private String status;

    public CustomerDto(){

    }

    public CustomerDto(Customer customer) {
        this.customerId = customer.getCustomerId();
        if (customer.getCustomerCategory()!=null) {
            this.customerCategoryId = customer.getCustomerCategory().getCustomerCategoryId();
        }
        this.customerName = customer.getCustomerName();
        this.mobileNumber = customer.getMobileNumber();
        this.address =customer.getAddress();
        this.gender = customer.getGender();
        this.status = customer.getStatus();
    }


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCustomerCategoryId() {
        return customerCategoryId;
    }

    public void setCustomerCategoryId(Integer customerCategoryId) {
        this.customerCategoryId = customerCategoryId;
    }

}
