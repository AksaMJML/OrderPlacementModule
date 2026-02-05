package edu.icet.service;

import edu.icet.model.Customer;

import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);
    List<Customer> getAllCustomers();
    void updateCustomer(Customer customer);
    void deleteCustomer(Integer id);
    Customer searchCustomer(Integer id);
}
