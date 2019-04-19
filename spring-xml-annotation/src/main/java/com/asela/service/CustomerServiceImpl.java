package com.asela.service;

import com.asela.model.Customer;
import com.asela.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {


    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("Constructor: customerRepository = " + customerRepository);
        this.customerRepository = customerRepository;
    }


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

   //  @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Setter customerRepository = " + customerRepository);
        this.customerRepository = customerRepository;
    }
}
