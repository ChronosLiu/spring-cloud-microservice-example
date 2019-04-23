package com.yang.microservice.commodity.domain;

import com.yang.microservice.common.AbstractDomain;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Data
@AllArgsConstructor
@Entity
@Table(name = "t_commodity")
public class TCommodity extends AbstractDomain {

    /**
     * 商品编号
     */
    private String skuNo;
    /**
     *  商品SPU号
     */
    private String spuNo;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品最小起订量
     */
    private Integer moq;
    /**
     * 商品图片路径
     */
    @Column(name = "img_url")
    private String imgUrl;
    /**
     * 商品启用状态（true:启用，false:下架）
     */
    @Column(name = "is_enable")
    private Boolean enable;

    public TCommodity(){

    }


}
