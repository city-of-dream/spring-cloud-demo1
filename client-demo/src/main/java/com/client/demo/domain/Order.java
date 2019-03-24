package com.client.demo.domain;

import lombok.Data;


@Data
public class Order {

    private String orderId;
    private Long amount;
    private String merId;
    private String userId;
    private String belongerId;
}
