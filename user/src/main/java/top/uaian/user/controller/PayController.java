package top.uaian.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.uaian.facade.domain.PayResponseDto;
import top.uaian.facade.pay.Pay;
import top.uaian.user.pay.PayImpl;

/**
 * description:  <br>
 * date: 2019/10/23 18:05 <br>
 * author: xukainan <br>
 * version: 1.0 <br>
 */
@RestController
public class PayController {

    @Autowired
    Pay pay;

    @RequestMapping("/pay")
    public PayResponseDto pay(){
        return pay.pay();
    }
}
