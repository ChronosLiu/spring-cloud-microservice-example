package com.yang.microservice.commodity.service;

import com.yang.microservice.commodity.dto.CommodityDto;

public interface CommodityService {
    /**
     * 通过id查询商品信息
     * @param id
     * @return
     */
    CommodityDto findById(Integer id);
}
