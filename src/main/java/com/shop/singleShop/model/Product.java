package com.shop.singleShop.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "tb_products")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Product extends Auditing implements Serializable {
    private String name;
    private int price;
    private String imgUrl;
    private String description;

    @Builder
    public Product(String name, int price, String imgUrl, String description) {
        this.name = name;
        this.price = price;
        this.imgUrl = imgUrl;
        this.description = description;
    }
}