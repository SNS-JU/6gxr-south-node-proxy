package com.capgemini.south_node_proxy.infrastructure.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.south_node_proxy.infrastructure.feign.model.ClosestEdge;

import feign.Param;

@FeignClient(value = "ieapEdgeDiscoveryClient", url = "http://10.15.125.12:31027/eds/v0")
public interface IEAPEdgeDiscoveryClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "/mec-platforms", consumes = "application/json", produces = "application/json")
	public List<ClosestEdge> locateClosest(@Param("filter") String filter, @RequestHeader("Phone-Number") String phoneNumber,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);
}
