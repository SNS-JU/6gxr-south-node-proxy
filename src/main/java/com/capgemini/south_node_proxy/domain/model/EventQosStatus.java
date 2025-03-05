package com.capgemini.south_node_proxy.domain.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The current status of a requested or previously available session. Applicable values in the event are: *  `AVAILABLE` - The requested QoS has been provided by the network. *  `UNAVAILABLE` - A requested or previously available QoS session is now unavailable. `statusInfo` may provide additional information about the reason for the unavailability. 
 */
public enum EventQosStatus {
  AVAILABLE("AVAILABLE"),
    UNAVAILABLE("UNAVAILABLE");

  private String value;

  EventQosStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EventQosStatus fromValue(String text) {
    for (EventQosStatus b : EventQosStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
