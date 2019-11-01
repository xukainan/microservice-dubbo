package top.uaian.user.pay;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import top.uaian.facade.domain.PayRequestDto;
import top.uaian.facade.domain.PayResponseDto;
import top.uaian.facade.facade.PayTradeFacade;
import top.uaian.facade.pay.Pay;

/**
 * description:  <br>
 * date: 2019/10/23 14:57 <br>
 * author: xukainan <br>
 * version: 1.0 <br>
 */
@Component
@Service
public class PayImpl implements Pay {

    @Reference
    PayTradeFacade payTradeFacade;

    @Override
    public PayResponseDto pay() {
        PayRequestDto payRequestDto =  new PayRequestDto();
        payRequestDto.setUsername("张三");
        PayResponseDto payResponseDto = payTradeFacade.payRequest(payRequestDto);
        return payResponseDto;
    }
}
