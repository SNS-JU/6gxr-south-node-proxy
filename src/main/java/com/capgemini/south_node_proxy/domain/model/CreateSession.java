package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/**
 * Attributes required to create a session
 */
@Schema(description = "Attributes required to create a session")
@Validated

public class CreateSession extends BaseSessionInfo  {
  @JsonProperty("duration")

  private Integer duration = null;


  public CreateSession duration(Integer duration) { 

    this.duration = duration;
    return this;
  }

  /**
   * Requested session duration in seconds. Value may be explicitly limited for the QoS profile, as specified in the Qos Profile (see qos-profile API). Implementations can grant the requested session duration or set a different duration, based on network policies or conditions. 
   * minimum: 1
   * @return duration
   **/
  
  @Schema(example = "3600", required = true, description = "Requested session duration in seconds. Value may be explicitly limited for the QoS profile, as specified in the Qos Profile (see qos-profile API). Implementations can grant the requested session duration or set a different duration, based on network policies or conditions. ")
  
  @NotNull
@Min(1)  public Integer getDuration() {  
    return duration;
  }



  public void setDuration(Integer duration) { 

    this.duration = duration;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSession createSession = (CreateSession) o;
    return Objects.equals(this.duration, createSession.duration) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSession {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
