package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Identifies the destination IP packet filters. To be used when it is needed a traffic flow towards a specific EAS interface identified by a protocol and a port.  Also the Protocol (e.g. TCP or UDP) can be specified.
 */
@Schema(description = "Identifies the destination IP packet filters. To be used when it is needed a traffic flow towards a specific EAS interface identified by a protocol and a port.  Also the Protocol (e.g. TCP or UDP) can be specified.")
@Validated

public class TrafficInfluenceDestinationTrafficFilters   {
  @JsonProperty("destinationPort")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private AllOfTrafficInfluenceDestinationTrafficFiltersDestinationPort destinationPort = null;

  @JsonProperty("destinationProtocol")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private AllOfTrafficInfluenceDestinationTrafficFiltersDestinationProtocol destinationProtocol = null;


  public TrafficInfluenceDestinationTrafficFilters destinationPort(AllOfTrafficInfluenceDestinationTrafficFiltersDestinationPort destinationPort) { 

    this.destinationPort = destinationPort;
    return this;
  }

  /**
   * Get destinationPort
   * @return destinationPort
   **/
  
  @Schema(description = "")
  
  public AllOfTrafficInfluenceDestinationTrafficFiltersDestinationPort getDestinationPort() {  
    return destinationPort;
  }



  public void setDestinationPort(AllOfTrafficInfluenceDestinationTrafficFiltersDestinationPort destinationPort) { 
    this.destinationPort = destinationPort;
  }

  public TrafficInfluenceDestinationTrafficFilters destinationProtocol(AllOfTrafficInfluenceDestinationTrafficFiltersDestinationProtocol destinationProtocol) { 

    this.destinationProtocol = destinationProtocol;
    return this;
  }

  /**
   * Get destinationProtocol
   * @return destinationProtocol
   **/
  
  @Schema(description = "")
  
  public AllOfTrafficInfluenceDestinationTrafficFiltersDestinationProtocol getDestinationProtocol() {  
    return destinationProtocol;
  }



  public void setDestinationProtocol(AllOfTrafficInfluenceDestinationTrafficFiltersDestinationProtocol destinationProtocol) { 
    this.destinationProtocol = destinationProtocol;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrafficInfluenceDestinationTrafficFilters trafficInfluenceDestinationTrafficFilters = (TrafficInfluenceDestinationTrafficFilters) o;
    return Objects.equals(this.destinationPort, trafficInfluenceDestinationTrafficFilters.destinationPort) &&
        Objects.equals(this.destinationProtocol, trafficInfluenceDestinationTrafficFilters.destinationProtocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationPort, destinationProtocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrafficInfluenceDestinationTrafficFilters {\n");
    
    sb.append("    destinationPort: ").append(toIndentedString(destinationPort)).append("\n");
    sb.append("    destinationProtocol: ").append(toIndentedString(destinationProtocol)).append("\n");
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
