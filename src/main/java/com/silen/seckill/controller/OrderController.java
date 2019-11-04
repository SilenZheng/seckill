package com.silen.seckill.controller;

import com.silen.seckill.service.OrderService;
import com.wowoohr.core.common.domain.ApiResponseT;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: silenZheng
 * @Date: 2019/10/30 1:19 下午
 */
@Slf4j
@Api(value = "订单模块", tags = "订单接口")
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/{productId}", method = RequestMethod.POST)
    @ApiOperation(value = "创建订单", httpMethod = "POST", consumes = "application/json;charset=UTF-8", produces = "application/json;charset=UTF-8", notes = "创建订单")
    public ApiResponseT createOrder(@PathVariable("productId")Integer productId){
        return orderService.createOrder(productId);
    }

    public void print(){
        System.out.println("分支修改01");
    }

}
