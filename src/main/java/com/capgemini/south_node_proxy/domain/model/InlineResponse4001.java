package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InlineResponse4001
 */
@Validated

public class InlineResponse4001 extends ErrorInfo  {
  @JsonProperty("status")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object inlineResponse4001Status = null;

  @JsonProperty("code")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object inlineResponse4001Code = null;


  public InlineResponse4001 inlineResponse4001Status(Object inlineResponse4001Status) { 

    this.inlineResponse4001Status = inlineResponse4001Status;
    return this;
  }

  /**
   * Get inlineResponse4001Status
   * @return inlineResponse4001Status
   **/
  
  @Schema(description = "")
  
  public Object getInlineResponse4001Status() {  
    return inlineResponse4001Status;
  }



  public void setInlineResponse4001Status(Object inlineResponse4001Status) { 
    this.inlineResponse4001Status = inlineResponse4001Status;
  }

  public InlineResponse4001 inlineResponse4001Code(Object inlineResponse4001Code) { 

    this.inlineResponse4001Code = inlineResponse4001Code;
    return this;
  }

  /**
   * Get inlineResponse4001Code
   * @return inlineResponse4001Code
   **/
  
  @Schema(description = "")
  
  public Object getInlineResponse4001Code() {  
    return inlineResponse4001Code;
  }



  public void setInlineResponse4001Code(Object inlineResponse4001Code) { 
    this.inlineResponse4001Code = inlineResponse4001Code;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4001 inlineResponse4001 = (InlineResponse4001) o;
    return Objects.equals(this.inlineResponse4001Status, inlineResponse4001.inlineResponse4001Status) &&
        Objects.equals(this.inlineResponse4001Code, inlineResponse4001.inlineResponse4001Code) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4001Status, inlineResponse4001Code, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4001 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4001Status: ").append(toIndentedString(inlineResponse4001Status)).append("\n");
    sb.append("    inlineResponse4001Code: ").append(toIndentedString(inlineResponse4001Code)).append("\n");
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
