package com.capgemini.south_node_proxy.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

@Validated
public class InlineResponse200   {
  @JsonProperty("acceptedZoneResourceInfo")
  @Valid
  private List<InlineResponse200AcceptedZoneResourceInfo> acceptedZoneResourceInfo = null;

  public InlineResponse200 acceptedZoneResourceInfo(List<InlineResponse200AcceptedZoneResourceInfo> acceptedZoneResourceInfo) { 

    this.acceptedZoneResourceInfo = acceptedZoneResourceInfo;
    return this;
  }

  public InlineResponse200 addAcceptedZoneResourceInfoItem(InlineResponse200AcceptedZoneResourceInfo acceptedZoneResourceInfoItem) {
    if (this.acceptedZoneResourceInfo == null) {
      this.acceptedZoneResourceInfo = new ArrayList<InlineResponse200AcceptedZoneResourceInfo>();
    }
    this.acceptedZoneResourceInfo.add(acceptedZoneResourceInfoItem);
    return this;
  }

  /**
   * Get acceptedZoneResourceInfo
   * @return acceptedZoneResourceInfo
   **/
  
  @Schema(description = "")
  @Valid
  public List<InlineResponse200AcceptedZoneResourceInfo> getAcceptedZoneResourceInfo() {  
    return acceptedZoneResourceInfo;
  }



  public void setAcceptedZoneResourceInfo(List<InlineResponse200AcceptedZoneResourceInfo> acceptedZoneResourceInfo) { 
    this.acceptedZoneResourceInfo = acceptedZoneResourceInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.acceptedZoneResourceInfo, inlineResponse200.acceptedZoneResourceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedZoneResourceInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    acceptedZoneResourceInfo: ").append(toIndentedString(acceptedZoneResourceInfo)).append("\n");
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
