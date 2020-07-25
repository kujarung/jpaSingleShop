package com.shop.singleShop.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "tb_users")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User extends Auditing implements Serializable {
    private String name;
    private String phone;

    @Builder
    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}