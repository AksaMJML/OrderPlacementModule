package edu.icet.controller;

import edu.icet.model.Item;
import edu.icet.service.ItemService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Items")
@RequiredArgsConstructor
@Tag(name = "Item Controller", description = "APIs for managing items")
public class ItemController {

    final ItemService service;

    @PostMapping("/add")
    public void addItem(@RequestBody Item item){
        service.addItem(item);
    }

    @GetMapping("/get-all")
    public List<Item> getAllItems(){
        return service.getAllItems();
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteItem(@PathVariable Integer id){
        service.deleteItem(id);
    }

    @GetMapping("/search")
    public Item searchItem(Integer id){
        return service.searchItem(id);
    }
}
