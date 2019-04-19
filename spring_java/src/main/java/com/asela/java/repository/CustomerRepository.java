package com.asela.java.repository;

import com.asela.java.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
