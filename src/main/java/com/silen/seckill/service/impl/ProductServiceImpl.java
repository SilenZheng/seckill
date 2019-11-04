package com.silen.seckill.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.silen.seckill.dao.SeckillProductDAO;
import com.silen.seckill.entity.SeckillProduct;
import com.silen.seckill.entity.SeckillProductExample;
import com.silen.seckill.params.AddProductParam;
import com.silen.seckill.service.ProductService;
import com.silen.seckill.utils.Tools;
import com.wowoohr.core.common.domain.ApiResponseT;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: silenZheng
 * @Date: 2019/10/30 1:39 下午
 */
@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private SeckillProductDAO seckillProductDao;

    @Override
    public ApiResponseT findProductList(){
        SeckillProductExample example = new SeckillProductExample();
        List<SeckillProduct> productList = seckillProductDao.selectByExample(example);
        return ApiResponseT.success(productList);
    }

//    @Override
//    public ApiResponseT findProductListAndPage(Integer pageNum, Integer pageSize){
//        SeckillProductExample example = new SeckillProductExample();
//        example.setLimit(pageSize);
//        example.setOffset(pageSize*(pageNum-1));
//        List<SeckillProduct> productPage = seckillProductDao.selectByExample(example);
//        return ApiResponseT.success(productPage);
//    }

    @Override
    public ApiResponseT findProductListAndPage(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        SeckillProductExample example = new SeckillProductExample();
        List<SeckillProduct> productPage = seckillProductDao.selectByExample(example);
        PageInfo pageInfo = new PageInfo(productPage);
        return ApiResponseT.success(pageInfo);
    }

    @Override
    public ApiResponseT insertProduct(AddProductParam productParam){
        SeckillProduct product = new SeckillProduct();
        product.setProductNumber(Tools.getProductNo());
        product.setProductName(productParam.getProductName());
        product.setMarketPrice(productParam.getMarketPrice());
        product.setDiscountedPrice(productParam.getDiscountedPrice());
        product.setPreferentialPrice(productParam.getPreferentialPrice());
        product.setShowStartTime(productParam.getShowStartTime());
        product.setEndStartTime(productParam.getEndStartTime());
        try {
            int number = seckillProductDao.insert(product);
            return ApiResponseT.success();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ApiResponseT.error();
    }
}
