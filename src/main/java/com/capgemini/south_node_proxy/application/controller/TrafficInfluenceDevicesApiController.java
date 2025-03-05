package com.capgemini.south_node_proxy.application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.south_node_proxy.application.api.TrafficInfluenceDevicesApi;
import com.capgemini.south_node_proxy.domain.model.PostTrafficInfluenceDevice;
import com.capgemini.south_node_proxy.domain.model.TrafficInfluence;

@RestController
public class TrafficInfluenceDevicesApiController implements TrafficInfluenceDevicesApi {

	@Override
	public ResponseEntity<TrafficInfluence> postTrafficInfluenceDevice(PostTrafficInfluenceDevice body,
			String xCorrelator) {
		// TODO Auto-generated method stub
		return null;
	}
}
