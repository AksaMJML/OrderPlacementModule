package edu.icet.controller;

import edu.icet.model.Item;
import edu.icet.service.ItemService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Items")
@RequiredArgsConstructor
@Tag(name = "Item Controller", description = "APIs for managing items")
public class ItemController {

    final ItemService service;

    @PostMapping("/add")
    public void addItem(Item item){
        service.addItem(item);
    }

    @GetMapping("/get-all")
    public List<Item> getAllItems(){
        return service.getAllItems();
    }
}
