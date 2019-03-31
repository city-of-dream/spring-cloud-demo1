package com.client.demo.req;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Product {

    @NotEmpty(message = "产品id不能为空")
    private String productId;
    @NotEmpty(message = "产品名称不能为空")
    private String productName;

}
