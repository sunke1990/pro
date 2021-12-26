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
    * @DATE 2021/12/26
**/
/**
    * 商品表
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductOrder implements Serializable {
    private String id;

    /**
    * 买家名
    */
    private String buyerName;

    /**
    * 买家手机号
    */
    private String buyerPhone;

    /**
    * 买家地址
    */
    private String buyerAddress;

    /**
    * 买家微信openid
    */
    private String buyerOpenid;

    /**
    * 订单总金额
    */
    private BigDecimal orderAmount;

    /**
    * 订单状态,默认0新下单
    */
    private Byte status;

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