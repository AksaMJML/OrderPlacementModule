package edu.icet.service.serviceImpl;

import edu.icet.model.dto.ItemDTO;
import edu.icet.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    final List<ItemDTO> itemDTOList = new ArrayList<>();

    @Override
    public void addItem(ItemDTO itemDTO) {
        itemDTOList.add(itemDTO);
    }

    @Override
    public void updateItem(ItemDTO itemDTO) {
        for (int i = 0; i < itemDTOList.size(); i++){
            if (itemDTOList.get(i).getId().equals(itemDTO.getId()));
            itemDTOList.set(i , itemDTO);
            break;
        }
    }

    @Override
    public void deleteItem(Integer id) {
        itemDTOList.remove(id);
    }

    @Override
    public List<ItemDTO> getAllItems() {
        return itemDTOList;
    }

    @Override
    public ItemDTO searchItem(Integer id) {
        for (ItemDTO itemDTO : itemDTOList){
            if (itemDTO.getId().equals(id)){
                return itemDTO;
            }
        }
        return null;
    }
}
