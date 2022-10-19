package com.hector.udemy.itemservicespring.service;

import java.util.List;

import com.hector.udemy.itemservicespring.models.Item;

public interface ItemService {
    
    public List<Item> findAll();
    public Item findById(Long id, Integer cantidad);

}
