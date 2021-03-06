package com.sun.product.pro.service.impl;

import com.sun.product.pro.db.model.ProductInfo;
import com.sun.product.pro.db.vo.ProductVO;
import com.sun.product.pro.page.Pagination;
import com.sun.product.pro.service.ProductInfoService;
import lombok.extern.slf4j.Slf4j;
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
public class ProductInfoServiceImpl implements ProductInfoService {

    @Override
    public ProductInfo findOne(String id) {
        return null;
    }

    @Override
    public Pagination<ProductVO> findAll() {
        return null;
    }

    @Override
    public void add(ProductInfo productInfo) {

    }

    @Override
    public void addSome(List<ProductInfo> productInfos) {

    }

    @Override
    public void down(String id) {

    }

    @Override
    public void downSome(List<String> ids) {

    }
}
