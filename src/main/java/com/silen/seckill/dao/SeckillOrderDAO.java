package com.silen.seckill.dao;

import com.silen.seckill.entity.SeckillOrder;
import com.silen.seckill.entity.SeckillOrderExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * SeckillOrderDAO继承基类
 */
@Mapper
@Repository
public interface SeckillOrderDAO extends MyBatisBaseDao<SeckillOrder, Integer, SeckillOrderExample> {
}