package com.shop.singleShop.service;

import com.shop.singleShop.dto.UserDTO;
import com.shop.singleShop.model.User;

public interface UserService {
    User create(UserDTO member);
}
