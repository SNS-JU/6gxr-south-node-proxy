package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

@Validated
public class InlineResponse200ZoneServiceLevelObjsInfo   {
  @JsonProperty("jitterRanges")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private InlineResponse200ZoneServiceLevelObjsInfoJitterRanges jitterRanges = null;

  @JsonProperty("latencyRanges")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private InlineResponse200ZoneServiceLevelObjsInfoLatencyRanges latencyRanges = null;

  @JsonProperty("throughputRanges")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private InlineResponse200ZoneServiceLevelObjsInfoThroughputRanges throughputRanges = null;


  public InlineResponse200ZoneServiceLevelObjsInfo jitterRanges(InlineResponse200ZoneServiceLevelObjsInfoJitterRanges jitterRanges) { 

    this.jitterRanges = jitterRanges;
    return this;
  }

  /**
   * Get jitterRanges
   * @return jitterRanges
   **/
  
  @Schema(description = "")
  
@Valid
  public InlineResponse200ZoneServiceLevelObjsInfoJitterRanges getJitterRanges() {  
    return jitterRanges;
  }



  public void setJitterRanges(InlineResponse200ZoneServiceLevelObjsInfoJitterRanges jitterRanges) { 
    this.jitterRanges = jitterRanges;
  }

  public InlineResponse200ZoneServiceLevelObjsInfo latencyRanges(InlineResponse200ZoneServiceLevelObjsInfoLatencyRanges latencyRanges) { 

    this.latencyRanges = latencyRanges;
    return this;
  }

  /**
   * Get latencyRanges
   * @return latencyRanges
   **/
  
  @Schema(description = "")
  
@Valid
  public InlineResponse200ZoneServiceLevelObjsInfoLatencyRanges getLatencyRanges() {  
    return latencyRanges;
  }



  public void setLatencyRanges(InlineResponse200ZoneServiceLevelObjsInfoLatencyRanges latencyRanges) { 
    this.latencyRanges = latencyRanges;
  }

  public InlineResponse200ZoneServiceLevelObjsInfo throughputRanges(InlineResponse200ZoneServiceLevelObjsInfoThroughputRanges throughputRanges) { 

    this.throughputRanges = throughputRanges;
    return this;
  }

  /**
   * Get throughputRanges
   * @return throughputRanges
   **/
  
  @Schema(description = "")
  
@Valid
  public InlineResponse200ZoneServiceLevelObjsInfoThroughputRanges getThroughputRanges() {  
    return throughputRanges;
  }



  public void setThroughputRanges(InlineResponse200ZoneServiceLevelObjsInfoThroughputRanges throughputRanges) { 
    this.throughputRanges = throughputRanges;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200ZoneServiceLevelObjsInfo inlineResponse200ZoneServiceLevelObjsInfo = (InlineResponse200ZoneServiceLevelObjsInfo) o;
    return Objects.equals(this.jitterRanges, inlineResponse200ZoneServiceLevelObjsInfo.jitterRanges) &&
        Objects.equals(this.latencyRanges, inlineResponse200ZoneServiceLevelObjsInfo.latencyRanges) &&
        Objects.equals(this.throughputRanges, inlineResponse200ZoneServiceLevelObjsInfo.throughputRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jitterRanges, latencyRanges, throughputRanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200ZoneServiceLevelObjsInfo {\n");
    
    sb.append("    jitterRanges: ").append(toIndentedString(jitterRanges)).append("\n");
    sb.append("    latencyRanges: ").append(toIndentedString(latencyRanges)).append("\n");
    sb.append("    throughputRanges: ").append(toIndentedString(throughputRanges)).append("\n");
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
