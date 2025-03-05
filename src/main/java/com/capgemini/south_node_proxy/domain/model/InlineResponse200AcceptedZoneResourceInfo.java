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

/**
 * InlineResponse200AcceptedZoneResourceInfo
 */
@Validated
public class InlineResponse200AcceptedZoneResourceInfo   {
  @JsonProperty("computeResourceQuotaLimits")
  @Valid
  private List<InlineResponse200ComputeResourceQuotaLimits> computeResourceQuotaLimits = null;
  @JsonProperty("flavoursSupported")
  @Valid
  private List<InlineResponse200FlavoursSupported> flavoursSupported = null;
  @JsonProperty("networkResources")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private InlineResponse200NetworkResources networkResources = null;

  @JsonProperty("reservedComputeResources")
  @Valid
  private List<ComputeResourceInfo> reservedComputeResources = null;
  @JsonProperty("zoneId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String zoneId = null;

  @JsonProperty("zoneServiceLevelObjsInfo")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private InlineResponse200ZoneServiceLevelObjsInfo zoneServiceLevelObjsInfo = null;


  public InlineResponse200AcceptedZoneResourceInfo computeResourceQuotaLimits(List<InlineResponse200ComputeResourceQuotaLimits> computeResourceQuotaLimits) { 

    this.computeResourceQuotaLimits = computeResourceQuotaLimits;
    return this;
  }

  public InlineResponse200AcceptedZoneResourceInfo addComputeResourceQuotaLimitsItem(InlineResponse200ComputeResourceQuotaLimits computeResourceQuotaLimitsItem) {
    if (this.computeResourceQuotaLimits == null) {
      this.computeResourceQuotaLimits = new ArrayList<InlineResponse200ComputeResourceQuotaLimits>();
    }
    this.computeResourceQuotaLimits.add(computeResourceQuotaLimitsItem);
    return this;
  }

  /**
   * Get computeResourceQuotaLimits
   * @return computeResourceQuotaLimits
   **/
  
  @Schema(description = "")
  @Valid
  public List<InlineResponse200ComputeResourceQuotaLimits> getComputeResourceQuotaLimits() {  
    return computeResourceQuotaLimits;
  }



  public void setComputeResourceQuotaLimits(List<InlineResponse200ComputeResourceQuotaLimits> computeResourceQuotaLimits) { 
    this.computeResourceQuotaLimits = computeResourceQuotaLimits;
  }

  public InlineResponse200AcceptedZoneResourceInfo flavoursSupported(List<InlineResponse200FlavoursSupported> flavoursSupported) { 

    this.flavoursSupported = flavoursSupported;
    return this;
  }

  public InlineResponse200AcceptedZoneResourceInfo addFlavoursSupportedItem(InlineResponse200FlavoursSupported flavoursSupportedItem) {
    if (this.flavoursSupported == null) {
      this.flavoursSupported = new ArrayList<InlineResponse200FlavoursSupported>();
    }
    this.flavoursSupported.add(flavoursSupportedItem);
    return this;
  }

  /**
   * Get flavoursSupported
   * @return flavoursSupported
   **/
  
  @Schema(description = "")
  @Valid
  public List<InlineResponse200FlavoursSupported> getFlavoursSupported() {  
    return flavoursSupported;
  }



  public void setFlavoursSupported(List<InlineResponse200FlavoursSupported> flavoursSupported) { 
    this.flavoursSupported = flavoursSupported;
  }

  public InlineResponse200AcceptedZoneResourceInfo networkResources(InlineResponse200NetworkResources networkResources) { 

    this.networkResources = networkResources;
    return this;
  }

  /**
   * Get networkResources
   * @return networkResources
   **/
  
  @Schema(description = "")
  
@Valid
  public InlineResponse200NetworkResources getNetworkResources() {  
    return networkResources;
  }



  public void setNetworkResources(InlineResponse200NetworkResources networkResources) { 
    this.networkResources = networkResources;
  }

  public InlineResponse200AcceptedZoneResourceInfo reservedComputeResources(List<ComputeResourceInfo> reservedComputeResources) { 

    this.reservedComputeResources = reservedComputeResources;
    return this;
  }

  public InlineResponse200AcceptedZoneResourceInfo addReservedComputeResourcesItem(ComputeResourceInfo reservedComputeResourcesItem) {
    if (this.reservedComputeResources == null) {
      this.reservedComputeResources = new ArrayList<ComputeResourceInfo>();
    }
    this.reservedComputeResources.add(reservedComputeResourcesItem);
    return this;
  }

  /**
   * Get reservedComputeResources
   * @return reservedComputeResources
   **/
  
  @Schema(description = "")
  @Valid
  public List<ComputeResourceInfo> getReservedComputeResources() {  
    return reservedComputeResources;
  }



  public void setReservedComputeResources(List<ComputeResourceInfo> reservedComputeResources) { 
    this.reservedComputeResources = reservedComputeResources;
  }

  public InlineResponse200AcceptedZoneResourceInfo zoneId(String zoneId) { 

    this.zoneId = zoneId;
    return this;
  }

  /**
   * Get zoneId
   * @return zoneId
   **/
  
  @Schema(example = "Omega", description = "")
  
  public String getZoneId() {  
    return zoneId;
  }



  public void setZoneId(String zoneId) { 
    this.zoneId = zoneId;
  }

  public InlineResponse200AcceptedZoneResourceInfo zoneServiceLevelObjsInfo(InlineResponse200ZoneServiceLevelObjsInfo zoneServiceLevelObjsInfo) { 

    this.zoneServiceLevelObjsInfo = zoneServiceLevelObjsInfo;
    return this;
  }

  /**
   * Get zoneServiceLevelObjsInfo
   * @return zoneServiceLevelObjsInfo
   **/
  
  @Schema(description = "")
  
@Valid
  public InlineResponse200ZoneServiceLevelObjsInfo getZoneServiceLevelObjsInfo() {  
    return zoneServiceLevelObjsInfo;
  }



  public void setZoneServiceLevelObjsInfo(InlineResponse200ZoneServiceLevelObjsInfo zoneServiceLevelObjsInfo) { 
    this.zoneServiceLevelObjsInfo = zoneServiceLevelObjsInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200AcceptedZoneResourceInfo inlineResponse200AcceptedZoneResourceInfo = (InlineResponse200AcceptedZoneResourceInfo) o;
    return Objects.equals(this.computeResourceQuotaLimits, inlineResponse200AcceptedZoneResourceInfo.computeResourceQuotaLimits) &&
        Objects.equals(this.flavoursSupported, inlineResponse200AcceptedZoneResourceInfo.flavoursSupported) &&
        Objects.equals(this.networkResources, inlineResponse200AcceptedZoneResourceInfo.networkResources) &&
        Objects.equals(this.reservedComputeResources, inlineResponse200AcceptedZoneResourceInfo.reservedComputeResources) &&
        Objects.equals(this.zoneId, inlineResponse200AcceptedZoneResourceInfo.zoneId) &&
        Objects.equals(this.zoneServiceLevelObjsInfo, inlineResponse200AcceptedZoneResourceInfo.zoneServiceLevelObjsInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computeResourceQuotaLimits, flavoursSupported, networkResources, reservedComputeResources, zoneId, zoneServiceLevelObjsInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200AcceptedZoneResourceInfo {\n");
    
    sb.append("    computeResourceQuotaLimits: ").append(toIndentedString(computeResourceQuotaLimits)).append("\n");
    sb.append("    flavoursSupported: ").append(toIndentedString(flavoursSupported)).append("\n");
    sb.append("    networkResources: ").append(toIndentedString(networkResources)).append("\n");
    sb.append("    reservedComputeResources: ").append(toIndentedString(reservedComputeResources)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    zoneServiceLevelObjsInfo: ").append(toIndentedString(zoneServiceLevelObjsInfo)).append("\n");
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
