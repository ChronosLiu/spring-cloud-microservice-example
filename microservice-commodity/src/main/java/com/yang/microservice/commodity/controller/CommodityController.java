package com.yang.microservice.commodity.controller;

import com.yang.microservice.commodity.dto.CommodityDto;
import com.yang.microservice.commodity.service.CommodityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *  商品服务
 *  @author yang.liu
 */
@Api(tags = "商品服务")
@RestController
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    @ApiOperation("通过Id查找商品信息")
    @GetMapping("/v1/commodity/{id}")
    public CommodityDto findById(@PathVariable Integer id){
        return this.commodityService.findById(id);
    }

}
