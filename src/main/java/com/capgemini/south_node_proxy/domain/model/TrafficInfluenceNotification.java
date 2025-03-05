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

/**
 * Notifican channel for changes in the TrafficInfluence resource. It returnes back the TrafficInfluece resource with the updated status (\&quot;state\&quot;) and also proivides back the identifier of the selected EAS instance.
 */
@Schema(description = "Notifican channel for changes in the TrafficInfluence resource. It returnes back the TrafficInfluece resource with the updated status (\"state\") and also proivides back the identifier of the selected EAS instance.")
@Validated

public class TrafficInfluenceNotification extends TrafficInfluence  {
  @JsonProperty("selected_appInstanceId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private UUID selectedAppInstanceId = null;


  public TrafficInfluenceNotification selectedAppInstanceId(UUID selectedAppInstanceId) { 

    this.selectedAppInstanceId = selectedAppInstanceId;
    return this;
  }

  /**
   * A globally unique identifier associated with a running instance of an application. OP generates this identifier.
   * @return selectedAppInstanceId
   **/
  
  @Schema(description = "A globally unique identifier associated with a running instance of an application. OP generates this identifier.")
  
@Valid
  public UUID getSelectedAppInstanceId() {  
    return selectedAppInstanceId;
  }



  public void setSelectedAppInstanceId(UUID selectedAppInstanceId) { 
    this.selectedAppInstanceId = selectedAppInstanceId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrafficInfluenceNotification trafficInfluenceNotification = (TrafficInfluenceNotification) o;
    return Objects.equals(this.selectedAppInstanceId, trafficInfluenceNotification.selectedAppInstanceId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectedAppInstanceId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrafficInfluenceNotification {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    selectedAppInstanceId: ").append(toIndentedString(selectedAppInstanceId)).append("\n");
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
