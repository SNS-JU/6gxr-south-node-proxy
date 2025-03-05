package com.capgemini.south_node_proxy.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

@Validated
public class FederationContextIdZonesBody   {
  @JsonProperty("acceptedAvailabilityZones")
  @Valid
  private List<String> acceptedAvailabilityZones = null;
  @JsonProperty("availZoneNotifLink")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String availZoneNotifLink = null;


  public FederationContextIdZonesBody acceptedAvailabilityZones(List<String> acceptedAvailabilityZones) { 

    this.acceptedAvailabilityZones = acceptedAvailabilityZones;
    return this;
  }

  public FederationContextIdZonesBody addAcceptedAvailabilityZonesItem(String acceptedAvailabilityZonesItem) {
    if (this.acceptedAvailabilityZones == null) {
      this.acceptedAvailabilityZones = new ArrayList<String>();
    }
    this.acceptedAvailabilityZones.add(acceptedAvailabilityZonesItem);
    return this;
  }

  /**
   * Get acceptedAvailabilityZones
   * @return acceptedAvailabilityZones
   **/
  
  @Schema(example = "[\"Omega\"]", description = "")
  
  public List<String> getAcceptedAvailabilityZones() {  
    return acceptedAvailabilityZones;
  }



  public void setAcceptedAvailabilityZones(List<String> acceptedAvailabilityZones) { 
    this.acceptedAvailabilityZones = acceptedAvailabilityZones;
  }

  public FederationContextIdZonesBody availZoneNotifLink(String availZoneNotifLink) { 

    this.availZoneNotifLink = availZoneNotifLink;
    return this;
  }

  /**
   * Get availZoneNotifLink
   * @return availZoneNotifLink
   **/
  
  @Schema(example = "string", description = "")
  
  public String getAvailZoneNotifLink() {  
    return availZoneNotifLink;
  }



  public void setAvailZoneNotifLink(String availZoneNotifLink) { 
    this.availZoneNotifLink = availZoneNotifLink;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FederationContextIdZonesBody federationContextIdZonesBody = (FederationContextIdZonesBody) o;
    return Objects.equals(this.acceptedAvailabilityZones, federationContextIdZonesBody.acceptedAvailabilityZones) &&
        Objects.equals(this.availZoneNotifLink, federationContextIdZonesBody.availZoneNotifLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedAvailabilityZones, availZoneNotifLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FederationContextIdZonesBody {\n");
    
    sb.append("    acceptedAvailabilityZones: ").append(toIndentedString(acceptedAvailabilityZones)).append("\n");
    sb.append("    availZoneNotifLink: ").append(toIndentedString(availZoneNotifLink)).append("\n");
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
