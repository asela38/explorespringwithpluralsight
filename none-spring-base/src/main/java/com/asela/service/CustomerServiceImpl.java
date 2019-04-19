package com.asela.service;

import com.asela.model.Customer;
import com.asela.repository.CustomerRepository;
import com.asela.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository= new HibernateCustomerRepositoryImpl();


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
