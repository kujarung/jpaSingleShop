package com.shop.singleShop.service;


import com.shop.singleShop.dto.ProductDTO;
import com.shop.singleShop.model.Product;
import com.shop.singleShop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    final private ProductRepository productRepository;
    final private ModelMapper modelMapper;

    @Override
    public ProductDTO getData() {
        Product p = productRepository.findById(2L).get();
        return modelMapper.map(p, ProductDTO.class);
    }

    @Override
    public ProductDTO make(Product product) {
        //this.productRepository.findById();
        //this.productRepository.findAll();
        Product p =  this.productRepository.save(product);
        return this.modelMapper.map(p, ProductDTO.class);
    }
}
