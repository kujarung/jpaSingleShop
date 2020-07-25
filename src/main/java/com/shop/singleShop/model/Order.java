package com.shop.singleShop.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "tb_order")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Order extends Auditing implements Serializable {
    @OneToOne
    private User user;
    @OneToOne
    private Product product;


}