package top.uaian.facade.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * description:  <br>
 * date: 2019/10/22 16:47 <br>
 * author: xukainan <br>
 * version: 1.0 <br>
 */
@Data
@AllArgsConstructor
public class PayResponseDto implements Serializable {
    private static final long serialVersionUID = -662685631447590772L;
    private String returnCode;
    private String returnMsg;

}
