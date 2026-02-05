package edu.icet.service;

import edu.icet.model.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void addCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> getAllCustomers();
    void updateCustomer(CustomerDTO customerDTO);
    void deleteCustomer(Integer id);
    CustomerDTO searchCustomer(Integer id);
}
