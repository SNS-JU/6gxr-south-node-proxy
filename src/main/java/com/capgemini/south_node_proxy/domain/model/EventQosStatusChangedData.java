package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;
import java.util.UUID;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Event details depending on the event type
 */
@Schema(description = "Event details depending on the event type")
@Validated

public class EventQosStatusChangedData   {
  @JsonProperty("sessionId")

  private UUID sessionId = null;

  @JsonProperty("qosStatus")

  private EventQosStatus qosStatus = null;

  @JsonProperty("statusInfo")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private StatusInfo statusInfo = null;


  public EventQosStatusChangedData sessionId(UUID sessionId) { 

    this.sessionId = sessionId;
    return this;
  }

  /**
   * Session ID in UUID format
   * @return sessionId
   **/
  
  @Schema(required = true, description = "Session ID in UUID format")
  
@Valid
  @NotNull
  public UUID getSessionId() {  
    return sessionId;
  }



  public void setSessionId(UUID sessionId) { 

    this.sessionId = sessionId;
  }

  public EventQosStatusChangedData qosStatus(EventQosStatus qosStatus) { 

    this.qosStatus = qosStatus;
    return this;
  }

  /**
   * Get qosStatus
   * @return qosStatus
   **/
  
  @Schema(required = true, description = "")
  
@Valid
  @NotNull
  public EventQosStatus getQosStatus() {  
    return qosStatus;
  }



  public void setQosStatus(EventQosStatus qosStatus) { 

    this.qosStatus = qosStatus;
  }

  public EventQosStatusChangedData statusInfo(StatusInfo statusInfo) { 

    this.statusInfo = statusInfo;
    return this;
  }

  /**
   * Get statusInfo
   * @return statusInfo
   **/
  
  @Schema(description = "")
  
@Valid
  public StatusInfo getStatusInfo() {  
    return statusInfo;
  }



  public void setStatusInfo(StatusInfo statusInfo) { 
    this.statusInfo = statusInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventQosStatusChangedData eventQosStatusChangedData = (EventQosStatusChangedData) o;
    return Objects.equals(this.sessionId, eventQosStatusChangedData.sessionId) &&
        Objects.equals(this.qosStatus, eventQosStatusChangedData.qosStatus) &&
        Objects.equals(this.statusInfo, eventQosStatusChangedData.statusInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, qosStatus, statusInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventQosStatusChangedData {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    qosStatus: ").append(toIndentedString(qosStatus)).append("\n");
    sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
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
