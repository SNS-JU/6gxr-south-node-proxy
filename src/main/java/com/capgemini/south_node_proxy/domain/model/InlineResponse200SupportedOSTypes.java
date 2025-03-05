package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;

@Validated
public class InlineResponse200SupportedOSTypes   {
  @JsonProperty("architecture")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String architecture = null;

  @JsonProperty("distribution")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String distribution = null;

  @JsonProperty("license")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String license = null;

  @JsonProperty("version")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String version = null;


  public InlineResponse200SupportedOSTypes architecture(String architecture) { 

    this.architecture = architecture;
    return this;
  }

  /**
   * Get architecture
   * @return architecture
   **/
  
  @Schema(description = "")
  
  public String getArchitecture() {  
    return architecture;
  }



  public void setArchitecture(String architecture) { 
    this.architecture = architecture;
  }

  public InlineResponse200SupportedOSTypes distribution(String distribution) { 

    this.distribution = distribution;
    return this;
  }

  /**
   * Get distribution
   * @return distribution
   **/
  
  @Schema(description = "")
  
  public String getDistribution() {  
    return distribution;
  }



  public void setDistribution(String distribution) { 
    this.distribution = distribution;
  }

  public InlineResponse200SupportedOSTypes license(String license) { 

    this.license = license;
    return this;
  }

  /**
   * Get license
   * @return license
   **/
  
  @Schema(description = "")
  
  public String getLicense() {  
    return license;
  }



  public void setLicense(String license) { 
    this.license = license;
  }

  public InlineResponse200SupportedOSTypes version(String version) { 

    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  
  @Schema(description = "")
  
  public String getVersion() {  
    return version;
  }



  public void setVersion(String version) { 
    this.version = version;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200SupportedOSTypes inlineResponse200SupportedOSTypes = (InlineResponse200SupportedOSTypes) o;
    return Objects.equals(this.architecture, inlineResponse200SupportedOSTypes.architecture) &&
        Objects.equals(this.distribution, inlineResponse200SupportedOSTypes.distribution) &&
        Objects.equals(this.license, inlineResponse200SupportedOSTypes.license) &&
        Objects.equals(this.version, inlineResponse200SupportedOSTypes.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, distribution, license, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200SupportedOSTypes {\n");
    
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
