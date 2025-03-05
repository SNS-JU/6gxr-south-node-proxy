package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The ports used locally by the device for flows to which the requested QoS profile should apply. If omitted, then the qosProfile will apply to all flows between the device and the specified application server address and ports
 */
@Schema(description = "The ports used locally by the device for flows to which the requested QoS profile should apply. If omitted, then the qosProfile will apply to all flows between the device and the specified application server address and ports")
@Validated

public class AllOfBaseSessionInfoDevicePorts extends PortsSpec  {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfBaseSessionInfoDevicePorts {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
