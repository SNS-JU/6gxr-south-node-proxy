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

@Validated
public class InlineResponse200FlavoursSupported   {
  @JsonProperty("cpuArchType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String cpuArchType = null;

  @JsonProperty("cpuExclusivity")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Boolean cpuExclusivity = null;

  @JsonProperty("flavourId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String flavourId = null;

  @JsonProperty("fpga")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer fpga = null;

  @JsonProperty("gpu")
  @Valid
  private List<InlineResponse200Gpu> gpu = null;
  @JsonProperty("hugepages")
  @Valid
  private List<InlineResponse200Hugepages> hugepages = null;
  @JsonProperty("memorySize")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer memorySize = null;

  @JsonProperty("numCPU")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer numCPU = null;

  @JsonProperty("storageSize")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer storageSize = null;

  @JsonProperty("supportedOSTypes")
  @Valid
  private List<InlineResponse200SupportedOSTypes> supportedOSTypes = null;
  @JsonProperty("vpu")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer vpu = null;


  public InlineResponse200FlavoursSupported cpuArchType(String cpuArchType) { 

    this.cpuArchType = cpuArchType;
    return this;
  }

  /**
   * Get cpuArchType
   * @return cpuArchType
   **/
  
  @Schema(example = "ISA_X86", description = "")
  
  public String getCpuArchType() {  
    return cpuArchType;
  }



  public void setCpuArchType(String cpuArchType) { 
    this.cpuArchType = cpuArchType;
  }

  public InlineResponse200FlavoursSupported cpuExclusivity(Boolean cpuExclusivity) { 

    this.cpuExclusivity = cpuExclusivity;
    return this;
  }

  /**
   * Get cpuExclusivity
   * @return cpuExclusivity
   **/
  
  @Schema(description = "")
  
  public Boolean isCpuExclusivity() {  
    return cpuExclusivity;
  }



  public void setCpuExclusivity(Boolean cpuExclusivity) { 
    this.cpuExclusivity = cpuExclusivity;
  }

  public InlineResponse200FlavoursSupported flavourId(String flavourId) { 

    this.flavourId = flavourId;
    return this;
  }

  /**
   * Get flavourId
   * @return flavourId
   **/
  
  @Schema(description = "")
  
  public String getFlavourId() {  
    return flavourId;
  }



  public void setFlavourId(String flavourId) { 
    this.flavourId = flavourId;
  }

  public InlineResponse200FlavoursSupported fpga(Integer fpga) { 

    this.fpga = fpga;
    return this;
  }

  /**
   * Get fpga
   * @return fpga
   **/
  
  @Schema(description = "")
  
  public Integer getFpga() {  
    return fpga;
  }



  public void setFpga(Integer fpga) { 
    this.fpga = fpga;
  }

  public InlineResponse200FlavoursSupported gpu(List<InlineResponse200Gpu> gpu) { 

    this.gpu = gpu;
    return this;
  }

  public InlineResponse200FlavoursSupported addGpuItem(InlineResponse200Gpu gpuItem) {
    if (this.gpu == null) {
      this.gpu = new ArrayList<InlineResponse200Gpu>();
    }
    this.gpu.add(gpuItem);
    return this;
  }

  /**
   * Get gpu
   * @return gpu
   **/
  
  @Schema(description = "")
  @Valid
  public List<InlineResponse200Gpu> getGpu() {  
    return gpu;
  }



  public void setGpu(List<InlineResponse200Gpu> gpu) { 
    this.gpu = gpu;
  }

  public InlineResponse200FlavoursSupported hugepages(List<InlineResponse200Hugepages> hugepages) { 

    this.hugepages = hugepages;
    return this;
  }

  public InlineResponse200FlavoursSupported addHugepagesItem(InlineResponse200Hugepages hugepagesItem) {
    if (this.hugepages == null) {
      this.hugepages = new ArrayList<InlineResponse200Hugepages>();
    }
    this.hugepages.add(hugepagesItem);
    return this;
  }

  /**
   * Get hugepages
   * @return hugepages
   **/
  
  @Schema(description = "")
  @Valid
  public List<InlineResponse200Hugepages> getHugepages() {  
    return hugepages;
  }



  public void setHugepages(List<InlineResponse200Hugepages> hugepages) { 
    this.hugepages = hugepages;
  }

  public InlineResponse200FlavoursSupported memorySize(Integer memorySize) { 

    this.memorySize = memorySize;
    return this;
  }

  /**
   * Get memorySize
   * @return memorySize
   **/
  
  @Schema(description = "")
  
  public Integer getMemorySize() {  
    return memorySize;
  }



  public void setMemorySize(Integer memorySize) { 
    this.memorySize = memorySize;
  }

  public InlineResponse200FlavoursSupported numCPU(Integer numCPU) { 

    this.numCPU = numCPU;
    return this;
  }

  /**
   * Get numCPU
   * @return numCPU
   **/
  
  @Schema(description = "")
  
  public Integer getNumCPU() {  
    return numCPU;
  }



  public void setNumCPU(Integer numCPU) { 
    this.numCPU = numCPU;
  }

  public InlineResponse200FlavoursSupported storageSize(Integer storageSize) { 

    this.storageSize = storageSize;
    return this;
  }

  /**
   * Get storageSize
   * @return storageSize
   **/
  
  @Schema(description = "")
  
  public Integer getStorageSize() {  
    return storageSize;
  }



  public void setStorageSize(Integer storageSize) { 
    this.storageSize = storageSize;
  }

  public InlineResponse200FlavoursSupported supportedOSTypes(List<InlineResponse200SupportedOSTypes> supportedOSTypes) { 

    this.supportedOSTypes = supportedOSTypes;
    return this;
  }

  public InlineResponse200FlavoursSupported addSupportedOSTypesItem(InlineResponse200SupportedOSTypes supportedOSTypesItem) {
    if (this.supportedOSTypes == null) {
      this.supportedOSTypes = new ArrayList<InlineResponse200SupportedOSTypes>();
    }
    this.supportedOSTypes.add(supportedOSTypesItem);
    return this;
  }

  /**
   * Get supportedOSTypes
   * @return supportedOSTypes
   **/
  
  @Schema(description = "")
  @Valid
  public List<InlineResponse200SupportedOSTypes> getSupportedOSTypes() {  
    return supportedOSTypes;
  }



  public void setSupportedOSTypes(List<InlineResponse200SupportedOSTypes> supportedOSTypes) { 
    this.supportedOSTypes = supportedOSTypes;
  }

  public InlineResponse200FlavoursSupported vpu(Integer vpu) { 

    this.vpu = vpu;
    return this;
  }

  /**
   * Get vpu
   * @return vpu
   **/
  
  @Schema(description = "")
  
  public Integer getVpu() {  
    return vpu;
  }



  public void setVpu(Integer vpu) { 
    this.vpu = vpu;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200FlavoursSupported inlineResponse200FlavoursSupported = (InlineResponse200FlavoursSupported) o;
    return Objects.equals(this.cpuArchType, inlineResponse200FlavoursSupported.cpuArchType) &&
        Objects.equals(this.cpuExclusivity, inlineResponse200FlavoursSupported.cpuExclusivity) &&
        Objects.equals(this.flavourId, inlineResponse200FlavoursSupported.flavourId) &&
        Objects.equals(this.fpga, inlineResponse200FlavoursSupported.fpga) &&
        Objects.equals(this.gpu, inlineResponse200FlavoursSupported.gpu) &&
        Objects.equals(this.hugepages, inlineResponse200FlavoursSupported.hugepages) &&
        Objects.equals(this.memorySize, inlineResponse200FlavoursSupported.memorySize) &&
        Objects.equals(this.numCPU, inlineResponse200FlavoursSupported.numCPU) &&
        Objects.equals(this.storageSize, inlineResponse200FlavoursSupported.storageSize) &&
        Objects.equals(this.supportedOSTypes, inlineResponse200FlavoursSupported.supportedOSTypes) &&
        Objects.equals(this.vpu, inlineResponse200FlavoursSupported.vpu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuArchType, cpuExclusivity, flavourId, fpga, gpu, hugepages, memorySize, numCPU, storageSize, supportedOSTypes, vpu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200FlavoursSupported {\n");
    
    sb.append("    cpuArchType: ").append(toIndentedString(cpuArchType)).append("\n");
    sb.append("    cpuExclusivity: ").append(toIndentedString(cpuExclusivity)).append("\n");
    sb.append("    flavourId: ").append(toIndentedString(flavourId)).append("\n");
    sb.append("    fpga: ").append(toIndentedString(fpga)).append("\n");
    sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
    sb.append("    hugepages: ").append(toIndentedString(hugepages)).append("\n");
    sb.append("    memorySize: ").append(toIndentedString(memorySize)).append("\n");
    sb.append("    numCPU: ").append(toIndentedString(numCPU)).append("\n");
    sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");
    sb.append("    supportedOSTypes: ").append(toIndentedString(supportedOSTypes)).append("\n");
    sb.append("    vpu: ").append(toIndentedString(vpu)).append("\n");
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
