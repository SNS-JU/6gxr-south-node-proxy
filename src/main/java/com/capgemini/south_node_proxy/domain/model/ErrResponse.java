package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Responce feedback in case of errors
 */
@Schema(description = "Responce feedback in case of errors")
@Validated


public class ErrResponse   {
  @JsonProperty("status")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String status = null;

  @JsonProperty("message")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String message = null;


  public ErrResponse status(String status) { 

    this.status = status;
    return this;
  }

  /**
   * status for the error
   * @return status
   **/
  
  @Schema(example = "OK", description = "status for the error")
  
  public String getStatus() {  
    return status;
  }



  public void setStatus(String status) { 
    this.status = status;
  }

  public ErrResponse message(String message) { 

    this.message = message;
    return this;
  }

  /**
   * additional message for the error
   * @return message
   **/
  
  @Schema(example = "OK", description = "additional message for the error")
  
  public String getMessage() {  
    return message;
  }



  public void setMessage(String message) { 
    this.message = message;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrResponse errResponse = (ErrResponse) o;
    return Objects.equals(this.status, errResponse.status) &&
        Objects.equals(this.message, errResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
