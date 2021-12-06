package com.test.skoleni.service;

import com.test.skoleni.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public String getCount() {
        return "items count = " + itemRepository.count();
    }

}
