package edu.icet.service.serviceImpl;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private List<CustomerDTO> customerDTOList = new ArrayList<>();

    @Override
    public void addCustomer(CustomerDTO customerDTO) {
        customerDTOList.add(customerDTO);
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerDTOList;
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
//        Integer index = 0;
//        for (Customer customerNew: customerList){
//           if(customer.getId() == customerNew.getId()){
//               customerNew = customer;
//               customerList.set(index , customerNew);
//           }
//           index++;
//        }

        for (int i = 0; i < customerDTOList.size(); i++){
            if(customerDTOList.get(i).getId().equals(customerDTO.getId())){
                customerDTOList.set(i , customerDTO);
                break;
            }
        }
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerDTOList.remove(id);
    }

    @Override
    public CustomerDTO searchCustomer(Integer id) {
      for (CustomerDTO customerDTO : customerDTOList){
          if (customerDTO.getId().equals(id)){
              return customerDTO;
          }
      }
      return null;
    }

}
