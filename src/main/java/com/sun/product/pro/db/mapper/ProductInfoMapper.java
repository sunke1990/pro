package com.sun.product.pro.db.mapper;

import com.sun.product.pro.db.model.ProductInfo;

/**
    * @author sunke
    * @DATE 2021/12/26
**/
public interface ProductInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(ProductInfo record);

    int insertSelective(ProductInfo record);

    ProductInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ProductInfo record);

    int updateByPrimaryKey(ProductInfo record);
}