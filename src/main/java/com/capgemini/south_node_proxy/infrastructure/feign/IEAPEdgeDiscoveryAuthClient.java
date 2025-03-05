package com.capgemini.south_node_proxy.infrastructure.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.south_node_proxy.infrastructure.feign.model.Token;

import feign.Param;

@FeignClient(value = "ieapEdgeDiscoveryAuthClient", url = "https://10.15.125.12:31136/realms/qosmgmt/protocol/openid-connect")
public interface IEAPEdgeDiscoveryAuthClient {

	@RequestMapping(method = RequestMethod.GET, value = "/token", consumes = "application/json", produces = "application/json")
    public Token getAccessToken(
            @Param("grantType") String grantType,
            @Param("clientId") String clientId,
            @Param("clientSecret") String clientSecret,
            @Param("scope") String scope
    );
}
