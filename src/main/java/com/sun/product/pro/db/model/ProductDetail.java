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
public class ProductDetail implements Serializable {
    private String id;

    /**
    * 订单id
    */
    private String orderId;

    /**
    * 商品id
    */
    private String productId;

    /**
    * 商品名
    */
    private String productName;

    /**
    * 商品价格
    */
    private BigDecimal productPrice;

    /**
    * 商品数量
    */
    private Integer productQuantity;

    /**
    * 图标
    */
    private String productIcon;

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