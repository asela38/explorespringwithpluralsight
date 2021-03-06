package com.asela.java.repository;

import com.asela.java.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;


@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {


    @Override
    public List<Customer> findAll() {

        Customer customer = new Customer();
        customer.setFirstName("Asela");
        customer.setLastName("Illayapparachchi");

        return Arrays.asList(customer);

    }
}
