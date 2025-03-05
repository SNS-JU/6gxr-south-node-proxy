package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InlineResponse404
 */
@Validated

public class InlineResponse404 extends ErrorInfo  {
  @JsonProperty("status")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object inlineResponse404Status = null;

  @JsonProperty("code")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object inlineResponse404Code = null;


  public InlineResponse404 inlineResponse404Status(Object inlineResponse404Status) { 

    this.inlineResponse404Status = inlineResponse404Status;
    return this;
  }

  /**
   * Get inlineResponse404Status
   * @return inlineResponse404Status
   **/
  
  @Schema(description = "")
  
  public Object getInlineResponse404Status() {  
    return inlineResponse404Status;
  }



  public void setInlineResponse404Status(Object inlineResponse404Status) { 
    this.inlineResponse404Status = inlineResponse404Status;
  }

  public InlineResponse404 inlineResponse404Code(Object inlineResponse404Code) { 

    this.inlineResponse404Code = inlineResponse404Code;
    return this;
  }

  /**
   * Get inlineResponse404Code
   * @return inlineResponse404Code
   **/
  
  @Schema(description = "")
  
  public Object getInlineResponse404Code() {  
    return inlineResponse404Code;
  }



  public void setInlineResponse404Code(Object inlineResponse404Code) { 
    this.inlineResponse404Code = inlineResponse404Code;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse404 inlineResponse404 = (InlineResponse404) o;
    return Objects.equals(this.inlineResponse404Status, inlineResponse404.inlineResponse404Status) &&
        Objects.equals(this.inlineResponse404Code, inlineResponse404.inlineResponse404Code) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse404Status, inlineResponse404Code, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse404 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse404Status: ").append(toIndentedString(inlineResponse404Status)).append("\n");
    sb.append("    inlineResponse404Code: ").append(toIndentedString(inlineResponse404Code)).append("\n");
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
