package com.sun.product.pro.db.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * @author sunke
    * @DATE 2021/12/29
**/
/**
    * 商品表
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductInfo implements Serializable {
    private String id;

    /**
    * 商品名
    */
    private String name;

    /**
    * 商品价格
    */
    private BigDecimal price;

    /**
    * 库存
    */
    private Integer stock;

    /**
    * 描述
    */
    private String description;

    /**
    * 图标
    */
    private String icon;

    /**
    * 类目编号
    */
    private Integer categoryType;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 创建时间
    */
    private Date updateTime;

    /**
    * 0 未删除 1 删除
    */
    private Byte delFlag;

    private static final long serialVersionUID = 1L;
}