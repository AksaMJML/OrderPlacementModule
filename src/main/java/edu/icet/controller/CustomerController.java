package edu.icet.controller;

import edu.icet.model.Customer;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    final CustomerService service;

    @GetMapping("get-customer-name")
    public String getCustomer(String name) {
        return service.getCustomer(name);
    }

    @GetMapping("get-all-customers")
    public List<Customer> getAllCustomers() {
        return getAllCustomers();
    }
}
