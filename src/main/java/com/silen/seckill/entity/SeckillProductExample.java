package com.silen.seckill.entity;

import io.swagger.models.auth.In;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeckillProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SeckillProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductNumberIsNull() {
            addCriterion("product_number is null");
            return (Criteria) this;
        }

        public Criteria andProductNumberIsNotNull() {
            addCriterion("product_number is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumberEqualTo(String value) {
            addCriterion("product_number =", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotEqualTo(String value) {
            addCriterion("product_number <>", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberGreaterThan(String value) {
            addCriterion("product_number >", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberGreaterThanOrEqualTo(String value) {
            addCriterion("product_number >=", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberLessThan(String value) {
            addCriterion("product_number <", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberLessThanOrEqualTo(String value) {
            addCriterion("product_number <=", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberLike(String value) {
            addCriterion("product_number like", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotLike(String value) {
            addCriterion("product_number not like", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberIn(List<String> values) {
            addCriterion("product_number in", values, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotIn(List<String> values) {
            addCriterion("product_number not in", values, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberBetween(String value1, String value2) {
            addCriterion("product_number between", value1, value2, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotBetween(String value1, String value2) {
            addCriterion("product_number not between", value1, value2, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductDetailIsNull() {
            addCriterion("product_detail is null");
            return (Criteria) this;
        }

        public Criteria andProductDetailIsNotNull() {
            addCriterion("product_detail is not null");
            return (Criteria) this;
        }

        public Criteria andProductDetailEqualTo(String value) {
            addCriterion("product_detail =", value, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailNotEqualTo(String value) {
            addCriterion("product_detail <>", value, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailGreaterThan(String value) {
            addCriterion("product_detail >", value, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailGreaterThanOrEqualTo(String value) {
            addCriterion("product_detail >=", value, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailLessThan(String value) {
            addCriterion("product_detail <", value, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailLessThanOrEqualTo(String value) {
            addCriterion("product_detail <=", value, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailLike(String value) {
            addCriterion("product_detail like", value, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailNotLike(String value) {
            addCriterion("product_detail not like", value, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailIn(List<String> values) {
            addCriterion("product_detail in", values, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailNotIn(List<String> values) {
            addCriterion("product_detail not in", values, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailBetween(String value1, String value2) {
            addCriterion("product_detail between", value1, value2, "productDetail");
            return (Criteria) this;
        }

        public Criteria andProductDetailNotBetween(String value1, String value2) {
            addCriterion("product_detail not between", value1, value2, "productDetail");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(BigDecimal value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(BigDecimal value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<BigDecimal> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceIsNull() {
            addCriterion("preferential_price is null");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceIsNotNull() {
            addCriterion("preferential_price is not null");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceEqualTo(BigDecimal value) {
            addCriterion("preferential_price =", value, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceNotEqualTo(BigDecimal value) {
            addCriterion("preferential_price <>", value, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceGreaterThan(BigDecimal value) {
            addCriterion("preferential_price >", value, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("preferential_price >=", value, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceLessThan(BigDecimal value) {
            addCriterion("preferential_price <", value, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("preferential_price <=", value, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceIn(List<BigDecimal> values) {
            addCriterion("preferential_price in", values, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceNotIn(List<BigDecimal> values) {
            addCriterion("preferential_price not in", values, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preferential_price between", value1, value2, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preferential_price not between", value1, value2, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceIsNull() {
            addCriterion("discounted_price is null");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceIsNotNull() {
            addCriterion("discounted_price is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceEqualTo(BigDecimal value) {
            addCriterion("discounted_price =", value, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceNotEqualTo(BigDecimal value) {
            addCriterion("discounted_price <>", value, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceGreaterThan(BigDecimal value) {
            addCriterion("discounted_price >", value, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discounted_price >=", value, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceLessThan(BigDecimal value) {
            addCriterion("discounted_price <", value, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discounted_price <=", value, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceIn(List<BigDecimal> values) {
            addCriterion("discounted_price in", values, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceNotIn(List<BigDecimal> values) {
            addCriterion("discounted_price not in", values, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discounted_price between", value1, value2, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discounted_price not between", value1, value2, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andRepertoryIsNull() {
            addCriterion("repertory is null");
            return (Criteria) this;
        }

        public Criteria andRepertoryIsNotNull() {
            addCriterion("repertory is not null");
            return (Criteria) this;
        }

        public Criteria andRepertoryEqualTo(Integer value) {
            addCriterion("repertory =", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryNotEqualTo(Integer value) {
            addCriterion("repertory <>", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryGreaterThan(Integer value) {
            addCriterion("repertory >", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("repertory >=", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryLessThan(Integer value) {
            addCriterion("repertory <", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryLessThanOrEqualTo(Integer value) {
            addCriterion("repertory <=", value, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryIn(List<Integer> values) {
            addCriterion("repertory in", values, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryNotIn(List<Integer> values) {
            addCriterion("repertory not in", values, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryBetween(Integer value1, Integer value2) {
            addCriterion("repertory between", value1, value2, "repertory");
            return (Criteria) this;
        }

        public Criteria andRepertoryNotBetween(Integer value1, Integer value2) {
            addCriterion("repertory not between", value1, value2, "repertory");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIsNull() {
            addCriterion("sales_volume is null");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIsNotNull() {
            addCriterion("sales_volume is not null");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeEqualTo(Integer value) {
            addCriterion("sales_volume =", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotEqualTo(Integer value) {
            addCriterion("sales_volume <>", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeGreaterThan(Integer value) {
            addCriterion("sales_volume >", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_volume >=", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeLessThan(Integer value) {
            addCriterion("sales_volume <", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("sales_volume <=", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIn(List<Integer> values) {
            addCriterion("sales_volume in", values, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotIn(List<Integer> values) {
            addCriterion("sales_volume not in", values, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeBetween(Integer value1, Integer value2) {
            addCriterion("sales_volume between", value1, value2, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_volume not between", value1, value2, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeIsNull() {
            addCriterion("show_start_time is null");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeIsNotNull() {
            addCriterion("show_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeEqualTo(Date value) {
            addCriterion("show_start_time =", value, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeNotEqualTo(Date value) {
            addCriterion("show_start_time <>", value, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeGreaterThan(Date value) {
            addCriterion("show_start_time >", value, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("show_start_time >=", value, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeLessThan(Date value) {
            addCriterion("show_start_time <", value, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("show_start_time <=", value, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeIn(List<Date> values) {
            addCriterion("show_start_time in", values, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeNotIn(List<Date> values) {
            addCriterion("show_start_time not in", values, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeBetween(Date value1, Date value2) {
            addCriterion("show_start_time between", value1, value2, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andShowStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("show_start_time not between", value1, value2, "showStartTime");
            return (Criteria) this;
        }

        public Criteria andEndStartTimeIsNull() {
            addCriterion("end_start_time is null");
            return (Criteria) this;
        }

        public Criteria andEndStartTimeIsNotNull() {
            addCriterion("end_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndStartTimeEqualTo(Date value) {
            addCriterion("end_start_time =", value, "endStartTime");
            return (Criteria) this;
        }

        public Criteria andEndStartTimeNotEqualTo(Date value) {
            addCriterion("end_start_time <>", value, "endStartTime");
            return (Criteria) this;
        }

        public Criteria andEndStartTimeGreaterThan(Date value) {
            addCriterion("end_start_time >", value, "endStartTime");
            return (Criteria) this;
        }

        public Criteria andEndStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_start_time >=", value, "endStartTime");
            return (Criteria) this;
        }

        public Criteria andEndStartTimeLessThan(Date value) {
            addCriterion("end_start_time <", value, "endStartTime");
            return (Criteria) this;
        }

        public Criteria andEndStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_start_time <=", value, "endStartTime");
            return (Criteria) this;
        }

        public Criteria andEndStartTimeIn(List<Date> values) {
            addCriterion("end_start_time in", values, "endStartTime");
            return (Criteria) this;
        }

        public Criteria andEndStartTimeNotIn(List<Date> values) {
            addCriterion("end_start_time not in", values, "endStartTime");
            return (Criteria) this;
        }

        public Criteria andEndStartTimeBetween(Date value1, Date value2) {
            addCriterion("end_start_time between", value1, value2, "endStartTime");
            return (Criteria) this;
        }

        public Criteria andEndStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_start_time not between", value1, value2, "endStartTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Short value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Short value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Short value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Short value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Short value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Short> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Short> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Short value1, Short value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Short value1, Short value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}