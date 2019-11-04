package com.silen.seckill.service.impl;

import com.silen.seckill.dao.SeckillOrderDAO;
import com.silen.seckill.dao.SeckillProductDAO;
import com.silen.seckill.entity.SeckillOrder;
import com.silen.seckill.entity.SeckillProduct;
import com.silen.seckill.service.OrderService;
import com.silen.seckill.utils.Tools;
import com.wowoohr.core.common.domain.ApiResponseT;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @Author: silenZheng
 * @Date: 2019/10/30 1:22 下午
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private SeckillOrderDAO seckillOrderDao;
    @Autowired
    private SeckillProductDAO seckillProductDao;

    @Override
    @Transactional
    public ApiResponseT createOrder(Integer productId){
        SeckillProduct product = seckillProductDao.selectByPrimaryKey(productId);

        //校验库存
        if (product.getRepertory()<=0){
            return ApiResponseT.error("8101","库存不足");
        }

        //扣库存
        product.setRepertory(product.getRepertory()-1);
        product.setSalesVolume(product.getSalesVolume()+1);
        seckillProductDao.updateByPrimaryKey(product);

        //创建订单
        SeckillOrder order = new SeckillOrder();
        order.setUserId(1);
        order.setOrderNumber(Tools.createOrderID());
        order.setProductId(productId);
        order.setOrderPrice(product.getMarketPrice());
        order.setPayStatus((short) 1);
        order.setCreateTime(new Date());
        order.setDeleteFlag((short) 0);
        int num = seckillOrderDao.insert(order);
        return ApiResponseT.success();
    }
}
