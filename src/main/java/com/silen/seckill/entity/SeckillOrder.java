package com.silen.seckill.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * seckill_order
 * @author 
 */
@Data
public class SeckillOrder implements Serializable {
    private Integer id;

    private String orderNumber;

    private Integer userId;

    private Integer productId;

    private BigDecimal orderPrice;

    private Date createTime;

    private Short payStatus;

    private Short deleteFlag;

    private static final long serialVersionUID = 1L;
}