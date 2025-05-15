package com.shopit.customers.service;

import com.shopit.customers.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    public List<CustomerDto> getAllCustomers();

    public CustomerDto createCustomer(CustomerDto customerDto);
}
