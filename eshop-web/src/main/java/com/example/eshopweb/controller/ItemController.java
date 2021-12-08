package com.example.eshopweb.controller;

import com.example.eshopweb.dto.ItemDto;
import com.example.eshopweb.entity.Item;
import com.example.eshopweb.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/item")
public class ItemController {

    private final ItemService itemService;

    // http://localhost:8080/item
    @GetMapping
    public List<ItemDto> items() {
        return itemService.findAll();
    }

    // http://localhost:8080/item/1
    @GetMapping("/{id}")
    public Optional<ItemDto> item(@PathVariable int id) {
        return itemService.findById(id);
    }

    // http://localhost:8080/item/1
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        itemService.deleteById(id);
    }

    // http://localhost:8080/item
    @PostMapping
    public ItemDto insert(@RequestBody ItemDto dto) {
        dto.setId(0);
        return itemService.save(dto);
    }

    // http://localhost:8080/item/1
    @PutMapping("/{id}")
    public ItemDto update(@RequestBody ItemDto dto,
                          @PathVariable int id) {
//        if(!itemService.findById(id).isPresent()) {
//            throw new UnsupportedOperationException();
//        }
        dto.setId(id);
        return itemService.save(dto);
    }

}
