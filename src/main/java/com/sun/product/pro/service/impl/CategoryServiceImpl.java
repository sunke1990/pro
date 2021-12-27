package com.sun.product.pro.service.impl;

import com.sun.product.pro.db.mapper.ProductCategoryMapper;
import com.sun.product.pro.db.model.ProductCategory;
import com.sun.product.pro.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author sunke
 * @DATE 2021/12/27
 **/
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryMapper categoryMapper;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return categoryMapper.selectByPrimaryKey(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return null;
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> types) {
        return null;
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
