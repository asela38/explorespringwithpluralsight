package com.asela.repository;

import com.asela.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
