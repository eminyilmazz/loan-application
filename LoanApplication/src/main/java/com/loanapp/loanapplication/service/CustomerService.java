package com.loanapp.loanapplication.service;

import com.loanapp.loanapplication.model.Customer;
import com.loanapp.loanapplication.model.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    List<Customer> getAll();

    Customer getByTckn(Long tckn);

    Customer addCustomer(CustomerDto customerDto);

    Customer updateCustomer(CustomerDto customerDto);

    boolean deleteCustomer(Long tckn);

    boolean existById(Long tckn);
}
