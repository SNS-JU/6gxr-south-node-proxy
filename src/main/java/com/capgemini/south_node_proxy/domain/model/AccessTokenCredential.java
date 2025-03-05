package com.capgemini.south_node_proxy.domain.model;

import java.time.OffsetDateTime;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@Validated

public class AccessTokenCredential extends SinkCredential  {
  @JsonProperty("accessToken")

  private String accessToken = null;

  @JsonProperty("accessTokenExpiresUtc")

  private OffsetDateTime accessTokenExpiresUtc = null;

  /**
   * REQUIRED. Type of the access token (See [OAuth 2.0](https://tools.ietf.org/html/rfc6749#section-7.1)). For the current version of the API the type MUST be set to `Bearer`.
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

  private AccessTokenTypeEnum accessTokenType = null;


  public AccessTokenCredential accessToken(String accessToken) { 

    this.accessToken = accessToken;
    return this;
  }

  /**
   * REQUIRED. An access token is a previously acquired token granting access to the target resource.
   * @return accessToken
   **/
  
  @Schema(required = true, description = "REQUIRED. An access token is a previously acquired token granting access to the target resource.")
  
  @NotNull
  public String getAccessToken() {  
    return accessToken;
  }



  public void setAccessToken(String accessToken) { 

    this.accessToken = accessToken;
  }

  public AccessTokenCredential accessTokenExpiresUtc(OffsetDateTime accessTokenExpiresUtc) { 

    this.accessTokenExpiresUtc = accessTokenExpiresUtc;
    return this;
  }

  /**
   * REQUIRED. An absolute (UTC) timestamp at which the token shall be considered expired. Token expiration should occur after the expiration of the requested session, allowing the client to be notified of any changes during the session's existence. If the token expires while the session is still active, the client will stop receiving notifications.
   * @return accessTokenExpiresUtc
   **/
  
  @Schema(required = true, description = "REQUIRED. An absolute (UTC) timestamp at which the token shall be considered expired. Token expiration should occur after the expiration of the requested session, allowing the client to be notified of any changes during the session's existence. If the token expires while the session is still active, the client will stop receiving notifications.")
  
@Valid
  @NotNull
  public OffsetDateTime getAccessTokenExpiresUtc() {  
    return accessTokenExpiresUtc;
  }



  public void setAccessTokenExpiresUtc(OffsetDateTime accessTokenExpiresUtc) { 

    this.accessTokenExpiresUtc = accessTokenExpiresUtc;
  }

  public AccessTokenCredential accessTokenType(AccessTokenTypeEnum accessTokenType) { 

    this.accessTokenType = accessTokenType;
    return this;
  }

  /**
   * REQUIRED. Type of the access token (See [OAuth 2.0](https://tools.ietf.org/html/rfc6749#section-7.1)). For the current version of the API the type MUST be set to `Bearer`.
   * @return accessTokenType
   **/
  
  @Schema(required = true, description = "REQUIRED. Type of the access token (See [OAuth 2.0](https://tools.ietf.org/html/rfc6749#section-7.1)). For the current version of the API the type MUST be set to `Bearer`.")
  
  @NotNull
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
    AccessTokenCredential accessTokenCredential = (AccessTokenCredential) o;
    return Objects.equals(this.accessToken, accessTokenCredential.accessToken) &&
        Objects.equals(this.accessTokenExpiresUtc, accessTokenCredential.accessTokenExpiresUtc) &&
        Objects.equals(this.accessTokenType, accessTokenCredential.accessTokenType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, accessTokenExpiresUtc, accessTokenType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenCredential {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    accessTokenExpiresUtc: ").append(toIndentedString(accessTokenExpiresUtc)).append("\n");
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
