package com.shopit.customers.service.impl;

import com.shopit.customers.dto.CustomerDto;
import com.shopit.customers.model.Customer;
import com.shopit.customers.repository.CustomerRepository;
import com.shopit.customers.service.CustomerService;
import com.shopit.customers.utility.CustomerUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<CustomerDto> getAllCustomers() {
        List<Customer> customerList = customerRepository.findAll();

        return CustomerUtility.convertToDTOFromCustomer(customerList);
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        CustomerUtility.validateCustomerForCreation(customerDto);
        Customer customer = CustomerUtility.convertToCustomerFromDTO(customerDto);
        Customer dbCustomer = customerRepository.save(customer);

        return CustomerUtility.convertToDTOFromCustomer(dbCustomer);
    }
}
