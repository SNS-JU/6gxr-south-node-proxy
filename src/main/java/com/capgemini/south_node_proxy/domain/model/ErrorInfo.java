package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * Common schema for errors
 */
@Schema(description = "Common schema for errors")
@Validated


public class ErrorInfo   {
  @JsonProperty("status")

  private Integer status = null;

  @JsonProperty("code")

  private String code = null;

  @JsonProperty("message")

  private String message = null;


  public ErrorInfo status(Integer status) { 

    this.status = status;
    return this;
  }

  /**
   * HTTP status code returned along with this error response
   * @return status
   **/
  
  @Schema(required = true, description = "HTTP status code returned along with this error response")
  
  @NotNull
  public Integer getStatus() {  
    return status;
  }



  public void setStatus(Integer status) { 

    this.status = status;
  }

  public ErrorInfo code(String code) { 

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

  public ErrorInfo message(String message) { 

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
    ErrorInfo errorInfo = (ErrorInfo) o;
    return Objects.equals(this.status, errorInfo.status) &&
        Objects.equals(this.code, errorInfo.code) &&
        Objects.equals(this.message, errorInfo.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorInfo {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
