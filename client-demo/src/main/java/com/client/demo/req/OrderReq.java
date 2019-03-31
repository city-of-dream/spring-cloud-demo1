package com.client.demo.req;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class OrderReq {

    @NotNull(message = "单价不能为空")
    private Long amount;
    @NotEmpty(message = "商户id不能为空")
    private String merId;
    @NotEmpty(message = "用户id不能为空")
    private String userId;
    @NotEmpty(message = "订单归属人不能空")
    private String belongerId;
    @NotEmpty(message = "产品列表不能为空")
    @Valid
    private List<Product> productList;

}
