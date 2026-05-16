
package com.example.ecommerce.controller;

import com.example.ecommerce.common.Result;
import com.example.ecommerce.entity.Orders;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/create")
    public Result create(@RequestBody Orders orders){
        return Result.success("订单创建成功");
    }
}
