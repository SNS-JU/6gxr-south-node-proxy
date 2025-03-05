package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InlineResponse403
 */
@Validated

public class InlineResponse403 extends ErrorInfo  {
  @JsonProperty("status")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object inlineResponse403Status = null;

  @JsonProperty("code")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object inlineResponse403Code = null;


  public InlineResponse403 inlineResponse403Status(Object inlineResponse403Status) { 

    this.inlineResponse403Status = inlineResponse403Status;
    return this;
  }

  /**
   * Get inlineResponse403Status
   * @return inlineResponse403Status
   **/
  
  @Schema(description = "")
  
  public Object getInlineResponse403Status() {  
    return inlineResponse403Status;
  }



  public void setInlineResponse403Status(Object inlineResponse403Status) { 
    this.inlineResponse403Status = inlineResponse403Status;
  }

  public InlineResponse403 inlineResponse403Code(Object inlineResponse403Code) { 

    this.inlineResponse403Code = inlineResponse403Code;
    return this;
  }

  /**
   * Get inlineResponse403Code
   * @return inlineResponse403Code
   **/
  
  @Schema(description = "")
  
  public Object getInlineResponse403Code() {  
    return inlineResponse403Code;
  }



  public void setInlineResponse403Code(Object inlineResponse403Code) { 
    this.inlineResponse403Code = inlineResponse403Code;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse403 inlineResponse403 = (InlineResponse403) o;
    return Objects.equals(this.inlineResponse403Status, inlineResponse403.inlineResponse403Status) &&
        Objects.equals(this.inlineResponse403Code, inlineResponse403.inlineResponse403Code) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse403Status, inlineResponse403Code, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse403 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse403Status: ").append(toIndentedString(inlineResponse403Status)).append("\n");
    sb.append("    inlineResponse403Code: ").append(toIndentedString(inlineResponse403Code)).append("\n");
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
