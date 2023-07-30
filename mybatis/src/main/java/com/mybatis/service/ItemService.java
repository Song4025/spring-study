package com.mybatis.service;

import com.mybatis.domain.Item;
import com.mybatis.dto.ItemSearchCond;
import com.mybatis.dto.ItemUpdateDto;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    Item save(Item item);

    void update(Long itemId, ItemUpdateDto updateParam);

    Optional<Item> findById(Long id);

    List<Item> findItems(ItemSearchCond itemSearch);
}