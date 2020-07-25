package com.shop.singleShop.service;

import com.shop.singleShop.dto.UserDTO;
import com.shop.singleShop.model.User;
import com.shop.singleShop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    final private UserRepository userRepository;
    final private ModelMapper modelMapper;

    @Override
    public User create(UserDTO member) {
        return this.userRepository.save(this.modelMapper.map(member, User.class));
    }
}
