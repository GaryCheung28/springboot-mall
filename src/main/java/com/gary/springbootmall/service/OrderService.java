package com.gary.springbootmall.service;

import com.gary.springbootmall.dto.CreateOrderRequest;
import com.gary.springbootmall.dto.OrderQueryParams;
import com.gary.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
