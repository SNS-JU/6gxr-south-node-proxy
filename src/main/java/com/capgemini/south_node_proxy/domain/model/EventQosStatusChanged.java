package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Event to notify a QoS status change
 */
@Schema(description = "Event to notify a QoS status change")
@Validated


public class EventQosStatusChanged extends CloudEvent  {
  @JsonProperty("data")

  private EventQosStatusChangedData eventQosStatusChangedData = null;


  public EventQosStatusChanged eventQosStatusChangedData(EventQosStatusChangedData eventQosStatusChangedData) { 

    this.eventQosStatusChangedData = eventQosStatusChangedData;
    return this;
  }

  /**
   * Get eventQosStatusChangedData
   * @return eventQosStatusChangedData
   **/
  
  @Schema(required = true, description = "")
  
@Valid
  @NotNull
  public EventQosStatusChangedData getEventQosStatusChangedData() {  
    return eventQosStatusChangedData;
  }



  public void setEventQosStatusChangedData(EventQosStatusChangedData eventQosStatusChangedData) { 

    this.eventQosStatusChangedData = eventQosStatusChangedData;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventQosStatusChanged eventQosStatusChanged = (EventQosStatusChanged) o;
    return Objects.equals(this.eventQosStatusChangedData, eventQosStatusChanged.eventQosStatusChangedData) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventQosStatusChangedData, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventQosStatusChanged {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    eventQosStatusChangedData: ").append(toIndentedString(eventQosStatusChangedData)).append("\n");
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
