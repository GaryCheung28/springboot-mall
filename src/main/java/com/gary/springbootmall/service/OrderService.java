package com.gary.springbootmall.service;

import com.gary.springbootmall.dto.CreateOrderRequest;
import com.gary.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
