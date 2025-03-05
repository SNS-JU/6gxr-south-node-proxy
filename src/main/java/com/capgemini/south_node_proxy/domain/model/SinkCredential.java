package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * SinkCredential
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "credentialType", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = PlainCredential.class, name = "PLAIN"),
        @JsonSubTypes.Type(value = AccessTokenCredential.class, name = "ACCESSTOKEN"),
        @JsonSubTypes.Type(value = RefreshTokenCredential.class, name = "REFRESHTOKEN"),
})


public class SinkCredential   {
  /**
   * The type of the credential. With the current API version the type MUST be set to `ACCESSTOKEN`
   */
  public enum CredentialTypeEnum {
    PLAIN("PLAIN"),
    
    ACCESSTOKEN("ACCESSTOKEN"),
    
    REFRESHTOKEN("REFRESHTOKEN");

    private String value;

    CredentialTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CredentialTypeEnum fromValue(String text) {
      for (CredentialTypeEnum b : CredentialTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonTypeId

  private CredentialTypeEnum credentialType = null;


  public SinkCredential credentialType(CredentialTypeEnum credentialType) { 

    this.credentialType = credentialType;
    return this;
  }

  /**
   * The type of the credential. With the current API version the type MUST be set to `ACCESSTOKEN`
   * @return credentialType
   **/
  
  @Schema(required = true, description = "The type of the credential. With the current API version the type MUST be set to `ACCESSTOKEN`")
  
  @NotNull
  public CredentialTypeEnum getCredentialType() {  
    return credentialType;
  }



  public void setCredentialType(CredentialTypeEnum credentialType) { 

    this.credentialType = credentialType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SinkCredential sinkCredential = (SinkCredential) o;
    return Objects.equals(this.credentialType, sinkCredential.credentialType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SinkCredential {\n");
    
    sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
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
