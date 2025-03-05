package com.capgemini.south_node_proxy.application.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.south_node_proxy.application.api.TrafficInfluenceNewZonesApi;

@RestController
public class TrafficInfluenceNewZonesApiController implements TrafficInfluenceNewZonesApi {

	@Override
	public ResponseEntity<Void> trafficInfluenceNewZonesPost(List<Object> body) {
		// TODO Auto-generated method stub
		return null;
	}
}
