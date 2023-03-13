package com.gary.springbootmall.service;

import com.gary.springbootmall.constant.ProductCategory;
import com.gary.springbootmall.dto.ProductQueryParams;
import com.gary.springbootmall.dto.ProductRequest;
import com.gary.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

