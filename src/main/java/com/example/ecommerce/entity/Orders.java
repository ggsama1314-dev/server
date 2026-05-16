
package com.example.ecommerce.entity;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Orders {
    private Long orderId;
    private Long userId;
    private BigDecimal totalAmount;
    private String orderStatus;
    private LocalDateTime createTime;
}
