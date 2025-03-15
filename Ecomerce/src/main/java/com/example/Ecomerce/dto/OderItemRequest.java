package com.example.Ecomerce.dto;
import lombok.Data;

@Data
public class OderItemRequest {
    private Long productId;
    private int quantity;
}
