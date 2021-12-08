package com.example.eshopweb.mapper;

import com.example.eshopweb.dto.ItemDto;
import com.example.eshopweb.entity.Item;

import java.util.List;

public interface AbstractMapper <ENTITY, DTO> {

    DTO toDto(ENTITY entity);
    List<DTO> toDto(List<ENTITY> list);

    ENTITY toEntity(DTO dto);
    List<ENTITY> toEntity(List<DTO> list);


}
