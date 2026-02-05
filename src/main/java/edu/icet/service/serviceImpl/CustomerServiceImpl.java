package edu.icet.service.serviceImpl;

import edu.icet.model.Customer;
import edu.icet.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public void addCustomer(Customer customer) {
        customer.setId(1);
        customer.setName("Aksa");
        customer.setEmail("aksa@gmail.com");
        customer.setPhoneNumber("1234567890");
        customer.setAddress("123 Main St, City, Country");
    }

    @Override
    public String getCustomer(String name) {
        return "Aksa";
    }

    @Override
    public List<Customer> getAllCustomers() {
        return List.of(
                new Customer(1, "Aksa", "aksa@gmail.com", "1234567890", "123 Main St, City, Country")
                );
    }

}
