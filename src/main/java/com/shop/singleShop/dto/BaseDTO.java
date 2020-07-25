package com.shop.singleShop.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class BaseDTO {
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    protected long id;
}
