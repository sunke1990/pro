package com.sun.product.pro.db.mapper;

import com.sun.product.pro.db.model.ProductDetail;

/**
    * @author sunke
    * @DATE 2021/12/26
**/
public interface ProductDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(ProductDetail record);

    int insertSelective(ProductDetail record);

    ProductDetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ProductDetail record);

    int updateByPrimaryKey(ProductDetail record);
}