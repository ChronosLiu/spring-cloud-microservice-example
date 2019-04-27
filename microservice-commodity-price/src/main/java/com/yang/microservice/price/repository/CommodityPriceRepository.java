package com.yang.microservice.price.repository;

import com.yang.microservice.price.domain.TCommodityPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommodityPriceRepository extends JpaRepository<TCommodityPrice,Integer> {

    TCommodityPrice findBySkuNoEqualsAndEnableEquals(String skuNo,Boolean enable);
}
