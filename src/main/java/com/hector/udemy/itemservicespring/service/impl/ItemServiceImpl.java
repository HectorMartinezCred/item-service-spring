package com.hector.udemy.itemservicespring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hector.udemy.itemservicespring.models.Item;
import com.hector.udemy.itemservicespring.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private RestTemplate restClient;

    @Override
    public List<Item> findAll() {
        return null;
    }

    @Override
    public Item findById(Long id, Integer cantidad) {
        return null;
    }
    
}
