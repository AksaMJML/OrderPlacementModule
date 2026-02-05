package edu.icet.service.serviceImpl;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.repositery.CustomerRepositery;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepositery repositery;
    final ModelMapper mapper;

    @Override
    public void addCustomer(CustomerDTO customerDTO) {
        repositery.save(mapper.map(customerDTO , CustomerEntity.class));
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return null;
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

//        for (int i = 0; i < customerDTOList.size(); i++){
//            if(customerDTOList.get(i).getId().equals(customerDTO.getId())){
//                customerDTOList.set(i , customerDTO);
//                break;
//            }
//        }
    }

    @Override
    public void deleteCustomer(Integer id) {

    }

    @Override
    public CustomerDTO searchCustomer(Integer id) {
      return null;
    }

}
