package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * Information in case of error
 */
@Schema(description = "Information in case of error")
@Validated


public class ErrorInfo1   {
  @JsonProperty("code")

  private String code = null;

  @JsonProperty("message")

  private String message = null;


  public ErrorInfo1 code(String code) { 

    this.code = code;
    return this;
  }

  /**
   * Code given to this error
   * @return code
   **/
  
  @Schema(required = true, description = "Code given to this error")
  
  @NotNull
  public String getCode() {  
    return code;
  }



  public void setCode(String code) { 

    this.code = code;
  }

  public ErrorInfo1 message(String message) { 

    this.message = message;
    return this;
  }

  /**
   * Detailed error description
   * @return message
   **/
  
  @Schema(required = true, description = "Detailed error description")
  
  @NotNull
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
    ErrorInfo1 errorInfo1 = (ErrorInfo1) o;
    return Objects.equals(this.code, errorInfo1.code) &&
        Objects.equals(this.message, errorInfo1.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorInfo1 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
