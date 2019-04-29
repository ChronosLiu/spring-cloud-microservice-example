package com.yang.microservice.commodity.service;

import com.yang.microservice.commodity.dto.CommodityPriceDto;

public interface PriceService {

    CommodityPriceDto findBySkuNo(String skuNo);
}
