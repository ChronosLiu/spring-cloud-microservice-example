package com.yang.microservice.commodity.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CommodityDto {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 创建者
     */
    private Integer createdBy;
    /**
     * 修改时间
     */
    private Date modifyTime;
    /**
     * 修改者
     */
    private Integer modifyBy;
    /**
     * 商品编号
     */
    private String skuNo;
    /**
     *  商品SPU号
     */
    private String spuNo;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品最小起订量
     */
    private Integer moq;
    /**
     * 商品图片路径
     */
    private String imgUrl;
    /**
     * 商品启用状态（true:启用，false:下架）
     */
    private Boolean enable;
}
