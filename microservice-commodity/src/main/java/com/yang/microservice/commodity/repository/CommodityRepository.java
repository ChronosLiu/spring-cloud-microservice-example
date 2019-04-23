package com.yang.microservice.commodity.repository;

import com.yang.microservice.commodity.domain.TCommodity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommodityRepository extends JpaRepository<TCommodity,Integer>{
}
