package com.sun.product.pro.db.mapper;

import com.sun.product.pro.db.model.ProductOrder;

/**
    * @author sunke
    * @DATE 2021/12/26
**/
public interface ProductOrderMapper {
    int deleteByPrimaryKey(String id);

    int insert(ProductOrder record);

    int insertSelective(ProductOrder record);

    ProductOrder selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ProductOrder record);

    int updateByPrimaryKey(ProductOrder record);
}