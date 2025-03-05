package com.capgemini.south_node_proxy.domain.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The current status of the requested QoS session. The status can be one of the following: * `REQUESTED` - QoS has been requested by creating a session * `AVAILABLE` - The requested QoS has been provided by the network * `UNAVAILABLE` - The requested QoS cannot be provided by the network due to some reason 
 */
public enum QosStatus {
  REQUESTED("REQUESTED"),
    AVAILABLE("AVAILABLE"),
    UNAVAILABLE("UNAVAILABLE");

  private String value;

  QosStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QosStatus fromValue(String text) {
    for (QosStatus b : QosStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
