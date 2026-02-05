package edu.icet.controller;

import edu.icet.model.Customer;
import edu.icet.service.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
@Tag(name = "Customer Controller", description = "APIs for managing customers")
public class CustomerController {

    final CustomerService service;

    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer) {
        service.addCustomer(customer);
    }

    @GetMapping("/get")
    public List<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }

    @PutMapping("/update")
    public void updateCustomer(@RequestBody Customer customer) {
        service.updateCustomer(customer);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteCustomer(Integer id){
         service.deleteCustomer(id);
    }

    @GetMapping("/search-by-id/{id}")
    public Customer searchCustomer(Integer id){
      return service.searchCustomer(id);
    }

}
