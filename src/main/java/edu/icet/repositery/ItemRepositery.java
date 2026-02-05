package edu.icet.repositery;

import edu.icet.model.entity.ItemEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepositery extends JpaRepository<ItemEntity, Integer> {
}
