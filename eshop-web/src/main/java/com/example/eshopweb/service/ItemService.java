package com.example.eshopweb.service;

import com.example.eshopweb.dto.ItemDto;
import com.example.eshopweb.entity.Item;
import com.example.eshopweb.mapper.ItemMapper;
import com.example.eshopweb.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ItemService {

    private final ItemRepository itemRepository;

    private final ItemMapper itemMapper;

    public List<ItemDto> findAll() {
        return itemMapper.toDto(itemRepository.findAll());
    }

    public Optional<ItemDto> findById(int id) {
        return itemRepository.findById(id)
                .map(itemMapper::toDto);
    }

}
