package com.sun.product.pro.db.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author sunke
 * @DATE 2021/12/28
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductInfoVO {

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
     * 描述
     */
    private String description;

    /**
     * 图标
     */
    private String icon;

}
