package com.capgemini.south_node_proxy.domain.model;

import java.time.OffsetDateTime;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.Nulls;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

/**
 * Sink credential provides authorization information necessary to enable delivery of events to a target
 */
@Schema(description = "Sink credential provides authorization information necessary to enable delivery of events to a target")
@Validated

public class NotificationSinkSinkCredentials   {
  /**
   * Type of the credential - MUST be set to ACCESSTOKEN for now
   */
  public enum CredentialtypeEnum {
    ACCESSTOKEN("ACCESSTOKEN");

    private String value;

    CredentialtypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CredentialtypeEnum fromValue(String text) {
      for (CredentialtypeEnum b : CredentialtypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("credentialtype")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private CredentialtypeEnum credentialtype = null;

  @JsonProperty("accessToken")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String accessToken = null;

  @JsonProperty("accessTokenExpireUtc")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private OffsetDateTime accessTokenExpireUtc = null;

  /**
   * Type of access token - MUST be set to bearer for now
   */
  public enum AccessTokenTypeEnum {
    BEARER("bearer");

    private String value;

    AccessTokenTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccessTokenTypeEnum fromValue(String text) {
      for (AccessTokenTypeEnum b : AccessTokenTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("accessTokenType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private AccessTokenTypeEnum accessTokenType = null;


  public NotificationSinkSinkCredentials credentialtype(CredentialtypeEnum credentialtype) { 

    this.credentialtype = credentialtype;
    return this;
  }

  /**
   * Type of the credential - MUST be set to ACCESSTOKEN for now
   * @return credentialtype
   **/
  
  @Schema(description = "Type of the credential - MUST be set to ACCESSTOKEN for now")
  
  public CredentialtypeEnum getCredentialtype() {  
    return credentialtype;
  }



  public void setCredentialtype(CredentialtypeEnum credentialtype) { 
    this.credentialtype = credentialtype;
  }

  public NotificationSinkSinkCredentials accessToken(String accessToken) { 

    this.accessToken = accessToken;
    return this;
  }

  /**
   * Access Token granting access to the POST operation to create notification
   * @return accessToken
   **/
  
  @Schema(description = "Access Token granting access to the POST operation to create notification")
  
  public String getAccessToken() {  
    return accessToken;
  }



  public void setAccessToken(String accessToken) { 
    this.accessToken = accessToken;
  }

  public NotificationSinkSinkCredentials accessTokenExpireUtc(OffsetDateTime accessTokenExpireUtc) { 

    this.accessTokenExpireUtc = accessTokenExpireUtc;
    return this;
  }

  /**
   * An absolute UTC instant at which the access token shall be considered expired.
   * @return accessTokenExpireUtc
   **/
  
  @Schema(description = "An absolute UTC instant at which the access token shall be considered expired.")
  
@Valid
  public OffsetDateTime getAccessTokenExpireUtc() {  
    return accessTokenExpireUtc;
  }



  public void setAccessTokenExpireUtc(OffsetDateTime accessTokenExpireUtc) { 
    this.accessTokenExpireUtc = accessTokenExpireUtc;
  }

  public NotificationSinkSinkCredentials accessTokenType(AccessTokenTypeEnum accessTokenType) { 

    this.accessTokenType = accessTokenType;
    return this;
  }

  /**
   * Type of access token - MUST be set to bearer for now
   * @return accessTokenType
   **/
  
  @Schema(description = "Type of access token - MUST be set to bearer for now")
  
  public AccessTokenTypeEnum getAccessTokenType() {  
    return accessTokenType;
  }



  public void setAccessTokenType(AccessTokenTypeEnum accessTokenType) { 
    this.accessTokenType = accessTokenType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSinkSinkCredentials notificationSinkSinkCredentials = (NotificationSinkSinkCredentials) o;
    return Objects.equals(this.credentialtype, notificationSinkSinkCredentials.credentialtype) &&
        Objects.equals(this.accessToken, notificationSinkSinkCredentials.accessToken) &&
        Objects.equals(this.accessTokenExpireUtc, notificationSinkSinkCredentials.accessTokenExpireUtc) &&
        Objects.equals(this.accessTokenType, notificationSinkSinkCredentials.accessTokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialtype, accessToken, accessTokenExpireUtc, accessTokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSinkSinkCredentials {\n");
    
    sb.append("    credentialtype: ").append(toIndentedString(credentialtype)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    accessTokenExpireUtc: ").append(toIndentedString(accessTokenExpireUtc)).append("\n");
    sb.append("    accessTokenType: ").append(toIndentedString(accessTokenType)).append("\n");
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
