package com.sun.product.pro.service;

import com.sun.product.pro.db.model.ProductInfo;

import java.util.List;

/**
 * @author sunke
 * @DATE 2021/12/27
 **/
public interface ProductInfoService {

    ProductInfo findOne(String id);

    List<ProductInfo> findUpAll();

    ProductInfo save(ProductInfo productInfo);

    void add(ProductInfo productInfo);

    void addSome(List<ProductInfo> productInfos);

    void down(String id);

    void downSome(List<String> ids);


}