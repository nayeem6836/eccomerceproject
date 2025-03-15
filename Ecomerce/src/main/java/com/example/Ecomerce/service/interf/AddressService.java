package com.example.Ecomerce.service.interf;

import com.example.Ecomerce.dto.AddressDto;
import com.example.Ecomerce.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}