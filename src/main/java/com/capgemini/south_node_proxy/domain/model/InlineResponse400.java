package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InlineResponse400
 */
@Validated

public class InlineResponse400 extends ErrorInfo  {
  @JsonProperty("status")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object inlineResponse400Status = null;

  @JsonProperty("code")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object inlineResponse400Code = null;


  public InlineResponse400 inlineResponse400Status(Object inlineResponse400Status) { 

    this.inlineResponse400Status = inlineResponse400Status;
    return this;
  }

  /**
   * Get inlineResponse400Status
   * @return inlineResponse400Status
   **/
  
  @Schema(description = "")
  
  public Object getInlineResponse400Status() {  
    return inlineResponse400Status;
  }



  public void setInlineResponse400Status(Object inlineResponse400Status) { 
    this.inlineResponse400Status = inlineResponse400Status;
  }

  public InlineResponse400 inlineResponse400Code(Object inlineResponse400Code) { 

    this.inlineResponse400Code = inlineResponse400Code;
    return this;
  }

  /**
   * Get inlineResponse400Code
   * @return inlineResponse400Code
   **/
  
  @Schema(description = "")
  
  public Object getInlineResponse400Code() {  
    return inlineResponse400Code;
  }



  public void setInlineResponse400Code(Object inlineResponse400Code) { 
    this.inlineResponse400Code = inlineResponse400Code;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse400 inlineResponse400 = (InlineResponse400) o;
    return Objects.equals(this.inlineResponse400Status, inlineResponse400.inlineResponse400Status) &&
        Objects.equals(this.inlineResponse400Code, inlineResponse400.inlineResponse400Code) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse400Status, inlineResponse400Code, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse400Status: ").append(toIndentedString(inlineResponse400Status)).append("\n");
    sb.append("    inlineResponse400Code: ").append(toIndentedString(inlineResponse400Code)).append("\n");
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
