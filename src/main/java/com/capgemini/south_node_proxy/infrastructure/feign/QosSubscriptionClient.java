package com.capgemini.south_node_proxy.infrastructure.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.capgemini.south_node_proxy.infrastructure.feign.model.SubscriptionRequest;

@FeignClient(name = "qosSubscriptionClient", url = "http://10.3.3.41")
public interface QosSubscriptionClient {

	@PostMapping(value = "/3gpp-as-session-with-qos/v1/AS/subscriptions", consumes = MediaType.APPLICATION_JSON_VALUE)
	String createSubscription(@RequestBody SubscriptionRequest requestBody);
}