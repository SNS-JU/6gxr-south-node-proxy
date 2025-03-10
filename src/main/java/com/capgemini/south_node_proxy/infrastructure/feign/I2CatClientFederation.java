package com.capgemini.south_node_proxy.infrastructure.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.south_node_proxy.domain.model.FederationContextIdZonesBody;
import com.capgemini.south_node_proxy.domain.model.InlineResponse200;
import com.capgemini.south_node_proxy.infrastructure.configuration.FeignConfiguration;

@FeignClient(value = "i2CatClientFederation", url = "http://192.168.123.46:30989/operatorplatform/federation/v1/", configuration = FeignConfiguration.class)
public interface I2CatClientFederation {

	@RequestMapping(method = RequestMethod.POST, value = "/{zoneId}/zones", consumes = "application/json", produces = "application/json")
	public InlineResponse200 sendZoneToI2CAT(@PathVariable("zoneId") String zoneId,
			@RequestBody FederationContextIdZonesBody requestBody,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@PostMapping(value = "/partner", consumes = "application/json", produces = "application/json")
	Object createPartner(@RequestBody Object partner,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@PostMapping(value = "/{federationContextId}/zones", consumes = "application/json", produces = "application/json")
	Object createZone(@PathVariable("federationContextId") String federationContextId,
			@RequestBody Object zone, @RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@PostMapping(value = "/{federationContextId}/artefact", consumes = "application/json", produces = "application/json")
	Object createArtefact(@PathVariable("federationContextId") String federationContextId,
			@RequestBody Object artefact, @RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@PostMapping(value = "/{federationContextId}/application/onboarding", consumes = "application/json", produces = "application/json")
	Object onboardApplication(@PathVariable("federationContextId") String federationContextId,
			@RequestBody Object application, @RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@PostMapping(value = "/{federationContextId}/application/lcm", consumes = "application/json", produces = "application/json")
	Object manageApplicationLifecycle(@PathVariable("federationContextId") String federationContextId,
			@RequestBody Object lifecycle, @RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@PatchMapping(value = "/{partnerId}/partner", consumes = "application/json", produces = "application/json")
	Object updatePartner(@PathVariable("partnerId") String partnerId, @RequestBody Object partner,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@PatchMapping(value = "/{federationContextId}/application/onboarding/{appId}", consumes = "application/json", produces = "application/json")
	Object updateApplicationOnboarding(@PathVariable("federationContextId") String federationContextId,
			@PathVariable("appId") String appId, @RequestBody Object application,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@DeleteMapping(value = "/{partnerId}/partner", consumes = "application/json", produces = "application/json")
	Void deletePartner(@PathVariable("partnerId") String partnerId,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@DeleteMapping(value = "/{federationContextId}/zones/{zone}", consumes = "application/json", produces = "application/json")
	Void deleteZone(@PathVariable("federationContextId") String federationContextId,
			@PathVariable("zone") String zone, @RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@DeleteMapping(value = "/{federationContextId}/artefact/{artefactId}", consumes = "application/json", produces = "application/json")
	Void deleteArtefact(@PathVariable("federationContextId") String federationContextId,
			@PathVariable("artefactId") String artefactId, @RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@DeleteMapping(value = "/{federationContextId}/application/onboarding/app/{appId}/zone/{zone}", consumes = "application/json", produces = "application/json")
	Void deleteZoneForApp(@PathVariable("federationContextId") String federationContextId,
			@PathVariable("appId") String appId, @PathVariable("zone") String zone,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@DeleteMapping(value = "/{federationContextId}/application/lcm/app/{appId}/instance/{instanceId}/zone/{zoneId}", consumes = "application/json", produces = "application/json")
	Void deleteAppInstanceInZone(@PathVariable("federationContextId") String federationContextId,
			@PathVariable("appId") String appId, @PathVariable("instanceId") String instanceId,
			@PathVariable("zoneId") String zoneId, @RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);
}