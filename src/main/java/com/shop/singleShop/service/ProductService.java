package com.shop.singleShop.service;


import com.shop.singleShop.dto.ProductDTO;
import com.shop.singleShop.model.Product;


public interface ProductService {
    ProductDTO getData();

    ProductDTO make(Product product);
}
