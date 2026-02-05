package edu.icet.service;

import edu.icet.model.Customer;

import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);
    String getCustomer(String name);
    List<Customer> getAllCustomers();
}
