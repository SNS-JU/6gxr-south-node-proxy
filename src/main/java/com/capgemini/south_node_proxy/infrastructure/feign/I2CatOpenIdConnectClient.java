package com.capgemini.south_node_proxy.infrastructure.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "openidConnectClient", url = "http://192.168.123.46:30080/auth/realms/mec-federation/protocol/openid-connect")
public interface I2CatOpenIdConnectClient {

    @PostMapping(value = "/token", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    ResponseEntity<Object> getToken(
        @RequestHeader("Content-Type") String contentType,
        @RequestParam("client_id") String clientId,
        @RequestParam("client_secret") String clientSecret,
        @RequestParam("grant_type") String grantType
    );
}