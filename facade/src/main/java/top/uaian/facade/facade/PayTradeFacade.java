package top.uaian.facade.facade;

import top.uaian.facade.domain.PayRequestDto;
import top.uaian.facade.domain.PayResponseDto;

public interface PayTradeFacade {

    public PayResponseDto payRequest(PayRequestDto payRequestDto);
}
