package com.yang.microservice.commodity.service.Impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yang.microservice.commodity.dto.CommodityPriceDto;
import com.yang.microservice.commodity.service.PriceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Slf4j
@Service
public class PriceServiceImpl implements PriceService {

    @HystrixCommand(fallbackMethod = "findBySkuNoCallback")
    public CommodityPriceDto findBySkuNo(String skuNo) {

        RestTemplate template = new RestTemplate();
        String url = "http://localhost:8083/v1/price?skuNo="+skuNo;
        log.info(url);
        ResponseEntity<CommodityPriceDto> responseEntity =  template.exchange(url, HttpMethod.GET,null,CommodityPriceDto.class);

        return responseEntity.getBody();

    }
    public CommodityPriceDto findBySkuNoCallback(String skuNo) {
        CommodityPriceDto dto = new CommodityPriceDto();
        dto.setSellingPrice(BigDecimal.valueOf(1));
        dto.setOriginPrice(BigDecimal.valueOf(2));
        return dto;
    }

}
