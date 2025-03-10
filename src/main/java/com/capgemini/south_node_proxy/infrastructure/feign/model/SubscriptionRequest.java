package com.capgemini.south_node_proxy.infrastructure.feign.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubscriptionRequest {

    private String qosReference;
    private String dnn;
    private String ueIpv4Addr;
}
