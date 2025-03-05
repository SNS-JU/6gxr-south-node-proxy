package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * NotificationSink
 */
@Validated

public class NotificationSink   {
  @JsonProperty("sink")

  private String sink = null;

  @JsonProperty("sinkCredentials")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private NotificationSinkSinkCredentials sinkCredentials = null;


  public NotificationSink sink(String sink) { 

    this.sink = sink;
    return this;
  }

  /**
   * https callback address where the notification must be POST-ed
   * @return sink
   **/
  
  @Schema(required = true, description = "https callback address where the notification must be POST-ed")
  
  @NotNull
  public String getSink() {  
    return sink;
  }



  public void setSink(String sink) { 

    this.sink = sink;
  }

  public NotificationSink sinkCredentials(NotificationSinkSinkCredentials sinkCredentials) { 

    this.sinkCredentials = sinkCredentials;
    return this;
  }

  /**
   * Get sinkCredentials
   * @return sinkCredentials
   **/
  
  @Schema(description = "")
  
@Valid
  public NotificationSinkSinkCredentials getSinkCredentials() {  
    return sinkCredentials;
  }



  public void setSinkCredentials(NotificationSinkSinkCredentials sinkCredentials) { 
    this.sinkCredentials = sinkCredentials;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSink notificationSink = (NotificationSink) o;
    return Objects.equals(this.sink, notificationSink.sink) &&
        Objects.equals(this.sinkCredentials, notificationSink.sinkCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sink, sinkCredentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSink {\n");
    
    sb.append("    sink: ").append(toIndentedString(sink)).append("\n");
    sb.append("    sinkCredentials: ").append(toIndentedString(sinkCredentials)).append("\n");
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
