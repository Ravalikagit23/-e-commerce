package com.ecommerce.controller;

import com.ecommerce.model.Item;
import com.ecommerce.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EcommerceController {

    @Autowired
    EcommerceService ecommerceService;

    @GetMapping("items")
    public ResponseEntity<List<Item>> getAllItems(@RequestParam(required = false)  Double price) {
        return ecommerceService.getAllItems(price);
    }
    @PostMapping("/add")
    public ResponseEntity<String >addItem(@RequestBody Item items ){

        return ecommerceService.addItem(items);
    }
    @GetMapping("items/category/{category}")
    public ResponseEntity<List<Item>>getItemByCategory(@PathVariable String category ){
        return ecommerceService.getItemByCategory(category);
    }
}




