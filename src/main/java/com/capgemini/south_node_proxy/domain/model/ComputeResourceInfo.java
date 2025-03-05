package com.capgemini.south_node_proxy.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ComputeResourceInfo
 */
@Validated

public class ComputeResourceInfo   {
  /**
   * CPU Instruction Set Architecture (ISA) E.g., Intel, Arm etc.
   */
  public enum CpuArchTypeEnum {
    X86_64("ISA_X86_64"),
    
    ARM_64("ISA_ARM_64");

    private String value;

    CpuArchTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CpuArchTypeEnum fromValue(String text) {
      for (CpuArchTypeEnum b : CpuArchTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("cpuArchType")

  private CpuArchTypeEnum cpuArchType = null;

  @JsonProperty("numCPU")

  private Integer numCPU = null;

  @JsonProperty("memory")

  private Long memory = null;

  @JsonProperty("diskStorage")

  private Integer diskStorage = null;

  @JsonProperty("gpu")
  @Valid
  private List<GpuInfo> gpu = null;
  @JsonProperty("vpu")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer vpu = null;

  @JsonProperty("fpga")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer fpga = null;

  @JsonProperty("hugepages")
  @Valid
  private List<HugePage> hugepages = null;
  @JsonProperty("cpuExclusivity")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Boolean cpuExclusivity = null;


  public ComputeResourceInfo cpuArchType(CpuArchTypeEnum cpuArchType) { 

    this.cpuArchType = cpuArchType;
    return this;
  }

  /**
   * CPU Instruction Set Architecture (ISA) E.g., Intel, Arm etc.
   * @return cpuArchType
   **/
  
  @Schema(required = true, description = "CPU Instruction Set Architecture (ISA) E.g., Intel, Arm etc.")
  
  @NotNull
  public CpuArchTypeEnum getCpuArchType() {  
    return cpuArchType;
  }



  public void setCpuArchType(CpuArchTypeEnum cpuArchType) { 

    this.cpuArchType = cpuArchType;
  }

  public ComputeResourceInfo numCPU(Integer numCPU) { 

    this.numCPU = numCPU;
    return this;
  }

  /**
   * Number of available vCPUs.
   * @return numCPU
   **/
  
  @Schema(required = true, description = "Number of available vCPUs.")
  
  @NotNull
  public Integer getNumCPU() {  
    return numCPU;
  }



  public void setNumCPU(Integer numCPU) { 

    this.numCPU = numCPU;
  }

  public ComputeResourceInfo memory(Long memory) { 

    this.memory = memory;
    return this;
  }

  /**
   * Amount of RAM  in mega bytes
   * @return memory
   **/
  
  @Schema(required = true, description = "Amount of RAM  in mega bytes")
  
  @NotNull
  public Long getMemory() {  
    return memory;
  }



  public void setMemory(Long memory) { 

    this.memory = memory;
  }

  public ComputeResourceInfo diskStorage(Integer diskStorage) { 

    this.diskStorage = diskStorage;
    return this;
  }

  /**
   * Amount of disk storage  in giga bytes for a given ISA type
   * @return diskStorage
   **/
  
  @Schema(required = true, description = "Amount of disk storage  in giga bytes for a given ISA type")
  
  @NotNull
  public Integer getDiskStorage() {  
    return diskStorage;
  }



  public void setDiskStorage(Integer diskStorage) { 

    this.diskStorage = diskStorage;
  }

  public ComputeResourceInfo gpu(List<GpuInfo> gpu) { 

    this.gpu = gpu;
    return this;
  }

  public ComputeResourceInfo addGpuItem(GpuInfo gpuItem) {
    if (this.gpu == null) {
      this.gpu = new ArrayList<GpuInfo>();
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
  public List<GpuInfo> getGpu() {  
    return gpu;
  }



  public void setGpu(List<GpuInfo> gpu) { 
    this.gpu = gpu;
  }

  public ComputeResourceInfo vpu(Integer vpu) { 

    this.vpu = vpu;
    return this;
  }

  /**
   * Number of Intel VPUs available for a given ISA type
   * @return vpu
   **/
  
  @Schema(description = "Number of Intel VPUs available for a given ISA type")
  
  public Integer getVpu() {  
    return vpu;
  }



  public void setVpu(Integer vpu) { 
    this.vpu = vpu;
  }

  public ComputeResourceInfo fpga(Integer fpga) { 

    this.fpga = fpga;
    return this;
  }

  /**
   * Number of FPGAs available for a given ISA type
   * @return fpga
   **/
  
  @Schema(description = "Number of FPGAs available for a given ISA type")
  
  public Integer getFpga() {  
    return fpga;
  }



  public void setFpga(Integer fpga) { 
    this.fpga = fpga;
  }

  public ComputeResourceInfo hugepages(List<HugePage> hugepages) { 

    this.hugepages = hugepages;
    return this;
  }

  public ComputeResourceInfo addHugepagesItem(HugePage hugepagesItem) {
    if (this.hugepages == null) {
      this.hugepages = new ArrayList<HugePage>();
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
  public List<HugePage> getHugepages() {  
    return hugepages;
  }



  public void setHugepages(List<HugePage> hugepages) { 
    this.hugepages = hugepages;
  }

  public ComputeResourceInfo cpuExclusivity(Boolean cpuExclusivity) { 

    this.cpuExclusivity = cpuExclusivity;
    return this;
  }

  /**
   * Support for exclusive CPUs
   * @return cpuExclusivity
   **/
  
  @Schema(description = "Support for exclusive CPUs")
  
  public Boolean isCpuExclusivity() {  
    return cpuExclusivity;
  }



  public void setCpuExclusivity(Boolean cpuExclusivity) { 
    this.cpuExclusivity = cpuExclusivity;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputeResourceInfo computeResourceInfo = (ComputeResourceInfo) o;
    return Objects.equals(this.cpuArchType, computeResourceInfo.cpuArchType) &&
        Objects.equals(this.numCPU, computeResourceInfo.numCPU) &&
        Objects.equals(this.memory, computeResourceInfo.memory) &&
        Objects.equals(this.diskStorage, computeResourceInfo.diskStorage) &&
        Objects.equals(this.gpu, computeResourceInfo.gpu) &&
        Objects.equals(this.vpu, computeResourceInfo.vpu) &&
        Objects.equals(this.fpga, computeResourceInfo.fpga) &&
        Objects.equals(this.hugepages, computeResourceInfo.hugepages) &&
        Objects.equals(this.cpuExclusivity, computeResourceInfo.cpuExclusivity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuArchType, numCPU, memory, diskStorage, gpu, vpu, fpga, hugepages, cpuExclusivity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputeResourceInfo {\n");
    
    sb.append("    cpuArchType: ").append(toIndentedString(cpuArchType)).append("\n");
    sb.append("    numCPU: ").append(toIndentedString(numCPU)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    diskStorage: ").append(toIndentedString(diskStorage)).append("\n");
    sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
    sb.append("    vpu: ").append(toIndentedString(vpu)).append("\n");
    sb.append("    fpga: ").append(toIndentedString(fpga)).append("\n");
    sb.append("    hugepages: ").append(toIndentedString(hugepages)).append("\n");
    sb.append("    cpuExclusivity: ").append(toIndentedString(cpuExclusivity)).append("\n");
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
