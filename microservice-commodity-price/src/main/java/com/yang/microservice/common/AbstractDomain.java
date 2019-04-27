package com.yang.microservice.common;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 实体抽象类
 * @author yang.liu
 * @date 2019-04-23
 */
@Data
@MappedSuperclass
public abstract class AbstractDomain {
    /**
     * 主键，自增
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;
    /**
     * 创建者
     */
    @Column(name = "created_by")
    private Integer createdBy;
    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;
    /**
     * 修改者
     */
    @Column(name = "modify_by")
    private Integer modifyBy;

    @Version
    @Column(name = "version")
    private Integer version;
    /**
     * 是否启用
     */
    @Column(name = "isEnable")
    private Boolean enable;
}
