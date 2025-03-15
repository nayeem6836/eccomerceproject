package com.example.Ecomerce.service.interf;

import com.example.Ecomerce.dto.LoginRequest;
import com.example.Ecomerce.dto.Response;
import com.example.Ecomerce.dto.UserDto;
import com.example.Ecomerce.entity.User;

public interface UserService {
    Response registerUser(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}