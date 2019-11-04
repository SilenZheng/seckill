package com.silen.seckill.service;

import com.wowoohr.core.common.domain.ApiResponseT;

/**
 * @Author: silenZheng
 * @Date: 2019/10/30 1:21 下午
 */
public interface OrderService {
    ApiResponseT createOrder(Integer productId);
}
