package com.capgemini.south_node_proxy.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.south_node_proxy.application.api.OperatorplatformApi;
import com.capgemini.south_node_proxy.domain.model.ComputeResourceInfo;
import com.capgemini.south_node_proxy.domain.model.ComputeResourceInfo.CpuArchTypeEnum;
import com.capgemini.south_node_proxy.domain.model.FederationContextIdZonesBody;
import com.capgemini.south_node_proxy.domain.model.InlineResponse200;
import com.capgemini.south_node_proxy.domain.model.InlineResponse200AcceptedZoneResourceInfo;
import com.capgemini.south_node_proxy.infrastructure.feign.I2CatClientFederation;
import com.capgemini.south_node_proxy.infrastructure.feign.I2CatOpenIdConnectClient;

import jakarta.validation.Valid;

@RestController
public class OperatorplatformApiController implements OperatorplatformApi {

	@Autowired
	I2CatOpenIdConnectClient i2CatOpenIdConnectClient;
	
	@Autowired
	I2CatClientFederation i2CatClientFederation;

	@Override
	public ResponseEntity<InlineResponse200> operatorplatformFederationV1FederationContextIdZonesPost(
			String federationContextId, FederationContextIdZonesBody body, String authHeader) {

		InlineResponse200 response = this.i2CatClientFederation.sendZoneToI2CAT(federationContextId, body,
				authHeader);

		for (InlineResponse200AcceptedZoneResourceInfo acceptedResourceInfo : response.getAcceptedZoneResourceInfo()) {
			if (acceptedResourceInfo.getReservedComputeResources().isEmpty()) {
				ComputeResourceInfo defaultComputeResourceInfo = new ComputeResourceInfo();
				defaultComputeResourceInfo.setCpuArchType(CpuArchTypeEnum.X86_64);
				defaultComputeResourceInfo.setNumCPU(0);
				defaultComputeResourceInfo.setMemory(0l);

				acceptedResourceInfo.getReservedComputeResources().add(defaultComputeResourceInfo);
			}
		}

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> createArtefact(String federationContextId, @Valid Object body, String authHeader) {
		return new ResponseEntity<>(this.i2CatClientFederation.createArtefact(federationContextId, body, authHeader), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> createPartner(@Valid Object body, String authHeader) {
		return new ResponseEntity<>(this.i2CatClientFederation.createPartner(body, authHeader), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> manageApplicationLCM(String federationContextId, @Valid Object body,
			String authHeader) {
		return new ResponseEntity<>(this.i2CatClientFederation.manageApplicationLifecycle(federationContextId, body, authHeader), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> onboardApplication(String federationContextId, @Valid Object body,
			String authHeader) {
		return new ResponseEntity<>(this.i2CatClientFederation.onboardApplication(federationContextId, body, authHeader), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> patchPartner(String partnerId, @Valid Object body, String authHeader) {
		return new ResponseEntity<>(this.i2CatClientFederation.updatePartner(partnerId, body, authHeader), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> updateApplicationById(String federationContextId, String appId, @Valid Object body,
			String authHeader) {
		return new ResponseEntity<>(this.i2CatClientFederation.updateApplicationOnboarding(federationContextId, appId, body, authHeader), HttpStatus.OK);
	}
	
	@Override
	public ResponseEntity<Void> deleteZoneFromApp(String federationContextId, String appId, String zone,
			String authHeader) {
		return new ResponseEntity<>(this.i2CatClientFederation.deleteZoneForApp(federationContextId, appId, zone, authHeader), HttpStatus.OK);
	}
	
	@Override
	public ResponseEntity<Void> deleteApplicationInstance(String federationContextId, String appId, String instanceId,
			String zoneId, String authHeader) {
		return new ResponseEntity<>(this.i2CatClientFederation.deleteAppInstanceInZone(federationContextId, appId, instanceId, zoneId, authHeader), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> deleteArtefact(String federationContextId, String artefactId, String authHeader) {
		return new ResponseEntity<>(this.i2CatClientFederation.deleteArtefact(federationContextId, artefactId, authHeader), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> deletePartner(String partnerId, String authHeader) {
		return new ResponseEntity<>(this.i2CatClientFederation.deletePartner(partnerId, authHeader), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> deleteZone(String federationContextId, String zone, String authHeader) {
		return new ResponseEntity<>(this.i2CatClientFederation.deleteZone(federationContextId, zone, authHeader), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> obtainAccessToken(String clientId, String clientSecret, String grantType) {
		return new ResponseEntity<>(this.i2CatOpenIdConnectClient.getToken("application/x-www-form-urlencoded", clientId, clientSecret, grantType), HttpStatus.OK);
	}
}
