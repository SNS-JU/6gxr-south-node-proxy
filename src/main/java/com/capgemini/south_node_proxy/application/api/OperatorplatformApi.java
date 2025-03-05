package com.capgemini.south_node_proxy.application.api;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.south_node_proxy.domain.model.FederationContextIdZonesBody;
import com.capgemini.south_node_proxy.domain.model.InlineResponse200;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-02-25T11:49:06.240127942Z[GMT]")
@Validated
public interface OperatorplatformApi {

	@Operation(summary = "Obtain access token using client credentials", description = "This endpoint is used to obtain an access token by providing the client credentials (client_id, client_secret).", tags = {
			"E/WBI Federation" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successful token retrieval", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse200.class))) })
	@RequestMapping(value = "/auth/realms/mec-federation/protocol/openid-connect/token", produces = {
			"application/json" }, consumes = { "application/x-www-form-urlencoded" }, method = RequestMethod.POST)
	ResponseEntity<Object> obtainAccessToken(
			@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @RequestParam(value = "client_id", required = true) String clientId,
			@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @RequestParam(value = "client_secret", required = true) String clientSecret,
			@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @RequestParam(value = "grant_type", required = true) String grantType);

	@Operation(summary = "", description = "", tags = { "E/WBI Federation (Incoming)" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Notification about resource availability.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse200.class))) })
	@RequestMapping(value = "/operatorplatform/federation/v1/{federationContextId}/zones", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	ResponseEntity<InlineResponse200> operatorplatformFederationV1FederationContextIdZonesPost(
			@Pattern(regexp = "^([0-9]{5,6}-)?[^-]+$") @Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("federationContextId") String federationContextId,
			@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody FederationContextIdZonesBody body,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@Operation(summary = "Create a new artefact for a given partner", description = "", tags = { "E/WBI Federation" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Artefact created successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))) })
	@RequestMapping(value = "/operatorplatform/federation/v1/{federationContextId}/artefact", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	ResponseEntity<Object> createArtefact(
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("federationContextId") String federationContextId,
			@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody Object body,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@Operation(summary = "Create a new partner", description = "", tags = { "E/WBI Federation" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Partner created successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))) })
	@RequestMapping(value = "/operatorplatform/federation/v1/partner", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<Object> createPartner(
			@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody Object body,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@Operation(summary = "Delete an application instance in a specific zone", description = "This endpoint allows you to delete a specific instance of an application within a defined zone by providing the application ID, instance ID, and zone ID.", tags = {
			"E/WBI Federation" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successfully deleted the application instance.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))) })
	@RequestMapping(value = "/operatorplatform/federation/v1/{federationContextId}/application/lcm/app/{appId}/instance/{instanceId}/zone/{zoneId}", produces = {
			"application/json" }, method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteApplicationInstance(
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("federationContextId") String federationContextId,
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("appId") String appId,
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("instanceId") String instanceId,
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("zoneId") String zoneId,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@Operation(summary = "Delete an artefact", description = "This endpoint allows you to delete a specific artefact by providing its unique artefact ID.", tags = {
			"E/WBI Federation" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Artefact successfully deleted.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))) })
	@RequestMapping(value = "/operatorplatform/federation/v1/{federationContextId}/artefact/{artefactId}", produces = {
			"application/json" }, method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteArtefact(
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("federationContextId") String federationContextId,
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("artefactId") String artefactId,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@Operation(summary = "Delete a partner by ID", description = "", tags = { "E/WBI Federation" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Partner deleted successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))) })
	@RequestMapping(value = "/operatorplatform/federation/v1/{partnerId}/partner", produces = {
			"application/json" }, method = RequestMethod.DELETE)
	ResponseEntity<Void> deletePartner(
			@Parameter(in = ParameterIn.PATH, description = "The unique identifier for the partner to be deleted.", required = true, schema = @Schema()) @PathVariable("partnerId") String partnerId,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@Operation(summary = "Delete a zone", description = "This endpoint deletes a specific zone from the federation.", tags = {
			"E/WBI Federation" })
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Zone deleted successfully") })
	@RequestMapping(value = "/operatorplatform/federation/v1/{federationContextId}/zones/{zone}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteZone(
			@Parameter(in = ParameterIn.PATH, description = "The ID of the federation resource.", required = true, schema = @Schema()) @PathVariable("federationContextId") String federationContextId,
			@Parameter(in = ParameterIn.PATH, description = "The name of the zone to be deleted.", required = true, schema = @Schema()) @PathVariable("zone") String zone,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@Operation(summary = "Delete a zone for a specific application in onboarding", description = "This endpoint deletes a specific zone from the onboarding application.", tags = {
			"E/WBI Federation" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Zone deleted successfully from the application") })
	@RequestMapping(value = "/operatorplatform/federation/v1/{federationContextId}/application/onboarding/app/{appId}/zone/{zone}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteZoneFromApp(
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("federationContextId") String federationContextId,
			@Parameter(in = ParameterIn.PATH, description = "The ID of the application in onboarding.", required = true, schema = @Schema()) @PathVariable("appId") String appId,
			@Parameter(in = ParameterIn.PATH, description = "The name of the zone to be deleted.", required = true, schema = @Schema()) @PathVariable("zone") String zone,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@Operation(summary = "Manage the lifecycle of an application", description = "This endpoint handles the lifecycle management of an application by providing necessary metadata such as application ID, version, provider ID, and zone information.", tags = {
			"E/WBI Federation" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Application lifecycle management successful.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))) })
	@RequestMapping(value = "/operatorplatform/federation/v1/{federationContextId}/application/lcm", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	ResponseEntity<Object> manageApplicationLCM(
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("federationContextId") String federationContextId,
			@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody Object body,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@Operation(summary = "Onboard a new application", description = "This endpoint allows onboarding a new application into the platform by providing necessary metadata, quality of service profile, and component specifications.", tags = {
			"E/WBI Federation" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Application successfully onboarded.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))) })
	@RequestMapping(value = "/operatorplatform/federation/v1/{federationContextId}/application/onboarding", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	ResponseEntity<Object> onboardApplication(
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("federationContextId") String federationContextId,
			@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody Object body,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@Operation(summary = "Partially update a partner by ID", description = "", tags = { "E/WBI Federation" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Partner deleted successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))) })
	@RequestMapping(value = "/operatorplatform/federation/v1/{partnerId}/partner", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.PATCH)
	ResponseEntity<Object> patchPartner(
			@Parameter(in = ParameterIn.PATH, description = "The unique identifier for the partner to be updated.", required = true, schema = @Schema()) @PathVariable("partnerId") String partnerId,
			@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody Object body,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);

	@Operation(summary = "Update an existing application onboarding", description = "This endpoint allows updating the metadata, quality of service profile, and component specifications of an existing application using the provided `appId`.", tags = {
			"E/WBI Federation" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Application successfully updated.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))) })
	@RequestMapping(value = "/operatorplatform/federation/v1/{federationContextId}/application/onboarding/{appId}", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.PATCH)
	ResponseEntity<Object> updateApplicationById(
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("federationContextId") String federationContextId,
			@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("appId") String appId,
			@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody Object body,
			@RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader);
}
