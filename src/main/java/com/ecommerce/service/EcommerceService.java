package com.ecommerce.service;

import com.ecommerce.dao.EcommerceDao;
import com.ecommerce.model.Item;
//import com.ecommerce.model.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EcommerceService {
    @Autowired
    EcommerceDao ecommerceDao;

    public ResponseEntity<List<Item>> getAllItems(double price) {
        Sort sortByRating = Sort.by(Sort.Direction.DESC, "rating");
        List<Item> items = ecommerceDao.findAll(sortByRating);
        List<Item> newitems = new ArrayList<>();
        for (Item item : items) {//10
        if(item.getPrice()>price){
            newitems.add(item);
        }
        }
        return new ResponseEntity<>(newitems, HttpStatus.OK);
    }

    public ResponseEntity<String> addItem(Item items) {
       ecommerceDao.save(items);
        return new ResponseEntity<>("success", HttpStatus.OK);

    }
}
