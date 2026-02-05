package edu.icet.service.serviceImpl;

import edu.icet.model.Item;
import edu.icet.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    final List<Item> itemList = new ArrayList<>();

    @Override
    public void addItem(Item item) {
        itemList.add(item);
    }

    @Override
    public void updateItem(Item item) {

    }

    @Override
    public void deleteItem(Integer id) {

    }

    @Override
    public List<Item> getAllItems() {
        return itemList;
    }

    @Override
    public Item searchItem(Integer id) {
        return null;
    }
}
