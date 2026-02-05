package edu.icet.service.serviceImpl;

import edu.icet.model.dto.ItemDTO;
import edu.icet.model.entity.ItemEntity;
import edu.icet.repositery.ItemRepositery;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ItemServiceImpl implements ItemService {

    final ItemRepositery repositery;
    final ModelMapper mapper;

    @Override
    public void addItem(ItemDTO itemDTO) {
        repositery.save(mapper.map(itemDTO , ItemEntity.class));
    }

    @Override
    public void updateItem(ItemDTO itemDTO) {
        repositery.save(mapper.map(itemDTO , ItemEntity.class));
    }

    @Override
    public void deleteItem(Integer id) {
        repositery.deleteById(id);
    }

    @Override
    public List<ItemDTO> getAllItems() {
        return itemDTOList;
    }

    @Override
    public ItemDTO searchItem(Integer id) {
        ItemEntity itemEntity = repositery.findById(id).get();
        ItemDTO itemDTO = mapper.map(itemEntity, ItemDTO.class);
        return itemDTO;
    }
}
