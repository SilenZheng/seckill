package com.silen.seckill.dao;

import com.silen.seckill.entity.SeckillUser;
import com.silen.seckill.entity.SeckillUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * SeckillUserDAO继承基类
 */
@Mapper
@Repository
public interface SeckillUserDAO extends MyBatisBaseDao<SeckillUser, Integer, SeckillUserExample> {
}