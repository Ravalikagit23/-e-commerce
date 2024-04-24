package com.ecommerce.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="Item_SEQ")
@SequenceGenerator(name="Item_SEQ", sequenceName="Item_SEQ", allocationSize=1, initialValue = 7)
    private int id;
    private String image_Url;
    private String title;
    private String brand;
    private int rating;

    public Item() {
    }
    private float price;

    public Item(int id,String image_Url, String title, String brand, int rating, float price) {
        this.id=id;
        this.image_Url = image_Url;
        this.title = title;
        this.brand = brand;
        this.rating = rating;
        this.price = price;
    }


}
