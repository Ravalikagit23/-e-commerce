package com.ecommerce.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String image_Url;
    private String title;
    private String brand;
    private int rating;
    private String category;
    private float price;


    public Item() {
    }

    public Item(int id,String image_Url, String title, String brand, int rating, float price,String category) {
        this.id=id;
        this.image_Url = image_Url;
        this.title = title;
        this.brand = brand;
        this.rating = rating;
        this.price = price;
        this.category=category;
    }


}
