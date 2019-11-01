package top.uaian.core.facade.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import top.uaian.facade.domain.PayRequestDto;
import top.uaian.facade.domain.PayResponseDto;
import top.uaian.facade.facade.PayTradeFacade;

/**
 * description:  <br>
 * date: 2019/10/22 16:49 <br>
 * author: xukainan <br>
 * version: 1.0 <br>
 */
@Service
@Component
public class PayTradeFacadeImpl implements PayTradeFacade {
    @Override
    public PayResponseDto payRequest(PayRequestDto payRequestDto) {
        System.out.println("接收到：" + payRequestDto.getUsername() + "的请求");
        PayResponseDto payResponseDto = new PayResponseDto("200","请求成功");
        return payResponseDto;
    }
}
