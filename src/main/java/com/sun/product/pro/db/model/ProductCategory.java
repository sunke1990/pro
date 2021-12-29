package com.sun.product.pro.db.model;

import java.io.Serializable;
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
public class ProductCategory implements Serializable {
    private Integer id;

    /**
    * 类目名
    */
    private String name;

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