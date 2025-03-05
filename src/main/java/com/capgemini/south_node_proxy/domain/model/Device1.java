package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;

/**
 * End-user equipment able to connect to a mobile network. Examples of devices include smartphones or IoT sensors/actuators. The developer can choose to provide the below specified device identifiers: * &#x60;ipv4Address&#x60; * &#x60;ipv6Address&#x60; * &#x60;phoneNumber&#x60; * &#x60;networkAccessIdentifier&#x60; NOTE1: the MNO might support only a subset of these options. The API invoker can provide multiple identifiers to be compatible across different MNOs. In this case the identifiers MUST belong to the same device. NOTE2: for the Commonalities release v0.4, we are enforcing that the networkAccessIdentifier is only part of the schema for future-proofing, and CAMARA does not currently allow its use. After the CAMARA meta-release work is concluded and the relevant issues are resolved, its use will need to be explicitly documented in the guidelines. 
 */
@Schema(description = "End-user equipment able to connect to a mobile network. Examples of devices include smartphones or IoT sensors/actuators. The developer can choose to provide the below specified device identifiers: * `ipv4Address` * `ipv6Address` * `phoneNumber` * `networkAccessIdentifier` NOTE1: the MNO might support only a subset of these options. The API invoker can provide multiple identifiers to be compatible across different MNOs. In this case the identifiers MUST belong to the same device. NOTE2: for the Commonalities release v0.4, we are enforcing that the networkAccessIdentifier is only part of the schema for future-proofing, and CAMARA does not currently allow its use. After the CAMARA meta-release work is concluded and the relevant issues are resolved, its use will need to be explicitly documented in the guidelines. ")
@Validated

public class Device1   {
  @JsonProperty("phoneNumber")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String phoneNumber = null;

  @JsonProperty("networkAccessIdentifier")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String networkAccessIdentifier = null;

  @JsonProperty("ipv4Address")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private DeviceIpv4Addr1 ipv4Address = null;

  @JsonProperty("ipv6Address")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String ipv6Address = null;


  public Device1 phoneNumber(String phoneNumber) { 

    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * A public identifier addressing a telephone subscription. In mobile networks it corresponds to the MSISDN (Mobile Station International Subscriber Directory Number). In order to be globally unique it has to be formatted in international format, according to E.164 standard, prefixed with '+'.
   * @return phoneNumber
   **/
  
  @Schema(example = "+123456789", description = "A public identifier addressing a telephone subscription. In mobile networks it corresponds to the MSISDN (Mobile Station International Subscriber Directory Number). In order to be globally unique it has to be formatted in international format, according to E.164 standard, prefixed with '+'.")
  
@Pattern(regexp="^\\+[1-9][0-9]{4,14}$")   public String getPhoneNumber() {  
    return phoneNumber;
  }



  public void setPhoneNumber(String phoneNumber) { 
    this.phoneNumber = phoneNumber;
  }

  public Device1 networkAccessIdentifier(String networkAccessIdentifier) { 

    this.networkAccessIdentifier = networkAccessIdentifier;
    return this;
  }

  /**
   * A public identifier addressing a subscription in a mobile network. In 3GPP terminology, it corresponds to the GPSI formatted with the External Identifier ({Local Identifier}@{Domain Identifier}). Unlike the telephone number, the network access identifier is not subjected to portability ruling in force, and is individually managed by each operator.
   * @return networkAccessIdentifier
   **/
  
  @Schema(example = "123456789@domain.com", description = "A public identifier addressing a subscription in a mobile network. In 3GPP terminology, it corresponds to the GPSI formatted with the External Identifier ({Local Identifier}@{Domain Identifier}). Unlike the telephone number, the network access identifier is not subjected to portability ruling in force, and is individually managed by each operator.")
  
  public String getNetworkAccessIdentifier() {  
    return networkAccessIdentifier;
  }



  public void setNetworkAccessIdentifier(String networkAccessIdentifier) { 
    this.networkAccessIdentifier = networkAccessIdentifier;
  }

  public Device1 ipv4Address(DeviceIpv4Addr1 ipv4Address) { 

    this.ipv4Address = ipv4Address;
    return this;
  }

  /**
   * Get ipv4Address
   * @return ipv4Address
   **/
  
  @Schema(description = "")
  
@Valid
  public DeviceIpv4Addr1 getIpv4Address() {  
    return ipv4Address;
  }



  public void setIpv4Address(DeviceIpv4Addr1 ipv4Address) { 
    this.ipv4Address = ipv4Address;
  }

  public Device1 ipv6Address(String ipv6Address) { 

    this.ipv6Address = ipv6Address;
    return this;
  }

  /**
   * The device should be identified by the observed IPv6 address, or by any   single IPv6 address from within the subnet allocated to the device   (e.g. adding ::0 to the /64 prefix). 
   * @return ipv6Address
   **/
  
  @Schema(example = "2001:db8:85a3:8d3:1319:8a2e:370:7344", description = "The device should be identified by the observed IPv6 address, or by any   single IPv6 address from within the subnet allocated to the device   (e.g. adding ::0 to the /64 prefix). ")
  
  public String getIpv6Address() {  
    return ipv6Address;
  }



  public void setIpv6Address(String ipv6Address) { 
    this.ipv6Address = ipv6Address;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Device1 device1 = (Device1) o;
    return Objects.equals(this.phoneNumber, device1.phoneNumber) &&
        Objects.equals(this.networkAccessIdentifier, device1.networkAccessIdentifier) &&
        Objects.equals(this.ipv4Address, device1.ipv4Address) &&
        Objects.equals(this.ipv6Address, device1.ipv6Address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, networkAccessIdentifier, ipv4Address, ipv6Address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device1 {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    networkAccessIdentifier: ").append(toIndentedString(networkAccessIdentifier)).append("\n");
    sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
    sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
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
