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
//        Integer index = 0;
//        for (Customer customerNew: customerList){
//           if(customer.getId() == customerNew.getId()){
//               customerNew = customer;
//               customerList.set(index , customerNew);
//           }
//           index++;
//        }

        for (int i=0; i < customerList.size(); i++){
            if(customerList.get(i).getId().equals(customer.getId())){
                customerList.set(i , customer);
                break;
            }
        }
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerList.remove(id);
    }

    @Override
    public Customer searchCustomer(Integer id) {
      for (Customer customer : customerList){
          if (customer.getId().equals(id)){
              return customer;
          }
      }
      return null;
    }

}
