package com.capgemini.south_node_proxy.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.south_node_proxy.application.api.SessionsApi;
import com.capgemini.south_node_proxy.domain.model.CreateSession;
import com.capgemini.south_node_proxy.domain.model.SessionInfo;
import com.capgemini.south_node_proxy.infrastructure.feign.IEAPEdgeDiscoveryAuthClient;
import com.capgemini.south_node_proxy.infrastructure.feign.IEAPEdgeDiscoveryClient;
import com.capgemini.south_node_proxy.infrastructure.feign.QosSubscriptionClient;
import com.capgemini.south_node_proxy.infrastructure.feign.model.NEFSliceProfiles;
import com.capgemini.south_node_proxy.infrastructure.feign.model.QoDProfileIEAPtoNEFMapper;
import com.capgemini.south_node_proxy.infrastructure.feign.model.SubscriptionRequest;

@RestController
public class SessionsApiController implements SessionsApi {

	@Autowired
	QosSubscriptionClient qosSubscriptionClient;
	
	@Autowired
	IEAPEdgeDiscoveryClient ieapEdgeDiscoveryClient;
	
	@Autowired
	IEAPEdgeDiscoveryAuthClient ieapEdgeDiscoveryAuthClient;

	@Override
	public ResponseEntity<SessionInfo> sessionsUc2Post(CreateSession body, String xCorrelator) {
		
		/*Token token = this.ieapEdgeDiscoveryAuthClient.getAccessToken("client_credentials", "qosmgmt-client", "OGRNCknUvWtuCnLeNpcJsfQ3Ji4jLXng", "all");
		List<ClosestEdge> closest = this.ieapEdgeDiscoveryClient.locateClosest("closest", body.getDevice().getPhoneNumber(), "Bearer " + token.getAccessToken());
		*/
		NEFSliceProfiles uc2SliceProfile = QoDProfileIEAPtoNEFMapper.valueOf(body.getQosProfile()).getUc2Mappings().get(0);
		
		SubscriptionRequest subscriptionRequest = new SubscriptionRequest();
		subscriptionRequest.setUeIpv4Addr(body.getDevice().getIpv4Address().getPublicAddress());
		subscriptionRequest.setQosReference(uc2SliceProfile.getProfileName());
		subscriptionRequest.setDnn(uc2SliceProfile.getDnn());
		this.qosSubscriptionClient.createSubscription(subscriptionRequest);
		
		return new ResponseEntity<SessionInfo>(HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<SessionInfo> sessionsDynamiconPost(CreateSession body, String xCorrelator) {	
		
		/*Token token = this.ieapEdgeDiscoveryAuthClient.getAccessToken("client_credentials", "qosmgmt-client", "OGRNCknUvWtuCnLeNpcJsfQ3Ji4jLXng", "all");
		List<ClosestEdge> closest = this.ieapEdgeDiscoveryClient.locateClosest("closest", body.getDevice().getPhoneNumber(), "Bearer " + token.getAccessToken());
		*/
		NEFSliceProfiles uc2SliceProfile = QoDProfileIEAPtoNEFMapper.valueOf(body.getQosProfile()).getDynamiconMappings().get(0);
		
		SubscriptionRequest subscriptionRequest = new SubscriptionRequest();
		subscriptionRequest.setUeIpv4Addr(body.getDevice().getIpv4Address().getPublicAddress());
		subscriptionRequest.setQosReference(uc2SliceProfile.getProfileName());
		subscriptionRequest.setDnn(uc2SliceProfile.getDnn());
		this.qosSubscriptionClient.createSubscription(subscriptionRequest);
		
		return new ResponseEntity<SessionInfo>(HttpStatus.CREATED);
	}
}
