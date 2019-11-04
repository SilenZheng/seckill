package com.silen.seckill.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: silenZheng
 * @Date: 2019/10/30 2:23 下午
 */
@Data
@ApiModel(description = "添加产品参数信息")
public class AddProductParam {

    @ApiModelProperty(value = "产品名称",name = "productName")
    private String productName;

    /**
     * 产品型号
     */
    @ApiModelProperty(value = "产品详情",name = "productDetail")
    private String productDetail;

    @ApiModelProperty(value = "市场价格",name = "marketPrice")
    private BigDecimal marketPrice;

    @ApiModelProperty(value = "优惠价格",name = "preferentialPrice")
    private BigDecimal preferentialPrice;

    @ApiModelProperty(value = "折扣价格",name = "discountedPrice")
    private BigDecimal discountedPrice;

    @ApiModelProperty(value = "图片",name = "image")
    private String image;

    @ApiModelProperty(value = "库存",name = "repertory")
    private Integer repertory;

    @ApiModelProperty(value = "销量",name = "salesVolume")
    private String salesVolume;

    @ApiModelProperty(value = "上架时间",name = "showStartTime")
    private Date showStartTime;

    @ApiModelProperty(value = "下架时间",name = "endStartTime")
    private Date endStartTime;

}
