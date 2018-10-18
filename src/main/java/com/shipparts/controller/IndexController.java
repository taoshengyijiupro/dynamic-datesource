package com.shipparts.controller;

import com.shipparts.entity.Order;
import com.shipparts.entity.User;
import com.shipparts.service.db1.UserService;
import com.shipparts.service.db2.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;


@RestController
public class IndexController {


    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @GetMapping("/user")
    public ResponseEntity<List<User>> getUserList() {
        return ResponseEntity.ok(userService.getUserList());
    }

    @GetMapping("/order")
    public ResponseEntity<List<Order>> getOrderList() {
        return ResponseEntity.ok(orderService.getOrderList());
    }

    @GetMapping("/price")
    public ResponseEntity<BigDecimal> getPrice() {
        return ResponseEntity.ok(orderService.getOrderPriceByUserId(1));
    }

    @GetMapping("/price2")
    public ResponseEntity<BigDecimal> getPrice2() {
        return ResponseEntity.ok(userService.getOrderPriceByUserId(1));
    }
}
