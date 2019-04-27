package com.yang.microservice.price.domain;

import com.yang.microservice.common.AbstractDomain;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * 商品价格
 * @author yang.liu
 */
@Data
@AllArgsConstructor
@Entity
@Table(name = "t_commodity_price")
public class TCommodityPrice extends AbstractDomain{
    /**
     * 商品ID
     */
    private Integer skuId;
    /**
     * 商品SKUNo
     */
    private String skuNo;
    /**
     * 销售价
     */
    private BigDecimal sellingPrice;
    /**
     * 原始价格
     */
    private BigDecimal originPrice;

    public TCommodityPrice(){}

}
