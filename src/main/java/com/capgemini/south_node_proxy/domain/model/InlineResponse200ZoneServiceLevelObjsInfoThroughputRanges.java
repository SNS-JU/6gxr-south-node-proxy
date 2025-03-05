package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InlineResponse200ZoneServiceLevelObjsInfoThroughputRanges
 */
@Validated
public class InlineResponse200ZoneServiceLevelObjsInfoThroughputRanges   {
  @JsonProperty("maxThroughput")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer maxThroughput = null;

  @JsonProperty("minThroughput")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer minThroughput = null;


  public InlineResponse200ZoneServiceLevelObjsInfoThroughputRanges maxThroughput(Integer maxThroughput) { 

    this.maxThroughput = maxThroughput;
    return this;
  }

  /**
   * Get maxThroughput
   * @return maxThroughput
   **/
  
  @Schema(description = "")
  
  public Integer getMaxThroughput() {  
    return maxThroughput;
  }



  public void setMaxThroughput(Integer maxThroughput) { 
    this.maxThroughput = maxThroughput;
  }

  public InlineResponse200ZoneServiceLevelObjsInfoThroughputRanges minThroughput(Integer minThroughput) { 

    this.minThroughput = minThroughput;
    return this;
  }

  /**
   * Get minThroughput
   * @return minThroughput
   **/
  
  @Schema(description = "")
  
  public Integer getMinThroughput() {  
    return minThroughput;
  }



  public void setMinThroughput(Integer minThroughput) { 
    this.minThroughput = minThroughput;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200ZoneServiceLevelObjsInfoThroughputRanges inlineResponse200ZoneServiceLevelObjsInfoThroughputRanges = (InlineResponse200ZoneServiceLevelObjsInfoThroughputRanges) o;
    return Objects.equals(this.maxThroughput, inlineResponse200ZoneServiceLevelObjsInfoThroughputRanges.maxThroughput) &&
        Objects.equals(this.minThroughput, inlineResponse200ZoneServiceLevelObjsInfoThroughputRanges.minThroughput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxThroughput, minThroughput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200ZoneServiceLevelObjsInfoThroughputRanges {\n");
    
    sb.append("    maxThroughput: ").append(toIndentedString(maxThroughput)).append("\n");
    sb.append("    minThroughput: ").append(toIndentedString(minThroughput)).append("\n");
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
