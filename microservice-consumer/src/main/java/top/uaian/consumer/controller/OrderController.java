package top.uaian.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.uaian.api.model.Order;
import top.uaian.api.order.OrderService;

/**
 * description:  <br>
 * date: 2019/11/6 11:08 <br>
 * author: xukainan <br>
 * version: 1.0 <br>
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/get")
    Order get(long id){
        return orderService.get(id);
    }
}
