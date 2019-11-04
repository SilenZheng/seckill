package com.silen.seckill.service;

import com.silen.seckill.params.AddProductParam;
import com.wowoohr.core.common.domain.ApiResponseT;

/**
 * @Author: silenZheng
 * @Date: 2019/10/30 1:39 下午
 */
public interface ProductService {
    ApiResponseT findProductList();

    ApiResponseT findProductListAndPage(Integer pageNum, Integer pageSize);

    ApiResponseT insertProduct(AddProductParam productParam);
}
