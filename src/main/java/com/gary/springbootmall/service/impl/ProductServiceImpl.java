package com.gary.springbootmall.service.impl;


import com.gary.springbootmall.dao.ProductDao;
import com.gary.springbootmall.dto.ProductRequest;
import com.gary.springbootmall.model.Product;
import com.gary.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
