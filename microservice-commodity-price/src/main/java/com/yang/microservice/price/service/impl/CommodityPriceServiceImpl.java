package com.yang.microservice.price.service.impl;

import com.yang.microservice.price.domain.TCommodityPrice;
import com.yang.microservice.price.dto.CommodityPriceDto;
import com.yang.microservice.price.repository.CommodityPriceRepository;
import com.yang.microservice.price.service.CommodityPriceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class CommodityPriceServiceImpl implements CommodityPriceService {

    @Autowired
    private CommodityPriceRepository repository;

    @Override
    public CommodityPriceDto findById(Integer id) {

        Optional<TCommodityPrice> optional = this.repository.findById(id);
        if(optional.isPresent()){
            TCommodityPrice commodityPrice = optional.get();
            CommodityPriceDto dto = new CommodityPriceDto();
            BeanUtils.copyProperties(commodityPrice,dto);
            return dto;
        }
        return null;
    }
    @Override
    public CommodityPriceDto findBySkuNo(String skuNo) {

        TCommodityPrice commodityPrice =this.repository.findBySkuNoEqualsAndEnableEquals(skuNo,true);
        if(commodityPrice!=null){
            CommodityPriceDto dto = new CommodityPriceDto();
            BeanUtils.copyProperties(commodityPrice,dto);
            return dto;
        }
        return null;
    }

    @Override
    public Integer add(CommodityPriceDto dto) {

        TCommodityPrice commodityPrice = new TCommodityPrice();
        BeanUtils.copyProperties(dto,commodityPrice);
        commodityPrice.setEnable(true);
        commodityPrice.setCreatedTime( new Date());
        commodityPrice.setModifyTime(new Date());
        commodityPrice =this.repository.save(commodityPrice);
        return commodityPrice.getId();
    }

    @Override
    public void modif(CommodityPriceDto dto) {
        Optional<TCommodityPrice> optional = this.repository.findById(dto.getId());
        if(optional.isPresent()) {
            TCommodityPrice price = optional.get();
            price.setOriginPrice(dto.getOriginPrice());
            price.setSellingPrice(dto.getSellingPrice());
            price.setEnable(dto.getEnable());
            price.setModifyTime(new Date());
            this.repository.saveAndFlush(price);
        }
    }

    @Override
    public void del(Integer id) {
        this.repository.deleteById(id);
    }
}
