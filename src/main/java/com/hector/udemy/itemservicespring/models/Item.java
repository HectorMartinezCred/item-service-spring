package com.hector.udemy.itemservicespring.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private Product product;
    private Integer amount;

    public Double getTotal(){
        return product.getPrice() * amount.doubleValue();
    }
    
}
