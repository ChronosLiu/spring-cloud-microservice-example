package com.yang.microservice.price.controller;

import com.yang.microservice.price.dto.CommodityPriceDto;
import com.yang.microservice.price.service.CommodityPriceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 价格服务
 * @author yang.liu
 */
@Api(tags = "价格服务")
@RestController
@RequestMapping
public class CommodityPriceController {

    @Autowired
    private CommodityPriceService priceService;

    @ApiOperation("通过id查询价格")
    @GetMapping("/v1/price/{id}")
    public CommodityPriceDto findById(@PathVariable Integer id){
        return  this.priceService.findById(id);
    }
    @ApiOperation("通过skuNo查询价格")
    @GetMapping("/v1/price")
    public CommodityPriceDto findById(@RequestParam String skuNo){
        return  this.priceService.findBySkuNo(skuNo);
    }
    @ApiOperation("新增价格")
    @PostMapping("/v1/price")
    public void add(@RequestBody CommodityPriceDto dto){
        this.priceService.add(dto);
    }
    @ApiOperation("修改价格")
    @PutMapping("/v1/price")
    public void modif(@RequestBody CommodityPriceDto dto){
        this.priceService.modif(dto);
    }
    @ApiOperation("删除价格")
    @DeleteMapping("/v1/price/{id}")
    public void del(@PathVariable Integer id){
        this.priceService.del(id);
    }

}
