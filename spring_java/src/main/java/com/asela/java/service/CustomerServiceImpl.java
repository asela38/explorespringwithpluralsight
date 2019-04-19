package com.asela.java.service;

import com.asela.java.model.Customer;
import com.asela.java.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
@Scope("prototype")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Value("${application.name}")
    private String applicationName;


    @Override
    public List<Customer> findAll() {
        System.out.println("applicationName = " + applicationName);

        return customerRepository.findAll();
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }
}
