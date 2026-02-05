package edu.icet.controller;

import edu.icet.model.dto.ItemDTO;
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
    public void addItem(@RequestBody ItemDTO itemDTO){
        service.addItem(itemDTO);
    }

    @GetMapping("/get-all")
    public List<ItemDTO> getAllItems(){
        return service.getAllItems();
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteItem(@PathVariable Integer id){
        service.deleteItem(id);
    }

    @GetMapping("/search-by-id/{id}")
    public ItemDTO searchItem(@PathVariable Integer id){
        return service.searchItem(id);
    }
}
