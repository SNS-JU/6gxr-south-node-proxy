package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InlineResponse429
 */
@Validated

public class InlineResponse429 extends ErrorInfo  {
  @JsonProperty("status")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object inlineResponse429Status = null;

  @JsonProperty("code")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object inlineResponse429Code = null;


  public InlineResponse429 inlineResponse429Status(Object inlineResponse429Status) { 

    this.inlineResponse429Status = inlineResponse429Status;
    return this;
  }

  /**
   * Get inlineResponse429Status
   * @return inlineResponse429Status
   **/
  
  @Schema(description = "")
  
  public Object getInlineResponse429Status() {  
    return inlineResponse429Status;
  }



  public void setInlineResponse429Status(Object inlineResponse429Status) { 
    this.inlineResponse429Status = inlineResponse429Status;
  }

  public InlineResponse429 inlineResponse429Code(Object inlineResponse429Code) { 

    this.inlineResponse429Code = inlineResponse429Code;
    return this;
  }

  /**
   * Get inlineResponse429Code
   * @return inlineResponse429Code
   **/
  
  @Schema(description = "")
  
  public Object getInlineResponse429Code() {  
    return inlineResponse429Code;
  }



  public void setInlineResponse429Code(Object inlineResponse429Code) { 
    this.inlineResponse429Code = inlineResponse429Code;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse429 inlineResponse429 = (InlineResponse429) o;
    return Objects.equals(this.inlineResponse429Status, inlineResponse429.inlineResponse429Status) &&
        Objects.equals(this.inlineResponse429Code, inlineResponse429.inlineResponse429Code) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse429Status, inlineResponse429Code, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse429 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse429Status: ").append(toIndentedString(inlineResponse429Status)).append("\n");
    sb.append("    inlineResponse429Code: ").append(toIndentedString(inlineResponse429Code)).append("\n");
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
