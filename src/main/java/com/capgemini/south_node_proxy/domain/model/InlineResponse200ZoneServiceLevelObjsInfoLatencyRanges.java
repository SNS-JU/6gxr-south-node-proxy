package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

@Validated
public class InlineResponse200ZoneServiceLevelObjsInfoLatencyRanges   {
  @JsonProperty("maxLatency")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer maxLatency = null;

  @JsonProperty("minLatency")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer minLatency = null;


  public InlineResponse200ZoneServiceLevelObjsInfoLatencyRanges maxLatency(Integer maxLatency) { 

    this.maxLatency = maxLatency;
    return this;
  }

  /**
   * Get maxLatency
   * @return maxLatency
   **/
  
  @Schema(description = "")
  
  public Integer getMaxLatency() {  
    return maxLatency;
  }



  public void setMaxLatency(Integer maxLatency) { 
    this.maxLatency = maxLatency;
  }

  public InlineResponse200ZoneServiceLevelObjsInfoLatencyRanges minLatency(Integer minLatency) { 

    this.minLatency = minLatency;
    return this;
  }

  /**
   * Get minLatency
   * @return minLatency
   **/
  
  @Schema(description = "")
  
  public Integer getMinLatency() {  
    return minLatency;
  }



  public void setMinLatency(Integer minLatency) { 
    this.minLatency = minLatency;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200ZoneServiceLevelObjsInfoLatencyRanges inlineResponse200ZoneServiceLevelObjsInfoLatencyRanges = (InlineResponse200ZoneServiceLevelObjsInfoLatencyRanges) o;
    return Objects.equals(this.maxLatency, inlineResponse200ZoneServiceLevelObjsInfoLatencyRanges.maxLatency) &&
        Objects.equals(this.minLatency, inlineResponse200ZoneServiceLevelObjsInfoLatencyRanges.minLatency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxLatency, minLatency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200ZoneServiceLevelObjsInfoLatencyRanges {\n");
    
    sb.append("    maxLatency: ").append(toIndentedString(maxLatency)).append("\n");
    sb.append("    minLatency: ").append(toIndentedString(minLatency)).append("\n");
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
