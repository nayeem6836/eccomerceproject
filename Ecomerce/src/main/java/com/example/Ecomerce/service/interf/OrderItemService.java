package com.example.Ecomerce.service.interf;

import org.springframework.data.domain.Pageable;

import com.example.Ecomerce.dto.OrderRequest;
import com.example.Ecomerce.dto.Response;
import com.example.Ecomerce.enums.OrderStatus;

import java.time.LocalDateTime;

public interface OrderItemService {
    Response placeOrder(OrderRequest orderRequest);
    Response updateOrderItemStatus(Long orderItemId, String status);
    Response filterOrderItems(OrderStatus status, LocalDateTime startDate, LocalDateTime endDate, Long itemId, Pageable pageable);
}