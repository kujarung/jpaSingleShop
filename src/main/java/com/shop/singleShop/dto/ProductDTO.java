package com.shop.singleShop.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class ProductDTO {
    private String name;
    private int price;
    private String imgUrl;
    private String description;
}