package com.assignment.assignment.demo.entity.dto;

public class CustomerCategoryDto {

    private Integer customerCategoryId;

    private String customerCategoryName;

    private String status;

    public CustomerCategoryDto(Integer customerCategoryId, String customerCategoryName, String status) {
        this.customerCategoryId = customerCategoryId;
        this.customerCategoryName = customerCategoryName;
        this.status = status;
    }

    public Integer getCustomerCategoryId() {
        return customerCategoryId;
    }

    public void setCustomerCategoryId(Integer customerCategoryId) {
        this.customerCategoryId = customerCategoryId;
    }

    public String getCustomerCategoryName() {
        return customerCategoryName;
    }

    public void setCustomerCategoryName(String customerCategoryName) {
        this.customerCategoryName = customerCategoryName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
