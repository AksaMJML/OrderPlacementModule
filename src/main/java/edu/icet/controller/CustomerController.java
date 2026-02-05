package edu.icet.controller;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.service.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
@Tag(name = "Customer Controller", description = "APIs for managing customers")
public class CustomerController {

    final CustomerService service;

    @PostMapping("/add")
    public void addCustomer(@RequestBody CustomerDTO customerDTO) {
        service.addCustomer(customerDTO);
    }

    @GetMapping("/get")
    public List<CustomerDTO> getAllCustomers() {
        return service.getAllCustomers();
    }

    @PutMapping("/update")
    public void updateCustomer(@RequestBody CustomerDTO customerDTO) {
        service.updateCustomer(customerDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteCustomer(Integer id){
         service.deleteCustomer(id);
    }

    @GetMapping("/search-by-id/{id}")
    public CustomerDTO searchCustomer(@PathVariable Integer id){
      return service.searchCustomer(id);
    }

}
