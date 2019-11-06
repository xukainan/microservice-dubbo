package top.uaian.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * description:  <br>
 * date: 2019/11/6 10:38 <br>
 * author: xukainan <br>
 * version: 1.0 <br>
 */
@Data
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -5322811951849604548L;
    private int id;
    private String name;
    private String address;
}
