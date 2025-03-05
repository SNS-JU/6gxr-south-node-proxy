package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * GpuInfo
 */
@Validated

public class GpuInfo   {
  /**
   * GPU vendor name e.g. NVIDIA, AMD etc.
   */
  public enum GpuVendorTypeEnum {
    NVIDIA("GPU_PROVIDER_NVIDIA"),
    
    AMD("GPU_PROVIDER_AMD");

    private String value;

    GpuVendorTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GpuVendorTypeEnum fromValue(String text) {
      for (GpuVendorTypeEnum b : GpuVendorTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("gpuVendorType")

  private GpuVendorTypeEnum gpuVendorType = null;

  @JsonProperty("gpuModeName")

  private String gpuModeName = null;

  @JsonProperty("gpuMemory")

  private Integer gpuMemory = null;

  @JsonProperty("numGPU")

  private Integer numGPU = null;


  public GpuInfo gpuVendorType(GpuVendorTypeEnum gpuVendorType) { 

    this.gpuVendorType = gpuVendorType;
    return this;
  }

  /**
   * GPU vendor name e.g. NVIDIA, AMD etc.
   * @return gpuVendorType
   **/
  
  @Schema(example = "Nvidia", required = true, description = "GPU vendor name e.g. NVIDIA, AMD etc.")
  
  @NotNull
  public GpuVendorTypeEnum getGpuVendorType() {  
    return gpuVendorType;
  }



  public void setGpuVendorType(GpuVendorTypeEnum gpuVendorType) { 

    this.gpuVendorType = gpuVendorType;
  }

  public GpuInfo gpuModeName(String gpuModeName) { 

    this.gpuModeName = gpuModeName;
    return this;
  }

  /**
   * Model name corresponding to vendorType may include info e.g. for NVIDIA, model name could be “Tesla M60”, “Tesla V100” etc.
   * @return gpuModeName
   **/
  
  @Schema(required = true, description = "Model name corresponding to vendorType may include info e.g. for NVIDIA, model name could be “Tesla M60”, “Tesla V100” etc.")
  
  @NotNull
  public String getGpuModeName() {  
    return gpuModeName;
  }



  public void setGpuModeName(String gpuModeName) { 

    this.gpuModeName = gpuModeName;
  }

  public GpuInfo gpuMemory(Integer gpuMemory) { 

    this.gpuMemory = gpuMemory;
    return this;
  }

  /**
   * GPU memory in mega bytes
   * @return gpuMemory
   **/
  
  @Schema(required = true, description = "GPU memory in mega bytes")
  
  @NotNull
  public Integer getGpuMemory() {  
    return gpuMemory;
  }



  public void setGpuMemory(Integer gpuMemory) { 

    this.gpuMemory = gpuMemory;
  }

  public GpuInfo numGPU(Integer numGPU) { 

    this.numGPU = numGPU;
    return this;
  }

  /**
   * Number of GPUs
   * @return numGPU
   **/
  
  @Schema(required = true, description = "Number of GPUs")
  
  @NotNull
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
    GpuInfo gpuInfo = (GpuInfo) o;
    return Objects.equals(this.gpuVendorType, gpuInfo.gpuVendorType) &&
        Objects.equals(this.gpuModeName, gpuInfo.gpuModeName) &&
        Objects.equals(this.gpuMemory, gpuInfo.gpuMemory) &&
        Objects.equals(this.numGPU, gpuInfo.numGPU);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gpuVendorType, gpuModeName, gpuMemory, numGPU);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GpuInfo {\n");
    
    sb.append("    gpuVendorType: ").append(toIndentedString(gpuVendorType)).append("\n");
    sb.append("    gpuModeName: ").append(toIndentedString(gpuModeName)).append("\n");
    sb.append("    gpuMemory: ").append(toIndentedString(gpuMemory)).append("\n");
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
