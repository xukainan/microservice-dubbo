package top.uaian.facade.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * description:  <br>
 * date: 2019/10/22 16:43 <br>
 * author: xukainan <br>
 * version: 1.0 <br>
 */
@Data
public class PayRequestDto implements Serializable {
    private static final long serialVersionUID = 1963271253005503264L;
    private Long merchantOrderNo;
    private String phone;
    private String username;
    private BigDecimal payAmount;
    private String merchantNo;
    private Date merchantReqTime;
    private String orderCurrency;
}
