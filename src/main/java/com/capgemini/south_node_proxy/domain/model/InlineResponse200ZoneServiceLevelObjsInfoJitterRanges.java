package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InlineResponse200ZoneServiceLevelObjsInfoJitterRanges
 */
@Validated
public class InlineResponse200ZoneServiceLevelObjsInfoJitterRanges   {
  @JsonProperty("maxJitter")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer maxJitter = null;

  @JsonProperty("minJitter")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer minJitter = null;


  public InlineResponse200ZoneServiceLevelObjsInfoJitterRanges maxJitter(Integer maxJitter) { 

    this.maxJitter = maxJitter;
    return this;
  }

  /**
   * Get maxJitter
   * @return maxJitter
   **/
  
  @Schema(description = "")
  
  public Integer getMaxJitter() {  
    return maxJitter;
  }



  public void setMaxJitter(Integer maxJitter) { 
    this.maxJitter = maxJitter;
  }

  public InlineResponse200ZoneServiceLevelObjsInfoJitterRanges minJitter(Integer minJitter) { 

    this.minJitter = minJitter;
    return this;
  }

  /**
   * Get minJitter
   * @return minJitter
   **/
  
  @Schema(description = "")
  
  public Integer getMinJitter() {  
    return minJitter;
  }



  public void setMinJitter(Integer minJitter) { 
    this.minJitter = minJitter;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200ZoneServiceLevelObjsInfoJitterRanges inlineResponse200ZoneServiceLevelObjsInfoJitterRanges = (InlineResponse200ZoneServiceLevelObjsInfoJitterRanges) o;
    return Objects.equals(this.maxJitter, inlineResponse200ZoneServiceLevelObjsInfoJitterRanges.maxJitter) &&
        Objects.equals(this.minJitter, inlineResponse200ZoneServiceLevelObjsInfoJitterRanges.minJitter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxJitter, minJitter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200ZoneServiceLevelObjsInfoJitterRanges {\n");
    
    sb.append("    maxJitter: ").append(toIndentedString(maxJitter)).append("\n");
    sb.append("    minJitter: ").append(toIndentedString(minJitter)).append("\n");
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
