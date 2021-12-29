package com.sun.product.pro.db.mapper;

import com.sun.product.pro.db.model.ProductCategory;

/**
    * @author sunke
    * @DATE 2021/12/29
**/
public interface ProductCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);

    ProductCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductCategory record);

    int updateByPrimaryKey(ProductCategory record);
}