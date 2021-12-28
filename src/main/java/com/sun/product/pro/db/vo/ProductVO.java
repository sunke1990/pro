package com.sun.product.pro.db.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author sunke
 * @DATE 2021/12/28
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductVO {

    @ApiModelProperty("类别名")
    @JsonProperty("name")
    private String categoryName;

    @ApiModelProperty("类别名")
    private Integer type;

    @ApiModelProperty("商品集合")
    private List<ProductInfoVO> foods;
}
