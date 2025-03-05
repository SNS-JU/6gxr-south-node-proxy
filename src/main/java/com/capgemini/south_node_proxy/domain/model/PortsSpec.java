package com.capgemini.south_node_proxy.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

/**
 * Specification of several TCP or UDP ports
 */
@Schema(description = "Specification of several TCP or UDP ports")
@Validated

public class PortsSpec   {
  @JsonProperty("ranges")
  @Valid
  private List<PortsSpecRanges> ranges = null;
  @JsonProperty("ports")
  @Valid
  private List<Integer> ports = null;

  public PortsSpec ranges(List<PortsSpecRanges> ranges) { 

    this.ranges = ranges;
    return this;
  }

  public PortsSpec addRangesItem(PortsSpecRanges rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<PortsSpecRanges>();
    }
    this.ranges.add(rangesItem);
    return this;
  }

  /**
   * Range of TCP or UDP ports
   * @return ranges
   **/
  
  @Schema(description = "Range of TCP or UDP ports")
  @Valid
@Size(min=1)   public List<PortsSpecRanges> getRanges() {  
    return ranges;
  }



  public void setRanges(List<PortsSpecRanges> ranges) { 
    this.ranges = ranges;
  }

  public PortsSpec ports(List<Integer> ports) { 

    this.ports = ports;
    return this;
  }

  public PortsSpec addPortsItem(Integer portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<Integer>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * Array of TCP or UDP ports
   * @return ports
   **/
  
  @Schema(description = "Array of TCP or UDP ports")
  
@Size(min=1)   public List<Integer> getPorts() {  
    return ports;
  }



  public void setPorts(List<Integer> ports) { 
    this.ports = ports;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortsSpec portsSpec = (PortsSpec) o;
    return Objects.equals(this.ranges, portsSpec.ranges) &&
        Objects.equals(this.ports, portsSpec.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranges, ports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortsSpec {\n");
    
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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
