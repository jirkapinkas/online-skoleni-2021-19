package com.example.eshopweb.mapper;

import com.example.eshopweb.dto.ItemDto;
import com.example.eshopweb.entity.Item;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper extends AbstractMapper<Item, ItemDto> {

}
