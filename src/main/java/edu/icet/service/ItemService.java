package edu.icet.service;

import edu.icet.model.dto.ItemDTO;

import java.util.List;

public interface ItemService {
    void addItem(ItemDTO itemDTO);
    void updateItem(ItemDTO itemDTO);
    void deleteItem(Integer id);
    List<ItemDTO> getAllItems();
    ItemDTO searchItem(Integer id);



}
