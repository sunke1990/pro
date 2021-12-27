package com.sun.product.pro.service.impl;

import com.sun.product.pro.db.mapper.ProductCategoryMapper;
import com.sun.product.pro.db.model.ProductCategory;
import com.sun.product.pro.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author sunke
 * @DATE 2021/12/27
 **/
@Service
@Slf4j
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
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
    @Transactional(readOnly = false,propagation = Propagation.REQUIRED)
    public ProductCategory save(ProductCategory productCategory) {
        return null;
    }

    @Override
    @Transactional(readOnly = false,propagation = Propagation.REQUIRED)
    public void delete(Integer id) {

    }
}
