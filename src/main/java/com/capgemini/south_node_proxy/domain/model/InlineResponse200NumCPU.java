package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

@Validated
public class InlineResponse200NumCPU   {
  @JsonProperty("value")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer value = null;

  @JsonProperty("whole")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private InlineResponse200NumCPUWhole whole = null;


  public InlineResponse200NumCPU value(Integer value) { 

    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  
  @Schema(description = "")
  
  public Integer getValue() {  
    return value;
  }



  public void setValue(Integer value) { 
    this.value = value;
  }

  public InlineResponse200NumCPU whole(InlineResponse200NumCPUWhole whole) { 

    this.whole = whole;
    return this;
  }

  /**
   * Get whole
   * @return whole
   **/
  
  @Schema(description = "")
  
@Valid
  public InlineResponse200NumCPUWhole getWhole() {  
    return whole;
  }



  public void setWhole(InlineResponse200NumCPUWhole whole) { 
    this.whole = whole;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200NumCPU inlineResponse200NumCPU = (InlineResponse200NumCPU) o;
    return Objects.equals(this.value, inlineResponse200NumCPU.value) &&
        Objects.equals(this.whole, inlineResponse200NumCPU.whole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, whole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200NumCPU {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    whole: ").append(toIndentedString(whole)).append("\n");
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
