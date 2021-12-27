package com.sun.product.pro.service;

import com.sun.product.pro.db.model.ProductCategory;

import java.util.List;

/**
 * @author sunke
 * @DATE 2021/12/26
 **/
public interface CategoryService {
    /**
     * 查询一个
     * @param categoryId
     * @return
     */
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> types);

    ProductCategory save(ProductCategory productCategory);

    void delete(Integer id);
}
