package com.yang.microservice.commodity.service.Impl;

import com.yang.microservice.commodity.domain.TCommodity;
import com.yang.microservice.commodity.dto.CommodityDto;
import com.yang.microservice.commodity.repository.CommodityRepository;
import com.yang.microservice.commodity.service.CommodityService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityRepository commodityRepository;

    public CommodityDto findById(Integer id) {

        Optional<TCommodity> commodityOptional =this.commodityRepository.findById(id);
        if(commodityOptional.isPresent()){
           TCommodity commodity = commodityOptional.get();
           CommodityDto dto = new CommodityDto();
           BeanUtils.copyProperties(commodity,dto);
           return  dto;
        }
        return null;
    }
}
