package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

/**
 * The device should be identified by either the public (observed) IP   address and port as seen by the application server, or the private   (local) and any public (observed) IP addresses in use by the device   (this information can be obtained by various means, for example from   some DNS servers). If the allocated and observed IP addresses are the same (i.e. NAT is not   in use) then  the same address should be specified for both   publicAddress and privateAddress. If NAT64 is in use, the device should be identified by its publicAddress   and publicPort, or separately by its allocated IPv6 address (field   ipv6Address of the Device object) In all cases, publicAddress must be specified, along with at least one   of either privateAddress or publicPort, dependent upon which is known.   In general, mobile devices cannot be identified by their public IPv4   address alone. 
 */
@Schema(description = "The device should be identified by either the public (observed) IP   address and port as seen by the application server, or the private   (local) and any public (observed) IP addresses in use by the device   (this information can be obtained by various means, for example from   some DNS servers). If the allocated and observed IP addresses are the same (i.e. NAT is not   in use) then  the same address should be specified for both   publicAddress and privateAddress. If NAT64 is in use, the device should be identified by its publicAddress   and publicPort, or separately by its allocated IPv6 address (field   ipv6Address of the Device object) In all cases, publicAddress must be specified, along with at least one   of either privateAddress or publicPort, dependent upon which is known.   In general, mobile devices cannot be identified by their public IPv4   address alone. ")
@Validated

public class DeviceIpv4Addr1  implements AnyOfDeviceIpv4Addr1 {
  @JsonProperty("publicAddress")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String publicAddress = null;

  @JsonProperty("privateAddress")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String privateAddress = null;

  @JsonProperty("publicPort")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer publicPort = null;


  public DeviceIpv4Addr1 publicAddress(String publicAddress) { 

    this.publicAddress = publicAddress;
    return this;
  }

  /**
   * A single IPv4 address with no subnet mask
   * @return publicAddress
   **/
  
  @Schema(example = "84.125.93.10", description = "A single IPv4 address with no subnet mask")
  
  public String getPublicAddress() {  
    return publicAddress;
  }



  public void setPublicAddress(String publicAddress) { 
    this.publicAddress = publicAddress;
  }

  public DeviceIpv4Addr1 privateAddress(String privateAddress) { 

    this.privateAddress = privateAddress;
    return this;
  }

  /**
   * A single IPv4 address with no subnet mask
   * @return privateAddress
   **/
  
  @Schema(example = "84.125.93.10", description = "A single IPv4 address with no subnet mask")
  
  public String getPrivateAddress() {  
    return privateAddress;
  }



  public void setPrivateAddress(String privateAddress) { 
    this.privateAddress = privateAddress;
  }

  public DeviceIpv4Addr1 publicPort(Integer publicPort) { 

    this.publicPort = publicPort;
    return this;
  }

  /**
   * TCP or UDP port number
   * minimum: 0
   * maximum: 65535
   * @return publicPort
   **/
  
  @Schema(description = "TCP or UDP port number")
  
@Min(0) @Max(65535)   public Integer getPublicPort() {  
    return publicPort;
  }



  public void setPublicPort(Integer publicPort) { 
    this.publicPort = publicPort;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceIpv4Addr1 deviceIpv4Addr1 = (DeviceIpv4Addr1) o;
    return Objects.equals(this.publicAddress, deviceIpv4Addr1.publicAddress) &&
        Objects.equals(this.privateAddress, deviceIpv4Addr1.privateAddress) &&
        Objects.equals(this.publicPort, deviceIpv4Addr1.publicPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicAddress, privateAddress, publicPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceIpv4Addr1 {\n");
    
    sb.append("    publicAddress: ").append(toIndentedString(publicAddress)).append("\n");
    sb.append("    privateAddress: ").append(toIndentedString(privateAddress)).append("\n");
    sb.append("    publicPort: ").append(toIndentedString(publicPort)).append("\n");
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
