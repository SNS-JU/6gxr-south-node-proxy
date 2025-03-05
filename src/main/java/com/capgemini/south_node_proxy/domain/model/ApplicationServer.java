package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * A server hosting backend applications to deliver some business logic to clients.  The developer can choose to provide the below specified device identifiers:  * &#x60;ipv4Address&#x60; * &#x60;ipv6Address&#x60; 
 */
@Schema(description = "A server hosting backend applications to deliver some business logic to clients.  The developer can choose to provide the below specified device identifiers:  * `ipv4Address` * `ipv6Address` ")
@Validated


public class ApplicationServer   {
  @JsonProperty("ipv4Address")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String ipv4Address = null;

  @JsonProperty("ipv6Address")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String ipv6Address = null;


  public ApplicationServer ipv4Address(String ipv4Address) { 

    this.ipv4Address = ipv4Address;
    return this;
  }

  /**
   * IPv4 address may be specified in form <address/mask> as:   - address - an IPv4 number in dotted-quad form 1.2.3.4. Only this exact IP number will match the flow control rule.   - address/mask - an IP number as above with a mask width of the form 1.2.3.4/24.     In this case, all IP numbers from 1.2.3.0 to 1.2.3.255 will match. The bit width MUST be valid for the IP version. 
   * @return ipv4Address
   **/
  
  @Schema(example = "198.51.100.0/24", description = "IPv4 address may be specified in form <address/mask> as:   - address - an IPv4 number in dotted-quad form 1.2.3.4. Only this exact IP number will match the flow control rule.   - address/mask - an IP number as above with a mask width of the form 1.2.3.4/24.     In this case, all IP numbers from 1.2.3.0 to 1.2.3.255 will match. The bit width MUST be valid for the IP version. ")
  
  public String getIpv4Address() {  
    return ipv4Address;
  }



  public void setIpv4Address(String ipv4Address) { 
    this.ipv4Address = ipv4Address;
  }

  public ApplicationServer ipv6Address(String ipv6Address) { 

    this.ipv6Address = ipv6Address;
    return this;
  }

  /**
   * IPv6 address may be specified in form <address/mask> as:   - address - The /128 subnet is optional for single addresses:     - 2001:db8:85a3:8d3:1319:8a2e:370:7344     - 2001:db8:85a3:8d3:1319:8a2e:370:7344/128   - address/mask - an IP v6 number with a mask:     - 2001:db8:85a3:8d3::0/64     - 2001:db8:85a3:8d3::/64 
   * @return ipv6Address
   **/
  
  @Schema(example = "2001:db8:85a3:8d3:1319:8a2e:370:7344", description = "IPv6 address may be specified in form <address/mask> as:   - address - The /128 subnet is optional for single addresses:     - 2001:db8:85a3:8d3:1319:8a2e:370:7344     - 2001:db8:85a3:8d3:1319:8a2e:370:7344/128   - address/mask - an IP v6 number with a mask:     - 2001:db8:85a3:8d3::0/64     - 2001:db8:85a3:8d3::/64 ")
  
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
    ApplicationServer applicationServer = (ApplicationServer) o;
    return Objects.equals(this.ipv4Address, applicationServer.ipv4Address) &&
        Objects.equals(this.ipv6Address, applicationServer.ipv6Address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4Address, ipv6Address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationServer {\n");
    
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
