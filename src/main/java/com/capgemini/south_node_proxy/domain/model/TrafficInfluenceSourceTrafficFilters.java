package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Public source port used by the device for flows to which the requested traffic influence should apply.  Traffic influence will be applied to the flow between \&quot;sourcePort\&quot; and the Application Server address and port specified in \&quot;destinationTrafficFilters\&quot;.
 */
@Schema(description = "Public source port used by the device for flows to which the requested traffic influence should apply.  Traffic influence will be applied to the flow between \"sourcePort\" and the Application Server address and port specified in \"destinationTrafficFilters\".")
@Validated

public class TrafficInfluenceSourceTrafficFilters   {
  @JsonProperty("sourcePort")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private AllOfTrafficInfluenceSourceTrafficFiltersSourcePort sourcePort = null;


  public TrafficInfluenceSourceTrafficFilters sourcePort(AllOfTrafficInfluenceSourceTrafficFiltersSourcePort sourcePort) { 

    this.sourcePort = sourcePort;
    return this;
  }

  /**
   * Get sourcePort
   * @return sourcePort
   **/
  
  @Schema(description = "")
  
  public AllOfTrafficInfluenceSourceTrafficFiltersSourcePort getSourcePort() {  
    return sourcePort;
  }



  public void setSourcePort(AllOfTrafficInfluenceSourceTrafficFiltersSourcePort sourcePort) { 
    this.sourcePort = sourcePort;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrafficInfluenceSourceTrafficFilters trafficInfluenceSourceTrafficFilters = (TrafficInfluenceSourceTrafficFilters) o;
    return Objects.equals(this.sourcePort, trafficInfluenceSourceTrafficFilters.sourcePort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourcePort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrafficInfluenceSourceTrafficFilters {\n");
    
    sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
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
