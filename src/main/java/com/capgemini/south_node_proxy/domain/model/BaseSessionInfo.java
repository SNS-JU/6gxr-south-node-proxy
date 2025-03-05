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
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Common attributes of a QoD session
 */
@Schema(description = "Common attributes of a QoD session")
@Validated

public class BaseSessionInfo   {
  @JsonProperty("device")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Device device = null;

  @JsonProperty("applicationServer")

  private ApplicationServer applicationServer = null;

  @JsonProperty("devicePorts")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private AllOfBaseSessionInfoDevicePorts devicePorts = null;

  @JsonProperty("applicationServerPorts")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private AllOfBaseSessionInfoApplicationServerPorts applicationServerPorts = null;

  @JsonProperty("qosProfile")

  private String qosProfile = null;

  @JsonProperty("sink")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String sink = null;

  @JsonProperty("sinkCredential")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private AllOfBaseSessionInfoSinkCredential sinkCredential = null;


  public BaseSessionInfo device(Device device) { 

    this.device = device;
    return this;
  }

  /**
   * Get device
   * @return device
   **/
  
  @Schema(description = "")
  
@Valid
  public Device getDevice() {  
    return device;
  }



  public void setDevice(Device device) { 
    this.device = device;
  }

  public BaseSessionInfo applicationServer(ApplicationServer applicationServer) { 

    this.applicationServer = applicationServer;
    return this;
  }

  /**
   * Get applicationServer
   * @return applicationServer
   **/
  
  @Schema(required = true, description = "")
  
@Valid
  @NotNull
  public ApplicationServer getApplicationServer() {  
    return applicationServer;
  }



  public void setApplicationServer(ApplicationServer applicationServer) { 

    this.applicationServer = applicationServer;
  }

  public BaseSessionInfo devicePorts(AllOfBaseSessionInfoDevicePorts devicePorts) { 

    this.devicePorts = devicePorts;
    return this;
  }

  /**
   * The ports used locally by the device for flows to which the requested QoS profile should apply. If omitted, then the qosProfile will apply to all flows between the device and the specified application server address and ports
   * @return devicePorts
   **/
  
  @Schema(description = "The ports used locally by the device for flows to which the requested QoS profile should apply. If omitted, then the qosProfile will apply to all flows between the device and the specified application server address and ports")
  
  public AllOfBaseSessionInfoDevicePorts getDevicePorts() {  
    return devicePorts;
  }



  public void setDevicePorts(AllOfBaseSessionInfoDevicePorts devicePorts) { 
    this.devicePorts = devicePorts;
  }

  public BaseSessionInfo applicationServerPorts(AllOfBaseSessionInfoApplicationServerPorts applicationServerPorts) { 

    this.applicationServerPorts = applicationServerPorts;
    return this;
  }

  /**
   * A list of single ports or port ranges on the application server
   * @return applicationServerPorts
   **/
  
  @Schema(description = "A list of single ports or port ranges on the application server")
  
  public AllOfBaseSessionInfoApplicationServerPorts getApplicationServerPorts() {  
    return applicationServerPorts;
  }



  public void setApplicationServerPorts(AllOfBaseSessionInfoApplicationServerPorts applicationServerPorts) { 
    this.applicationServerPorts = applicationServerPorts;
  }

  public BaseSessionInfo qosProfile(String qosProfile) { 

    this.qosProfile = qosProfile;
    return this;
  }

  /**
   * A unique name for identifying a specific QoS profile. This may follow different formats depending on the API provider implementation. Some options addresses:   - A UUID style string   - Support for predefined profiles QOS_S, QOS_M, QOS_L, and QOS_E   - A searchable descriptive name The set of QoS Profiles that an API provider is offering may be retrieved by means of the QoS Profile API (qos-profile) or agreed on onboarding time. 
   * @return qosProfile
   **/
  
  @Schema(example = "QCI_1_voice", required = true, description = "A unique name for identifying a specific QoS profile. This may follow different formats depending on the API provider implementation. Some options addresses:   - A UUID style string   - Support for predefined profiles QOS_S, QOS_M, QOS_L, and QOS_E   - A searchable descriptive name The set of QoS Profiles that an API provider is offering may be retrieved by means of the QoS Profile API (qos-profile) or agreed on onboarding time. ")
  
  @NotNull
@Pattern(regexp="^[a-zA-Z0-9_.-]+$") @Size(min=3,max=256)   public String getQosProfile() {  
    return qosProfile;
  }



  public void setQosProfile(String qosProfile) { 

    this.qosProfile = qosProfile;
  }

  public BaseSessionInfo sink(String sink) { 

    this.sink = sink;
    return this;
  }

  /**
   * The address to which events about all status changes of the session (e.g. session termination) shall be delivered using the selected protocol.
   * @return sink
   **/
  
  @Schema(example = "https://endpoint.example.com/sink", description = "The address to which events about all status changes of the session (e.g. session termination) shall be delivered using the selected protocol.")
  
  public String getSink() {  
    return sink;
  }



  public void setSink(String sink) { 
    this.sink = sink;
  }

  public BaseSessionInfo sinkCredential(AllOfBaseSessionInfoSinkCredential sinkCredential) { 

    this.sinkCredential = sinkCredential;
    return this;
  }

  /**
   * A sink credential provides authentication or authorization information necessary to enable delivery of events to a target.
   * @return sinkCredential
   **/
  
  @Schema(description = "A sink credential provides authentication or authorization information necessary to enable delivery of events to a target.")
  
  public AllOfBaseSessionInfoSinkCredential getSinkCredential() {  
    return sinkCredential;
  }



  public void setSinkCredential(AllOfBaseSessionInfoSinkCredential sinkCredential) { 
    this.sinkCredential = sinkCredential;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseSessionInfo baseSessionInfo = (BaseSessionInfo) o;
    return Objects.equals(this.device, baseSessionInfo.device) &&
        Objects.equals(this.applicationServer, baseSessionInfo.applicationServer) &&
        Objects.equals(this.devicePorts, baseSessionInfo.devicePorts) &&
        Objects.equals(this.applicationServerPorts, baseSessionInfo.applicationServerPorts) &&
        Objects.equals(this.qosProfile, baseSessionInfo.qosProfile) &&
        Objects.equals(this.sink, baseSessionInfo.sink) &&
        Objects.equals(this.sinkCredential, baseSessionInfo.sinkCredential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, applicationServer, devicePorts, applicationServerPorts, qosProfile, sink, sinkCredential);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseSessionInfo {\n");
    
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    applicationServer: ").append(toIndentedString(applicationServer)).append("\n");
    sb.append("    devicePorts: ").append(toIndentedString(devicePorts)).append("\n");
    sb.append("    applicationServerPorts: ").append(toIndentedString(applicationServerPorts)).append("\n");
    sb.append("    qosProfile: ").append(toIndentedString(qosProfile)).append("\n");
    sb.append("    sink: ").append(toIndentedString(sink)).append("\n");
    sb.append("    sinkCredential: ").append(toIndentedString(sinkCredential)).append("\n");
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
