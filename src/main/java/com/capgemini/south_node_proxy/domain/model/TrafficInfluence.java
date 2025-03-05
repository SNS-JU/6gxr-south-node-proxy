package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;
import java.util.UUID;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Resource conteining the informations to influence the traffic toward local instances of the Application, for any user.
 */
@Schema(description = "Resource conteining the informations to influence the traffic toward local instances of the Application, for any user.")
@Validated

public class TrafficInfluence   {
  @JsonProperty("trafficInfluenceID")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String trafficInfluenceID = null;

  @JsonProperty("apiConsumerId")

  private String apiConsumerId = null;

  @JsonProperty("appId")

  private UUID appId = null;

  @JsonProperty("appInstanceId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private UUID appInstanceId = null;

  @JsonProperty("edgeCloudRegion")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private EdgeCloudRegion edgeCloudRegion = null;

  @JsonProperty("edgeCloudZoneId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private UUID edgeCloudZoneId = null;

  /**
   * it reports the state of the TrafficInfluence resource. When first invoked, the resource is 'ordered'. When the platforms prepares the resource, it is 'created'. When the new routing is enabled in the network, the state is 'active'.  If an error occurs in the resource creation or in its activation, the state is 'error'. When the DELETE method is invoked the state is 'deletion in progress'. After the resource is deleted (as a consequence of the previous invokation of the DELETE method) the state is 'deleted'.
   */
  public enum StateEnum {
    ORDERED("ordered"),
    
    CREATED("created"),
    
    ACTIVE("active"),
    
    ERROR("error"),
    
    DELETION_IN_PROGRESS("deletion in progress"),
    
    DELETED("deleted");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("state")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private StateEnum state = null;

  @JsonProperty("sourceTrafficFilters")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private TrafficInfluenceSourceTrafficFilters sourceTrafficFilters = null;

  @JsonProperty("destinationTrafficFilters")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private TrafficInfluenceDestinationTrafficFilters destinationTrafficFilters = null;

  @JsonProperty("notificationUri")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String notificationUri = null;

  @JsonProperty("notificationAuthToken")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String notificationAuthToken = null;


  public TrafficInfluence trafficInfluenceID(String trafficInfluenceID) { 

    this.trafficInfluenceID = trafficInfluenceID;
    return this;
  }

  /**
   * Identifier for the Traffic Influence resource. This parameter is returned by the API and it is used to update it (e.g., modify or delete the TrafficInfluence resource).
   * @return trafficInfluenceID
   **/
  
  @Schema(description = "Identifier for the Traffic Influence resource. This parameter is returned by the API and it is used to update it (e.g., modify or delete the TrafficInfluence resource).")
  
  public String getTrafficInfluenceID() {  
    return trafficInfluenceID;
  }



  public void setTrafficInfluenceID(String trafficInfluenceID) { 
    this.trafficInfluenceID = trafficInfluenceID;
  }

  public TrafficInfluence apiConsumerId(String apiConsumerId) { 

    this.apiConsumerId = apiConsumerId;
    return this;
  }

  /**
   * Unique Identifier of the TI API Consumer.
   * @return apiConsumerId
   **/
  
  @Schema(required = true, description = "Unique Identifier of the TI API Consumer.")
  
  @NotNull
  public String getApiConsumerId() {  
    return apiConsumerId;
  }



  public void setApiConsumerId(String apiConsumerId) { 

    this.apiConsumerId = apiConsumerId;
  }

  public TrafficInfluence appId(UUID appId) { 

    this.appId = appId;
    return this;
  }

  /**
   * A globally unique identifier associated with theapplication. OP generates this identifier when the application is submitted over NBI.
   * @return appId
   **/
  
  @Schema(example = "6b29fc40-ca47-1067-b31d-00dd010662da", required = true, description = "A globally unique identifier associated with theapplication. OP generates this identifier when the application is submitted over NBI.")
  
@Valid
  @NotNull
  public UUID getAppId() {  
    return appId;
  }



  public void setAppId(UUID appId) { 

    this.appId = appId;
  }

  public TrafficInfluence appInstanceId(UUID appInstanceId) { 

    this.appInstanceId = appInstanceId;
    return this;
  }

  /**
   * A globally unique identifier associated with a running instance of an application. OP generates this identifier.
   * @return appInstanceId
   **/
  
  @Schema(description = "A globally unique identifier associated with a running instance of an application. OP generates this identifier.")
  
@Valid
  public UUID getAppInstanceId() {  
    return appInstanceId;
  }



  public void setAppInstanceId(UUID appInstanceId) { 
    this.appInstanceId = appInstanceId;
  }

  public TrafficInfluence edgeCloudRegion(EdgeCloudRegion edgeCloudRegion) { 

    this.edgeCloudRegion = edgeCloudRegion;
    return this;
  }

  /**
   * Get edgeCloudRegion
   * @return edgeCloudRegion
   **/
  
  @Schema(description = "")
  
@Valid
  public EdgeCloudRegion getEdgeCloudRegion() {  
    return edgeCloudRegion;
  }



  public void setEdgeCloudRegion(EdgeCloudRegion edgeCloudRegion) { 
    this.edgeCloudRegion = edgeCloudRegion;
  }

  public TrafficInfluence edgeCloudZoneId(UUID edgeCloudZoneId) { 

    this.edgeCloudZoneId = edgeCloudZoneId;
    return this;
  }

  /**
   * Unique identifier created by the Edge Cloud Platform to identify an Edge Cloud Zone within an Edge Cloud 
   * @return edgeCloudZoneId
   **/
  
  @Schema(description = "Unique identifier created by the Edge Cloud Platform to identify an Edge Cloud Zone within an Edge Cloud ")
  
@Valid
  public UUID getEdgeCloudZoneId() {  
    return edgeCloudZoneId;
  }



  public void setEdgeCloudZoneId(UUID edgeCloudZoneId) { 
    this.edgeCloudZoneId = edgeCloudZoneId;
  }

  public TrafficInfluence state(StateEnum state) { 

    this.state = state;
    return this;
  }

  /**
   * it reports the state of the TrafficInfluence resource. When first invoked, the resource is 'ordered'. When the platforms prepares the resource, it is 'created'. When the new routing is enabled in the network, the state is 'active'.  If an error occurs in the resource creation or in its activation, the state is 'error'. When the DELETE method is invoked the state is 'deletion in progress'. After the resource is deleted (as a consequence of the previous invokation of the DELETE method) the state is 'deleted'.
   * @return state
   **/
  
  @Schema(description = "it reports the state of the TrafficInfluence resource. When first invoked, the resource is 'ordered'. When the platforms prepares the resource, it is 'created'. When the new routing is enabled in the network, the state is 'active'.  If an error occurs in the resource creation or in its activation, the state is 'error'. When the DELETE method is invoked the state is 'deletion in progress'. After the resource is deleted (as a consequence of the previous invokation of the DELETE method) the state is 'deleted'.")
  
  public StateEnum getState() {  
    return state;
  }



  public void setState(StateEnum state) { 
    this.state = state;
  }

  public TrafficInfluence sourceTrafficFilters(TrafficInfluenceSourceTrafficFilters sourceTrafficFilters) { 

    this.sourceTrafficFilters = sourceTrafficFilters;
    return this;
  }

  /**
   * Get sourceTrafficFilters
   * @return sourceTrafficFilters
   **/
  
  @Schema(description = "")
  
@Valid
  public TrafficInfluenceSourceTrafficFilters getSourceTrafficFilters() {  
    return sourceTrafficFilters;
  }



  public void setSourceTrafficFilters(TrafficInfluenceSourceTrafficFilters sourceTrafficFilters) { 
    this.sourceTrafficFilters = sourceTrafficFilters;
  }

  public TrafficInfluence destinationTrafficFilters(TrafficInfluenceDestinationTrafficFilters destinationTrafficFilters) { 

    this.destinationTrafficFilters = destinationTrafficFilters;
    return this;
  }

  /**
   * Get destinationTrafficFilters
   * @return destinationTrafficFilters
   **/
  
  @Schema(description = "")
  
@Valid
  public TrafficInfluenceDestinationTrafficFilters getDestinationTrafficFilters() {  
    return destinationTrafficFilters;
  }



  public void setDestinationTrafficFilters(TrafficInfluenceDestinationTrafficFilters destinationTrafficFilters) { 
    this.destinationTrafficFilters = destinationTrafficFilters;
  }

  public TrafficInfluence notificationUri(String notificationUri) { 

    this.notificationUri = notificationUri;
    return this;
  }

  /**
   * Defines the callback uri which should be notified in asynchronous way when the state for the requested resources changes (i.e. ordered to activated)
   * @return notificationUri
   **/
  
  @Schema(description = "Defines the callback uri which should be notified in asynchronous way when the state for the requested resources changes (i.e. ordered to activated)")
  
  public String getNotificationUri() {  
    return notificationUri;
  }



  public void setNotificationUri(String notificationUri) { 
    this.notificationUri = notificationUri;
  }

  public TrafficInfluence notificationAuthToken(String notificationAuthToken) { 

    this.notificationAuthToken = notificationAuthToken;
    return this;
  }

  /**
   * Authentification token for callback API
   * @return notificationAuthToken
   **/
  
  @Schema(description = "Authentification token for callback API")
  
  public String getNotificationAuthToken() {  
    return notificationAuthToken;
  }



  public void setNotificationAuthToken(String notificationAuthToken) { 
    this.notificationAuthToken = notificationAuthToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrafficInfluence trafficInfluence = (TrafficInfluence) o;
    return Objects.equals(this.trafficInfluenceID, trafficInfluence.trafficInfluenceID) &&
        Objects.equals(this.apiConsumerId, trafficInfluence.apiConsumerId) &&
        Objects.equals(this.appId, trafficInfluence.appId) &&
        Objects.equals(this.appInstanceId, trafficInfluence.appInstanceId) &&
        Objects.equals(this.edgeCloudRegion, trafficInfluence.edgeCloudRegion) &&
        Objects.equals(this.edgeCloudZoneId, trafficInfluence.edgeCloudZoneId) &&
        Objects.equals(this.state, trafficInfluence.state) &&
        Objects.equals(this.sourceTrafficFilters, trafficInfluence.sourceTrafficFilters) &&
        Objects.equals(this.destinationTrafficFilters, trafficInfluence.destinationTrafficFilters) &&
        Objects.equals(this.notificationUri, trafficInfluence.notificationUri) &&
        Objects.equals(this.notificationAuthToken, trafficInfluence.notificationAuthToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trafficInfluenceID, apiConsumerId, appId, appInstanceId, edgeCloudRegion, edgeCloudZoneId, state, sourceTrafficFilters, destinationTrafficFilters, notificationUri, notificationAuthToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrafficInfluence {\n");
    
    sb.append("    trafficInfluenceID: ").append(toIndentedString(trafficInfluenceID)).append("\n");
    sb.append("    apiConsumerId: ").append(toIndentedString(apiConsumerId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appInstanceId: ").append(toIndentedString(appInstanceId)).append("\n");
    sb.append("    edgeCloudRegion: ").append(toIndentedString(edgeCloudRegion)).append("\n");
    sb.append("    edgeCloudZoneId: ").append(toIndentedString(edgeCloudZoneId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    sourceTrafficFilters: ").append(toIndentedString(sourceTrafficFilters)).append("\n");
    sb.append("    destinationTrafficFilters: ").append(toIndentedString(destinationTrafficFilters)).append("\n");
    sb.append("    notificationUri: ").append(toIndentedString(notificationUri)).append("\n");
    sb.append("    notificationAuthToken: ").append(toIndentedString(notificationAuthToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
