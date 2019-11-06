package top.uaian.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * description:  <br>
 * date: 2019/11/6 10:39 <br>
 * author: xukainan <br>
 * version: 1.0 <br>
 */
@Data
@AllArgsConstructor
public class Order implements Serializable {
    private static final long serialVersionUID = 7896808350845301115L;
    private Long id;
    private String name;
    private double price;
    private String username;
}
