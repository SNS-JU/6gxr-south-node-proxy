package com.capgemini.south_node_proxy.infrastructure.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.south_node_proxy.infrastructure.feign.model.Token;

@FeignClient(value = "ieapEdgeDiscoveryAuthClient", url = "https://10.15.125.12:31136/realms/qosmgmt/protocol/openid-connect")
public interface IEAPEdgeDiscoveryAuthClient {

	@RequestMapping(method = RequestMethod.GET, value = "/token", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public Token getAccessToken(@RequestParam("grantType") String grantType, @RequestParam("clientId") String clientId,
			@RequestParam("clientSecret") String clientSecret, @RequestParam("scope") String scope);
}
