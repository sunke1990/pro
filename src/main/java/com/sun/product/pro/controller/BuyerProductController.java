package com.sun.product.pro.controller;

import com.sun.product.pro.db.model.ProductInfo;
import com.sun.product.pro.db.vo.ProductVO;
import com.sun.product.pro.page.BusinessResult;
import com.sun.product.pro.page.Pagination;
import com.sun.product.pro.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author sunke
 * @DATE 2021/12/27
 **/
@RestController
@RequestMapping("/buyer/product")
@Validated
public class BuyerProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @GetMapping("/detail")
    public BusinessResult<ProductInfo> detail(@RequestParam(value = "id",required = true) @NotEmpty String id){
        return BusinessResult.success(productInfoService.findOne(id));
    }


    @GetMapping("/list")
    public BusinessResult<Pagination<ProductVO>> list(){
        return BusinessResult.success(productInfoService.findAll());
    }

    @DeleteMapping("/delete")
    public BusinessResult del(@RequestParam(value = "id",required = true) @NotEmpty String id){
        productInfoService.down(id);
        return BusinessResult.success(null);
    }

    @PostMapping("/add")
    public BusinessResult add(@RequestBody ProductInfo productInfo){
        productInfoService.add(productInfo);
        return BusinessResult.success(null);
    }

    @PostMapping("/addSome")
    public BusinessResult addSome(@RequestBody List<ProductInfo> list){
        productInfoService.addSome(list);
        return BusinessResult.success(null);
    }

    @PostMapping("/down")
    public BusinessResult down(@RequestParam(value = "id",required = true) @NotEmpty String id){
        productInfoService.down(id);
        return BusinessResult.success(null);
    }

    @PostMapping("/downSome")
    public BusinessResult downSome(@RequestBody List<String> ids){
        productInfoService.downSome(ids);
        return BusinessResult.success(null);
    }


}
