package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/**
 * PortsSpecRanges
 */
@Validated

public class PortsSpecRanges   {
  @JsonProperty("from")

  private Integer from = null;

  @JsonProperty("to")

  private Integer to = null;


  public PortsSpecRanges from(Integer from) { 

    this.from = from;
    return this;
  }

  /**
   * TCP or UDP port number
   * minimum: 0
   * maximum: 65535
   * @return from
   **/
  
  @Schema(required = true, description = "TCP or UDP port number")
  
  @NotNull
@Min(0) @Max(65535)   public Integer getFrom() {  
    return from;
  }



  public void setFrom(Integer from) { 

    this.from = from;
  }

  public PortsSpecRanges to(Integer to) { 

    this.to = to;
    return this;
  }

  /**
   * TCP or UDP port number
   * minimum: 0
   * maximum: 65535
   * @return to
   **/
  
  @Schema(required = true, description = "TCP or UDP port number")
  
  @NotNull
@Min(0) @Max(65535)   public Integer getTo() {  
    return to;
  }



  public void setTo(Integer to) { 

    this.to = to;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortsSpecRanges portsSpecRanges = (PortsSpecRanges) o;
    return Objects.equals(this.from, portsSpecRanges.from) &&
        Objects.equals(this.to, portsSpecRanges.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortsSpecRanges {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
