package com.mybatis.service.impl;

import com.mybatis.domain.Item;
import com.mybatis.dto.ItemSearchCond;
import com.mybatis.dto.ItemUpdateDto;
import com.mybatis.mapper.ItemMapper;
import com.mybatis.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl2 implements ItemService {

    private final ItemMapper itemMapper;

    public ItemServiceImpl2(ItemMapper itemMapper) {
        this.itemMapper = itemMapper;
    }

    @Override
    public Item save(Item item) {
        itemMapper.save(item);
        return item;
    }

    @Override
    public void update(Long itemId, ItemUpdateDto updateParam) {
        itemMapper.update(itemId, updateParam);
    }

    @Override
    public Optional<Item> findById(Long id) {
        return itemMapper.findById(id);
    }

    @Override
    public List<Item> findItems(ItemSearchCond cond) {

        System.out.println("서비스 2");
        return itemMapper.findAll(cond);
    }
}