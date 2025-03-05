package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * iherits from TrafficInfluence restricting the access (readonly) to \&quot;trafficInfluenceID\&quot; and \&quot;state\&quot;, to be used by the API Consumer to create a TrafficInfluece resource for a specific user.
 */
@Schema(description = "iherits from TrafficInfluence restricting the access (readonly) to \"trafficInfluenceID\" and \"state\", to be used by the API Consumer to create a TrafficInfluece resource for a specific user.")
@Validated

public class PostTrafficInfluenceDevice extends TrafficInfluence  {
  @JsonProperty("device")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Device1 device = null;

  @JsonProperty("trafficInfluenceID")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object postTrafficInfluenceDeviceTrafficInfluenceID = null;

  @JsonProperty("state")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object postTrafficInfluenceDeviceState = null;

  @JsonProperty("notificationSink")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private NotificationSink notificationSink = null;


  public PostTrafficInfluenceDevice device(Device1 device) { 

    this.device = device;
    return this;
  }

  /**
   * Get device
   * @return device
   **/
  
  @Schema(description = "")
  
@Valid
  public Device1 getDevice() {  
    return device;
  }



  public void setDevice(Device1 device) { 
    this.device = device;
  }

  public PostTrafficInfluenceDevice postTrafficInfluenceDeviceTrafficInfluenceID(Object postTrafficInfluenceDeviceTrafficInfluenceID) { 

    this.postTrafficInfluenceDeviceTrafficInfluenceID = postTrafficInfluenceDeviceTrafficInfluenceID;
    return this;
  }

  /**
   * Get postTrafficInfluenceDeviceTrafficInfluenceID
   * @return postTrafficInfluenceDeviceTrafficInfluenceID
   **/
  
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "")
  
  public Object getPostTrafficInfluenceDeviceTrafficInfluenceID() {  
    return postTrafficInfluenceDeviceTrafficInfluenceID;
  }



  public void setPostTrafficInfluenceDeviceTrafficInfluenceID(Object postTrafficInfluenceDeviceTrafficInfluenceID) { 
    this.postTrafficInfluenceDeviceTrafficInfluenceID = postTrafficInfluenceDeviceTrafficInfluenceID;
  }

  public PostTrafficInfluenceDevice postTrafficInfluenceDeviceState(Object postTrafficInfluenceDeviceState) { 

    this.postTrafficInfluenceDeviceState = postTrafficInfluenceDeviceState;
    return this;
  }

  /**
   * Get postTrafficInfluenceDeviceState
   * @return postTrafficInfluenceDeviceState
   **/
  
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "")
  
  public Object getPostTrafficInfluenceDeviceState() {  
    return postTrafficInfluenceDeviceState;
  }



  public void setPostTrafficInfluenceDeviceState(Object postTrafficInfluenceDeviceState) { 
    this.postTrafficInfluenceDeviceState = postTrafficInfluenceDeviceState;
  }

  public PostTrafficInfluenceDevice notificationSink(NotificationSink notificationSink) { 

    this.notificationSink = notificationSink;
    return this;
  }

  /**
   * Get notificationSink
   * @return notificationSink
   **/
  
  @Schema(description = "")
  
@Valid
  public NotificationSink getNotificationSink() {  
    return notificationSink;
  }



  public void setNotificationSink(NotificationSink notificationSink) { 
    this.notificationSink = notificationSink;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostTrafficInfluenceDevice postTrafficInfluenceDevice = (PostTrafficInfluenceDevice) o;
    return Objects.equals(this.device, postTrafficInfluenceDevice.device) &&
        Objects.equals(this.postTrafficInfluenceDeviceTrafficInfluenceID, postTrafficInfluenceDevice.postTrafficInfluenceDeviceTrafficInfluenceID) &&
        Objects.equals(this.postTrafficInfluenceDeviceState, postTrafficInfluenceDevice.postTrafficInfluenceDeviceState) &&
        Objects.equals(this.notificationSink, postTrafficInfluenceDevice.notificationSink) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, postTrafficInfluenceDeviceTrafficInfluenceID, postTrafficInfluenceDeviceState, notificationSink, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostTrafficInfluenceDevice {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    postTrafficInfluenceDeviceTrafficInfluenceID: ").append(toIndentedString(postTrafficInfluenceDeviceTrafficInfluenceID)).append("\n");
    sb.append("    postTrafficInfluenceDeviceState: ").append(toIndentedString(postTrafficInfluenceDeviceState)).append("\n");
    sb.append("    notificationSink: ").append(toIndentedString(notificationSink)).append("\n");
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
