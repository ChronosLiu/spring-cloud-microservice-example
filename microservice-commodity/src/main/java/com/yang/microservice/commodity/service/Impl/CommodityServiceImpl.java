package com.yang.microservice.commodity.service.Impl;

import com.yang.microservice.commodity.domain.TCommodity;
import com.yang.microservice.commodity.dto.CommodityDto;
import com.yang.microservice.commodity.dto.CommodityPriceDto;
import com.yang.microservice.commodity.repository.CommodityRepository;
import com.yang.microservice.commodity.service.CommodityService;
import com.yang.microservice.commodity.service.PriceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityRepository commodityRepository;
    @Autowired
    private PriceService priceService;

    public CommodityDto findById(Integer id) {

        Optional<TCommodity> commodityOptional =this.commodityRepository.findById(id);
        if(commodityOptional.isPresent()){
           TCommodity commodity = commodityOptional.get();
           CommodityDto dto = new CommodityDto();
           BeanUtils.copyProperties(commodity,dto);
           commodity.setCreatedTime(new Date());
           commodity.setModifyTime(new Date());

           CommodityPriceDto priceDto = this.priceService.findBySkuNo(dto.getSkuNo());
           dto.setSellingPrice(priceDto.getSellingPrice());
           dto.setOriginPrice(priceDto.getOriginPrice());
           return  dto;
        }
        return null;
    }
}
