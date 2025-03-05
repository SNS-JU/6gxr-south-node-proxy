package com.capgemini.south_node_proxy.domain.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/**
 * Session related information returned in responses. Note that the device object is defined as optional and will only to be returned if provided in createSession. If more than one type of device identifier was provided, only one identifier will be returned (at implementation choice and with the original value provided in createSession). Please note that IP addresses of devices can change and get reused, so the original values may no longer identify the same device. They identified the device at the time of session creation. 
 */
@Schema(description = "Session related information returned in responses. Note that the device object is defined as optional and will only to be returned if provided in createSession. If more than one type of device identifier was provided, only one identifier will be returned (at implementation choice and with the original value provided in createSession). Please note that IP addresses of devices can change and get reused, so the original values may no longer identify the same device. They identified the device at the time of session creation. ")
@Validated

public class SessionInfo extends BaseSessionInfo  {
  @JsonProperty("sessionId")

  private UUID sessionId = null;

  @JsonProperty("duration")

  private Integer duration = null;

  @JsonProperty("startedAt")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private OffsetDateTime startedAt = null;

  @JsonProperty("expiresAt")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private OffsetDateTime expiresAt = null;

  @JsonProperty("qosStatus")

  private QosStatus qosStatus = null;

  @JsonProperty("statusInfo")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private StatusInfo statusInfo = null;


  public SessionInfo sessionId(UUID sessionId) { 

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

  public SessionInfo duration(Integer duration) { 

    this.duration = duration;
    return this;
  }

  /**
   * Session duration in seconds. Implementations can grant the requested session duration or set a different duration, based on network policies or conditions. - When `qosStatus` is \"REQUESTED\", the value is the duration to be scheduled, granted by the implementation. - When `qosStatus` is AVAILABLE\", the value is the overall duration since `startedAt. When the session is extended, the value is the new overall duration of the session. - When `qosStatus` is \"UNAVAILABLE\", the value is the overall effective duration since `startedAt` until the session was terminated. 
   * minimum: 1
   * @return duration
   **/
  
  @Schema(example = "3600", required = true, description = "Session duration in seconds. Implementations can grant the requested session duration or set a different duration, based on network policies or conditions. - When `qosStatus` is \"REQUESTED\", the value is the duration to be scheduled, granted by the implementation. - When `qosStatus` is AVAILABLE\", the value is the overall duration since `startedAt. When the session is extended, the value is the new overall duration of the session. - When `qosStatus` is \"UNAVAILABLE\", the value is the overall effective duration since `startedAt` until the session was terminated. ")
  
  @NotNull
@Min(1)  public Integer getDuration() {  
    return duration;
  }



  public void setDuration(Integer duration) { 

    this.duration = duration;
  }

  public SessionInfo startedAt(OffsetDateTime startedAt) { 

    this.startedAt = startedAt;
    return this;
  }

  /**
   * Date and time when the QoS status became \"AVAILABLE\". Not to be returned when `qosStatus` is \"REQUESTED\". Format must follow RFC 3339 and must indicate time zone (UTC or local).
   * @return startedAt
   **/
  
  @Schema(example = "2024-06-01T12:00Z", description = "Date and time when the QoS status became \"AVAILABLE\". Not to be returned when `qosStatus` is \"REQUESTED\". Format must follow RFC 3339 and must indicate time zone (UTC or local).")
  
@Valid
  public OffsetDateTime getStartedAt() {  
    return startedAt;
  }



  public void setStartedAt(OffsetDateTime startedAt) { 
    this.startedAt = startedAt;
  }

  public SessionInfo expiresAt(OffsetDateTime expiresAt) { 

    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Date and time of the QoS session expiration. Format must follow RFC 3339 and must indicate time zone (UTC or local). - When `qosStatus` is \"AVAILABLE\", it is the limit time when the session is scheduled to finnish, if not terminated by other means. - When `qosStatus` is \"UNAVAILABLE\", it is the time when the session was terminated. - Not to be returned when `qosStatus` is \"REQUESTED\". When the session is extended, the value is the new expiration time of the session. 
   * @return expiresAt
   **/
  
  @Schema(example = "2024-06-01T13:00Z", description = "Date and time of the QoS session expiration. Format must follow RFC 3339 and must indicate time zone (UTC or local). - When `qosStatus` is \"AVAILABLE\", it is the limit time when the session is scheduled to finnish, if not terminated by other means. - When `qosStatus` is \"UNAVAILABLE\", it is the time when the session was terminated. - Not to be returned when `qosStatus` is \"REQUESTED\". When the session is extended, the value is the new expiration time of the session. ")
  
@Valid
  public OffsetDateTime getExpiresAt() {  
    return expiresAt;
  }



  public void setExpiresAt(OffsetDateTime expiresAt) { 
    this.expiresAt = expiresAt;
  }

  public SessionInfo qosStatus(QosStatus qosStatus) { 

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
  public QosStatus getQosStatus() {  
    return qosStatus;
  }



  public void setQosStatus(QosStatus qosStatus) { 

    this.qosStatus = qosStatus;
  }

  public SessionInfo statusInfo(StatusInfo statusInfo) { 

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
    SessionInfo sessionInfo = (SessionInfo) o;
    return Objects.equals(this.sessionId, sessionInfo.sessionId) &&
        Objects.equals(this.duration, sessionInfo.duration) &&
        Objects.equals(this.startedAt, sessionInfo.startedAt) &&
        Objects.equals(this.expiresAt, sessionInfo.expiresAt) &&
        Objects.equals(this.qosStatus, sessionInfo.qosStatus) &&
        Objects.equals(this.statusInfo, sessionInfo.statusInfo) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, duration, startedAt, expiresAt, qosStatus, statusInfo, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
