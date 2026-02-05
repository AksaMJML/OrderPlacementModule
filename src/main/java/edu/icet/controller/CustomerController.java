package edu.icet.controller;

import edu.icet.model.Customer;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/customers")
@RequiredArgsConstructor

public class CustomerController {

    final CustomerService service;

    @PostMapping("/add")
    public void addCustomer(Customer customer) {
        service.addCustomer(customer);
    }

    @GetMapping("/get")
    public List<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }

    @PutMapping("/update")
    public void updateCustomer(Customer customer) {
        service.updateCustomer(customer);
    }
}
