package com.silen.seckill.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * seckill_user
 * @author 
 */
@Data
public class SeckillUser implements Serializable {
    private Integer id;

    private String userNumber;

    private String username;

    private String password;

    private String phoneNumber;

    private String nickName;

    private Short gender;

    /**
     * 锁定
     */
    private Short locked;

    /**
     * 删除标识
     */
    private Short deleteFlag;

    private Date registerTime;

    private static final long serialVersionUID = 1L;
}