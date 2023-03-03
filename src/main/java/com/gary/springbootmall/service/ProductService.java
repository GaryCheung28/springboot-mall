package com.gary.springbootmall.service;

import com.gary.springbootmall.dto.ProductRequest;
import com.gary.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}

