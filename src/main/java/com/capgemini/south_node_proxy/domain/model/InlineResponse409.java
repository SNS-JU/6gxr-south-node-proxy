package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InlineResponse409
 */
@Validated

public class InlineResponse409 extends ErrorInfo  {
  @JsonProperty("status")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object inlineResponse409Status = null;

  @JsonProperty("code")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object inlineResponse409Code = null;


  public InlineResponse409 inlineResponse409Status(Object inlineResponse409Status) { 

    this.inlineResponse409Status = inlineResponse409Status;
    return this;
  }

  /**
   * Get inlineResponse409Status
   * @return inlineResponse409Status
   **/
  
  @Schema(description = "")
  
  public Object getInlineResponse409Status() {  
    return inlineResponse409Status;
  }



  public void setInlineResponse409Status(Object inlineResponse409Status) { 
    this.inlineResponse409Status = inlineResponse409Status;
  }

  public InlineResponse409 inlineResponse409Code(Object inlineResponse409Code) { 

    this.inlineResponse409Code = inlineResponse409Code;
    return this;
  }

  /**
   * Get inlineResponse409Code
   * @return inlineResponse409Code
   **/
  
  @Schema(description = "")
  
  public Object getInlineResponse409Code() {  
    return inlineResponse409Code;
  }



  public void setInlineResponse409Code(Object inlineResponse409Code) { 
    this.inlineResponse409Code = inlineResponse409Code;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse409 inlineResponse409 = (InlineResponse409) o;
    return Objects.equals(this.inlineResponse409Status, inlineResponse409.inlineResponse409Status) &&
        Objects.equals(this.inlineResponse409Code, inlineResponse409.inlineResponse409Code) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse409Status, inlineResponse409Code, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse409 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse409Status: ").append(toIndentedString(inlineResponse409Status)).append("\n");
    sb.append("    inlineResponse409Code: ").append(toIndentedString(inlineResponse409Code)).append("\n");
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
