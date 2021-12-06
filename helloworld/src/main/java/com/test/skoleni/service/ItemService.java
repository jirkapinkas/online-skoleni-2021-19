package com.test.skoleni.service;

import com.test.skoleni.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public String getCount() {
        return "items count = " + itemRepository.count();
    }

}
