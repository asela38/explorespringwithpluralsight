package com.asela.repository;

import com.asela.model.Customer;

import java.util.Arrays;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {


    @Override
    public List<Customer> findAll() {

        Customer customer = new Customer();
        customer.setFirstName("Asela");
        customer.setLastName("Illayapparachchi");

        return Arrays.asList(customer);

    }
}
