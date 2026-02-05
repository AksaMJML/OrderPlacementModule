package edu.icet.repositery;

import edu.icet.model.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositery extends JpaRepository<CustomerEntity, Integer> {
}
