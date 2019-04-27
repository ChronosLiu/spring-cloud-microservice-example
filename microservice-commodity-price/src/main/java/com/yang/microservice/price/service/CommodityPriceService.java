package com.yang.microservice.price.service;

import com.yang.microservice.price.dto.CommodityPriceDto;

/**
 * 价格服务
 * @author yang.liu
 */
public interface CommodityPriceService {
    /**
     * 通过Id 查询
     * @param id
     * @return
     */
    CommodityPriceDto findById(Integer id);

    /**
     * 通过SkuNo查询
     * @param skuNo
     * @return
     */
    CommodityPriceDto findBySkuNo(String skuNo);

    /**
     * 新增价格
     * @param dto
     * @return
     */
    Integer add(CommodityPriceDto dto);

    /**
     * 修改价格
     * @param dto
     */
    void modif(CommodityPriceDto dto);

    /**
     * 删除价格
     * @param id
     */
    void del(Integer id);
}
