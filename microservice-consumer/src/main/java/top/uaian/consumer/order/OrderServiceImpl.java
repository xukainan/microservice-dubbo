package top.uaian.consumer.order;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.uaian.api.model.Order;
import top.uaian.api.model.User;
import top.uaian.api.order.OrderService;
import top.uaian.api.user.UserService;

/**
 * description:  <br>
 * date: 2019/11/6 11:00 <br>
 * author: xukainan <br>
 * version: 1.0 <br>
 */
@Component
@Service
public class OrderServiceImpl implements OrderService {

    @Reference(version = "2.0.0",loadbalance = "roundrobin")
    private UserService userService;

    @Override
    public Order get(long id){
        User user = userService.get(1);
        if (id == 20191106L) {
            return new Order(20191106L,"内存条", 257.22, user.getName());
        }
        return null;
    }
}
