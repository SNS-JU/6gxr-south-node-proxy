package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InlineResponse401
 */
@Validated

public class InlineResponse401 extends ErrorInfo  {
  @JsonProperty("status")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object inlineResponse401Status = null;

  @JsonProperty("code")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object inlineResponse401Code = null;


  public InlineResponse401 inlineResponse401Status(Object inlineResponse401Status) { 

    this.inlineResponse401Status = inlineResponse401Status;
    return this;
  }

  /**
   * Get inlineResponse401Status
   * @return inlineResponse401Status
   **/
  
  @Schema(description = "")
  
  public Object getInlineResponse401Status() {  
    return inlineResponse401Status;
  }



  public void setInlineResponse401Status(Object inlineResponse401Status) { 
    this.inlineResponse401Status = inlineResponse401Status;
  }

  public InlineResponse401 inlineResponse401Code(Object inlineResponse401Code) { 

    this.inlineResponse401Code = inlineResponse401Code;
    return this;
  }

  /**
   * Get inlineResponse401Code
   * @return inlineResponse401Code
   **/
  
  @Schema(description = "")
  
  public Object getInlineResponse401Code() {  
    return inlineResponse401Code;
  }



  public void setInlineResponse401Code(Object inlineResponse401Code) { 
    this.inlineResponse401Code = inlineResponse401Code;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse401 inlineResponse401 = (InlineResponse401) o;
    return Objects.equals(this.inlineResponse401Status, inlineResponse401.inlineResponse401Status) &&
        Objects.equals(this.inlineResponse401Code, inlineResponse401.inlineResponse401Code) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse401Status, inlineResponse401Code, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse401 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse401Status: ").append(toIndentedString(inlineResponse401Status)).append("\n");
    sb.append("    inlineResponse401Code: ").append(toIndentedString(inlineResponse401Code)).append("\n");
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
