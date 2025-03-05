package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

@Validated
public class InlineResponse200NetworkResources   {
  @JsonProperty("dedicatedNIC")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer dedicatedNIC = null;

  @JsonProperty("egressBandWidth")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer egressBandWidth = null;

  @JsonProperty("supportDPDK")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Boolean supportDPDK = null;

  @JsonProperty("supportSriov")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Boolean supportSriov = null;


  public InlineResponse200NetworkResources dedicatedNIC(Integer dedicatedNIC) { 

    this.dedicatedNIC = dedicatedNIC;
    return this;
  }

  /**
   * Get dedicatedNIC
   * @return dedicatedNIC
   **/
  
  @Schema(description = "")
  
  public Integer getDedicatedNIC() {  
    return dedicatedNIC;
  }



  public void setDedicatedNIC(Integer dedicatedNIC) { 
    this.dedicatedNIC = dedicatedNIC;
  }

  public InlineResponse200NetworkResources egressBandWidth(Integer egressBandWidth) { 

    this.egressBandWidth = egressBandWidth;
    return this;
  }

  /**
   * Get egressBandWidth
   * @return egressBandWidth
   **/
  
  @Schema(description = "")
  
  public Integer getEgressBandWidth() {  
    return egressBandWidth;
  }



  public void setEgressBandWidth(Integer egressBandWidth) { 
    this.egressBandWidth = egressBandWidth;
  }

  public InlineResponse200NetworkResources supportDPDK(Boolean supportDPDK) { 

    this.supportDPDK = supportDPDK;
    return this;
  }

  /**
   * Get supportDPDK
   * @return supportDPDK
   **/
  
  @Schema(description = "")
  
  public Boolean isSupportDPDK() {  
    return supportDPDK;
  }



  public void setSupportDPDK(Boolean supportDPDK) { 
    this.supportDPDK = supportDPDK;
  }

  public InlineResponse200NetworkResources supportSriov(Boolean supportSriov) { 

    this.supportSriov = supportSriov;
    return this;
  }

  /**
   * Get supportSriov
   * @return supportSriov
   **/
  
  @Schema(description = "")
  
  public Boolean isSupportSriov() {  
    return supportSriov;
  }



  public void setSupportSriov(Boolean supportSriov) { 
    this.supportSriov = supportSriov;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200NetworkResources inlineResponse200NetworkResources = (InlineResponse200NetworkResources) o;
    return Objects.equals(this.dedicatedNIC, inlineResponse200NetworkResources.dedicatedNIC) &&
        Objects.equals(this.egressBandWidth, inlineResponse200NetworkResources.egressBandWidth) &&
        Objects.equals(this.supportDPDK, inlineResponse200NetworkResources.supportDPDK) &&
        Objects.equals(this.supportSriov, inlineResponse200NetworkResources.supportSriov);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dedicatedNIC, egressBandWidth, supportDPDK, supportSriov);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200NetworkResources {\n");
    
    sb.append("    dedicatedNIC: ").append(toIndentedString(dedicatedNIC)).append("\n");
    sb.append("    egressBandWidth: ").append(toIndentedString(egressBandWidth)).append("\n");
    sb.append("    supportDPDK: ").append(toIndentedString(supportDPDK)).append("\n");
    sb.append("    supportSriov: ").append(toIndentedString(supportSriov)).append("\n");
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
