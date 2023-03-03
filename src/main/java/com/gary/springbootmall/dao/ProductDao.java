package com.gary.springbootmall.dao;

import com.gary.springbootmall.dto.ProductRequest;
import com.gary.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
