package com.silen.seckill.controller;

import com.silen.seckill.params.AddProductParam;
import com.silen.seckill.service.ProductService;
import com.wowoohr.core.common.domain.ApiResponseT;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: silenZheng
 * @Date: 2019/10/30 1:38 下午
 */
@Api(value = "产品模块", tags = "产品模块")
@Slf4j
@RequestMapping("/products")
@RestController
public class ProductController {


    @Autowired
    private ProductService productService;


    @RequestMapping(value = "", method = RequestMethod.GET)
    @ApiOperation(value = "获取产品列表",httpMethod = "GET", consumes="application/json;charset=UTF-8",produces="application/json;charset=UTF-8", notes = "产品列表")
    public ApiResponseT getProductList(){
        try {
            return productService.findProductList();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ApiResponseT.error();
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    @ApiOperation(value = "添加产品", httpMethod = "POST", consumes = "application/json;charset=UTF-8", produces = "application/json;charset=UTF-8", notes = "添加产品")
    public ApiResponseT insertProduct(@RequestBody
                                      @ApiParam(name = "添加用户参数", value = "传入json格式", required = true)
                                      AddProductParam addProductParam){

        return productService.insertProduct(addProductParam);
    }

    @RequestMapping(value = "/{pageNum}/{pageSize}", method = RequestMethod.GET)
    @ApiOperation(value = "获取产品列表and分页",httpMethod = "GET", consumes="application/json;charset=UTF-8",produces="application/json;charset=UTF-8", notes = "产品列表")
    public ApiResponseT getProductListAndPager(@PathVariable("pageNum")Integer pageNum,
                                               @PathVariable("pageSize")Integer pageSize){
        try {
            return productService.findProductListAndPage(pageNum,pageSize);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ApiResponseT.error();
    }

}
