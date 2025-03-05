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
public class InlineResponse200ComputeResourceQuotaLimits   {
  @JsonProperty("cpuArchType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String cpuArchType = null;

  @JsonProperty("cpuExclusivity")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Boolean cpuExclusivity = null;

  @JsonProperty("diskStorage")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer diskStorage = null;

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
  @JsonProperty("memory")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer memory = null;

  @JsonProperty("numCPU")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private InlineResponse200NumCPU numCPU = null;

  @JsonProperty("vpu")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer vpu = null;


  public InlineResponse200ComputeResourceQuotaLimits cpuArchType(String cpuArchType) { 

    this.cpuArchType = cpuArchType;
    return this;
  }

  /**
   * Get cpuArchType
   * @return cpuArchType
   **/
  
  @Schema(example = "ISA_X86_64", description = "")
  
  public String getCpuArchType() {  
    return cpuArchType;
  }



  public void setCpuArchType(String cpuArchType) { 
    this.cpuArchType = cpuArchType;
  }

  public InlineResponse200ComputeResourceQuotaLimits cpuExclusivity(Boolean cpuExclusivity) { 

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

  public InlineResponse200ComputeResourceQuotaLimits diskStorage(Integer diskStorage) { 

    this.diskStorage = diskStorage;
    return this;
  }

  /**
   * Get diskStorage
   * @return diskStorage
   **/
  
  @Schema(description = "")
  
  public Integer getDiskStorage() {  
    return diskStorage;
  }



  public void setDiskStorage(Integer diskStorage) { 
    this.diskStorage = diskStorage;
  }

  public InlineResponse200ComputeResourceQuotaLimits fpga(Integer fpga) { 

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

  public InlineResponse200ComputeResourceQuotaLimits gpu(List<InlineResponse200Gpu> gpu) { 

    this.gpu = gpu;
    return this;
  }

  public InlineResponse200ComputeResourceQuotaLimits addGpuItem(InlineResponse200Gpu gpuItem) {
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

  public InlineResponse200ComputeResourceQuotaLimits hugepages(List<InlineResponse200Hugepages> hugepages) { 

    this.hugepages = hugepages;
    return this;
  }

  public InlineResponse200ComputeResourceQuotaLimits addHugepagesItem(InlineResponse200Hugepages hugepagesItem) {
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

  public InlineResponse200ComputeResourceQuotaLimits memory(Integer memory) { 

    this.memory = memory;
    return this;
  }

  /**
   * Get memory
   * @return memory
   **/
  
  @Schema(description = "")
  
  public Integer getMemory() {  
    return memory;
  }



  public void setMemory(Integer memory) { 
    this.memory = memory;
  }

  public InlineResponse200ComputeResourceQuotaLimits numCPU(InlineResponse200NumCPU numCPU) { 

    this.numCPU = numCPU;
    return this;
  }

  /**
   * Get numCPU
   * @return numCPU
   **/
  
  @Schema(description = "")
  
@Valid
  public InlineResponse200NumCPU getNumCPU() {  
    return numCPU;
  }



  public void setNumCPU(InlineResponse200NumCPU numCPU) { 
    this.numCPU = numCPU;
  }

  public InlineResponse200ComputeResourceQuotaLimits vpu(Integer vpu) { 

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
    InlineResponse200ComputeResourceQuotaLimits inlineResponse200ComputeResourceQuotaLimits = (InlineResponse200ComputeResourceQuotaLimits) o;
    return Objects.equals(this.cpuArchType, inlineResponse200ComputeResourceQuotaLimits.cpuArchType) &&
        Objects.equals(this.cpuExclusivity, inlineResponse200ComputeResourceQuotaLimits.cpuExclusivity) &&
        Objects.equals(this.diskStorage, inlineResponse200ComputeResourceQuotaLimits.diskStorage) &&
        Objects.equals(this.fpga, inlineResponse200ComputeResourceQuotaLimits.fpga) &&
        Objects.equals(this.gpu, inlineResponse200ComputeResourceQuotaLimits.gpu) &&
        Objects.equals(this.hugepages, inlineResponse200ComputeResourceQuotaLimits.hugepages) &&
        Objects.equals(this.memory, inlineResponse200ComputeResourceQuotaLimits.memory) &&
        Objects.equals(this.numCPU, inlineResponse200ComputeResourceQuotaLimits.numCPU) &&
        Objects.equals(this.vpu, inlineResponse200ComputeResourceQuotaLimits.vpu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuArchType, cpuExclusivity, diskStorage, fpga, gpu, hugepages, memory, numCPU, vpu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200ComputeResourceQuotaLimits {\n");
    
    sb.append("    cpuArchType: ").append(toIndentedString(cpuArchType)).append("\n");
    sb.append("    cpuExclusivity: ").append(toIndentedString(cpuExclusivity)).append("\n");
    sb.append("    diskStorage: ").append(toIndentedString(diskStorage)).append("\n");
    sb.append("    fpga: ").append(toIndentedString(fpga)).append("\n");
    sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
    sb.append("    hugepages: ").append(toIndentedString(hugepages)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    numCPU: ").append(toIndentedString(numCPU)).append("\n");
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
