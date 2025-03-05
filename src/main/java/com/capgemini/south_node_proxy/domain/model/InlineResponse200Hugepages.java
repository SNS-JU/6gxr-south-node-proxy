package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

@Validated
public class InlineResponse200Hugepages   {
  @JsonProperty("number")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer number = null;

  @JsonProperty("pageSize")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String pageSize = null;


  public InlineResponse200Hugepages number(Integer number) { 

    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
   **/
  
  @Schema(description = "")
  
  public Integer getNumber() {  
    return number;
  }



  public void setNumber(Integer number) { 
    this.number = number;
  }

  public InlineResponse200Hugepages pageSize(String pageSize) { 

    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
   **/
  
  @Schema(description = "")
  
  public String getPageSize() {  
    return pageSize;
  }



  public void setPageSize(String pageSize) { 
    this.pageSize = pageSize;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Hugepages inlineResponse200Hugepages = (InlineResponse200Hugepages) o;
    return Objects.equals(this.number, inlineResponse200Hugepages.number) &&
        Objects.equals(this.pageSize, inlineResponse200Hugepages.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Hugepages {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
