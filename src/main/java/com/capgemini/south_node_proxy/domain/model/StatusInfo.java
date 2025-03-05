package com.capgemini.south_node_proxy.domain.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reason for the new `qosStatus`. Currently `statusInfo` is only applicable when `qosStatus` is 'UNAVAILABLE'. * `DURATION_EXPIRED` - Session terminated due to requested duration expired * `NETWORK_TERMINATED` - Network terminated the session before the requested duration expired * `DELETE_REQUESTED`- User requested the deletion of the session before the requested duration expired 
 */
public enum StatusInfo {
  DURATION_EXPIRED("DURATION_EXPIRED"),
    NETWORK_TERMINATED("NETWORK_TERMINATED"),
    DELETE_REQUESTED("DELETE_REQUESTED");

  private String value;

  StatusInfo(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static StatusInfo fromValue(String text) {
    for (StatusInfo b : StatusInfo.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
