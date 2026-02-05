package edu.icet.service.serviceImpl;

import edu.icet.model.Customer;
import edu.icet.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private List<Customer> customerList = new ArrayList<>();

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerList;
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void deleteCustomer(Integer id) {

    }

}
