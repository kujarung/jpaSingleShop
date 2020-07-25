package com.shop.singleShop;

import com.shop.singleShop.dto.ProductDTO;

import com.shop.singleShop.model.Product;
import com.shop.singleShop.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ShopServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void 상품보기() {
        Product product = Product.builder()
                .name("이름")
                .price(1000)
                .build();
        ProductDTO productDTO = this.productService.make(product);
        assertEquals("이름", productDTO.getName());
    }
}
