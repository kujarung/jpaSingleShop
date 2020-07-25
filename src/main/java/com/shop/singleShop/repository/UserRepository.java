package com.shop.singleShop.repository;

import com.shop.singleShop.model.Product;
import com.shop.singleShop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
