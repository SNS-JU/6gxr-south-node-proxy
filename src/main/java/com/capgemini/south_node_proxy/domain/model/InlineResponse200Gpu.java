package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InlineResponse200Gpu
 */
@Validated
public class InlineResponse200Gpu   {
  @JsonProperty("gpuMemory")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer gpuMemory = null;

  @JsonProperty("gpuModeName")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String gpuModeName = null;

  @JsonProperty("gpuVendorType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String gpuVendorType = null;

  @JsonProperty("numGPU")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer numGPU = null;


  public InlineResponse200Gpu gpuMemory(Integer gpuMemory) { 

    this.gpuMemory = gpuMemory;
    return this;
  }

  /**
   * Get gpuMemory
   * @return gpuMemory
   **/
  
  @Schema(description = "")
  
  public Integer getGpuMemory() {  
    return gpuMemory;
  }



  public void setGpuMemory(Integer gpuMemory) { 
    this.gpuMemory = gpuMemory;
  }

  public InlineResponse200Gpu gpuModeName(String gpuModeName) { 

    this.gpuModeName = gpuModeName;
    return this;
  }

  /**
   * Get gpuModeName
   * @return gpuModeName
   **/
  
  @Schema(description = "")
  
  public String getGpuModeName() {  
    return gpuModeName;
  }



  public void setGpuModeName(String gpuModeName) { 
    this.gpuModeName = gpuModeName;
  }

  public InlineResponse200Gpu gpuVendorType(String gpuVendorType) { 

    this.gpuVendorType = gpuVendorType;
    return this;
  }

  /**
   * Get gpuVendorType
   * @return gpuVendorType
   **/
  
  @Schema(description = "")
  
  public String getGpuVendorType() {  
    return gpuVendorType;
  }



  public void setGpuVendorType(String gpuVendorType) { 
    this.gpuVendorType = gpuVendorType;
  }

  public InlineResponse200Gpu numGPU(Integer numGPU) { 

    this.numGPU = numGPU;
    return this;
  }

  /**
   * Get numGPU
   * @return numGPU
   **/
  
  @Schema(description = "")
  
  public Integer getNumGPU() {  
    return numGPU;
  }



  public void setNumGPU(Integer numGPU) { 
    this.numGPU = numGPU;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Gpu inlineResponse200Gpu = (InlineResponse200Gpu) o;
    return Objects.equals(this.gpuMemory, inlineResponse200Gpu.gpuMemory) &&
        Objects.equals(this.gpuModeName, inlineResponse200Gpu.gpuModeName) &&
        Objects.equals(this.gpuVendorType, inlineResponse200Gpu.gpuVendorType) &&
        Objects.equals(this.numGPU, inlineResponse200Gpu.numGPU);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gpuMemory, gpuModeName, gpuVendorType, numGPU);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Gpu {\n");
    
    sb.append("    gpuMemory: ").append(toIndentedString(gpuMemory)).append("\n");
    sb.append("    gpuModeName: ").append(toIndentedString(gpuModeName)).append("\n");
    sb.append("    gpuVendorType: ").append(toIndentedString(gpuVendorType)).append("\n");
    sb.append("    numGPU: ").append(toIndentedString(numGPU)).append("\n");
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
