package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Human readable name of the geographical Edge Cloud Region of the Edge Cloud. Defined by the Edge Cloud Provider. 
 */
@Schema(description = "Human readable name of the geographical Edge Cloud Region of the Edge Cloud. Defined by the Edge Cloud Provider. ")
@Validated


public class EdgeCloudRegion   {

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
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeCloudRegion {\n");
    
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
