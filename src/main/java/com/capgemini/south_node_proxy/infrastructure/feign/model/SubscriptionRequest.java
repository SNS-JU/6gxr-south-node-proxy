package com.capgemini.south_node_proxy.infrastructure.feign.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubscriptionRequest {

    private String qosReference;
    private String dnn;
    private String ueIpv4Addr;
}
