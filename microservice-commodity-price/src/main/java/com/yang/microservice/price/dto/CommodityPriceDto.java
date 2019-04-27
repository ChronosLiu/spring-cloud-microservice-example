package com.yang.microservice.price.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("价格Dto")
@Data
public class CommodityPriceDto {

    @ApiModelProperty(value = "主键")
    private Integer id;
    /**
     * 商品ID
     */
    @ApiModelProperty(value = "商品ID")
    private Integer skuId;
    /**
     * 商品SKUNo
     */
    @ApiModelProperty(value = "商品SKUNo")
    private String skuNo;
    /**
     * 销售价
     */
    @ApiModelProperty(value = "销售价")
    private BigDecimal sellingPrice;
    /**
     * 原始价格
     */
    @ApiModelProperty(value = "原始价格")
    private BigDecimal originPrice;
    /**
     * 是否启用
     */
    @ApiModelProperty(value = "是否启用")
    private Boolean enable;

    public CommodityPriceDto(){}
}
