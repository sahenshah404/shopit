package com.shopit.customers.utility;

import com.shopit.customers.dto.CustomerDto;
import com.shopit.customers.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerUtility {

    public static void validateCustomerForCreation(CustomerDto customer) {
        if(CommonUtil.isEmpty(customer.getName())) {
            // throw exception
        }
    }

    public  static Customer convertToCustomerFromDTO(CustomerDto dto) {
        Customer customer = new Customer();
        customer.setName(dto.getName());
        customer.setEmail(dto.getEmail());
        customer.setMobile(dto.getMobile());
        return customer;
    }

    public static CustomerDto convertToDTOFromCustomer(Customer customer) {
        CustomerDto dto = new CustomerDto();
        dto.setEmail(customer.getEmail());
        dto.setMobile(customer.getMobile());
        dto.setEmail(customer.getEmail());
        return dto;
    }

    public static List<CustomerDto> convertToDTOFromCustomer(List<Customer> customerList) {
        List<CustomerDto> dtoList = new ArrayList<>();
        for (Customer customer: customerList) {
            dtoList.add(convertToDTOFromCustomer(customer));
        }
        return  dtoList;
    }

}
