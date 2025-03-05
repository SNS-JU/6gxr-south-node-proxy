package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InlineResponse422
 */
@Validated

public class InlineResponse422 extends ErrorInfo  {
  @JsonProperty("status")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object inlineResponse422Status = null;

  @JsonProperty("code")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object inlineResponse422Code = null;


  public InlineResponse422 inlineResponse422Status(Object inlineResponse422Status) { 

    this.inlineResponse422Status = inlineResponse422Status;
    return this;
  }

  /**
   * Get inlineResponse422Status
   * @return inlineResponse422Status
   **/
  
  @Schema(description = "")
  
  public Object getInlineResponse422Status() {  
    return inlineResponse422Status;
  }



  public void setInlineResponse422Status(Object inlineResponse422Status) { 
    this.inlineResponse422Status = inlineResponse422Status;
  }

  public InlineResponse422 inlineResponse422Code(Object inlineResponse422Code) { 

    this.inlineResponse422Code = inlineResponse422Code;
    return this;
  }

  /**
   * Get inlineResponse422Code
   * @return inlineResponse422Code
   **/
  
  @Schema(description = "")
  
  public Object getInlineResponse422Code() {  
    return inlineResponse422Code;
  }



  public void setInlineResponse422Code(Object inlineResponse422Code) { 
    this.inlineResponse422Code = inlineResponse422Code;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse422 inlineResponse422 = (InlineResponse422) o;
    return Objects.equals(this.inlineResponse422Status, inlineResponse422.inlineResponse422Status) &&
        Objects.equals(this.inlineResponse422Code, inlineResponse422.inlineResponse422Code) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse422Status, inlineResponse422Code, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse422 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse422Status: ").append(toIndentedString(inlineResponse422Status)).append("\n");
    sb.append("    inlineResponse422Code: ").append(toIndentedString(inlineResponse422Code)).append("\n");
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
