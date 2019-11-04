package com.silen.seckill.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * seckill_product
 * @author 
 */
@Data
public class SeckillProduct implements Serializable {
    private Integer id;

    private String productNumber;

    private String productName;

    /**
     * 产品型号
     */
    private String productDetail;

    private BigDecimal marketPrice;

    private BigDecimal preferentialPrice;

    private BigDecimal discountedPrice;

    private String image;

    private Integer repertory;

    private Integer salesVolume;

    private Date showStartTime;

    private Date endStartTime;

    private Date createTime;

    private Date updateTime;

    private Short deleteFlag;

    private static final long serialVersionUID = 1L;
}