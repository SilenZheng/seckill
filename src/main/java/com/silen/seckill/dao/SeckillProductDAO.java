package com.silen.seckill.dao;

import com.silen.seckill.entity.SeckillProduct;
import com.silen.seckill.entity.SeckillProductExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * SeckillProductDAO继承基类
 */
@Mapper
@Repository
public interface SeckillProductDAO extends MyBatisBaseDao<SeckillProduct, Integer, SeckillProductExample> {
}