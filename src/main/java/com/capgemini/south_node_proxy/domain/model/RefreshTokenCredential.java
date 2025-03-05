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

/**
 * An access token credential with a refresh token.
 */
@Schema(description = "An access token credential with a refresh token.")
@Validated

public class RefreshTokenCredential extends SinkCredential  {
  @JsonProperty("accessToken")

  private String accessToken = null;

  @JsonProperty("accessTokenExpiresUtc")

  private OffsetDateTime accessTokenExpiresUtc = null;

  /**
   * REQUIRED. Type of the access token (See [OAuth 2.0](https://tools.ietf.org/html/rfc6749#section-7.1)).
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

  @JsonProperty("refreshToken")

  private String refreshToken = null;

  @JsonProperty("refreshTokenEndpoint")

  private String refreshTokenEndpoint = null;


  public RefreshTokenCredential accessToken(String accessToken) { 

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

  public RefreshTokenCredential accessTokenExpiresUtc(OffsetDateTime accessTokenExpiresUtc) { 

    this.accessTokenExpiresUtc = accessTokenExpiresUtc;
    return this;
  }

  /**
   * REQUIRED. An absolute UTC instant at which the token shall be considered expired.
   * @return accessTokenExpiresUtc
   **/
  
  @Schema(required = true, description = "REQUIRED. An absolute UTC instant at which the token shall be considered expired.")
  
@Valid
  @NotNull
  public OffsetDateTime getAccessTokenExpiresUtc() {  
    return accessTokenExpiresUtc;
  }



  public void setAccessTokenExpiresUtc(OffsetDateTime accessTokenExpiresUtc) { 

    this.accessTokenExpiresUtc = accessTokenExpiresUtc;
  }

  public RefreshTokenCredential accessTokenType(AccessTokenTypeEnum accessTokenType) { 

    this.accessTokenType = accessTokenType;
    return this;
  }

  /**
   * REQUIRED. Type of the access token (See [OAuth 2.0](https://tools.ietf.org/html/rfc6749#section-7.1)).
   * @return accessTokenType
   **/
  
  @Schema(required = true, description = "REQUIRED. Type of the access token (See [OAuth 2.0](https://tools.ietf.org/html/rfc6749#section-7.1)).")
  
  @NotNull
  public AccessTokenTypeEnum getAccessTokenType() {  
    return accessTokenType;
  }



  public void setAccessTokenType(AccessTokenTypeEnum accessTokenType) { 

    this.accessTokenType = accessTokenType;
  }

  public RefreshTokenCredential refreshToken(String refreshToken) { 

    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * REQUIRED. An refresh token credential used to acquire access tokens.
   * @return refreshToken
   **/
  
  @Schema(required = true, description = "REQUIRED. An refresh token credential used to acquire access tokens.")
  
  @NotNull
  public String getRefreshToken() {  
    return refreshToken;
  }



  public void setRefreshToken(String refreshToken) { 

    this.refreshToken = refreshToken;
  }

  public RefreshTokenCredential refreshTokenEndpoint(String refreshTokenEndpoint) { 

    this.refreshTokenEndpoint = refreshTokenEndpoint;
    return this;
  }

  /**
   * REQUIRED. A URL at which the refresh token can be traded for an access token.
   * @return refreshTokenEndpoint
   **/
  
  @Schema(required = true, description = "REQUIRED. A URL at which the refresh token can be traded for an access token.")
  
  @NotNull
  public String getRefreshTokenEndpoint() {  
    return refreshTokenEndpoint;
  }



  public void setRefreshTokenEndpoint(String refreshTokenEndpoint) { 

    this.refreshTokenEndpoint = refreshTokenEndpoint;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefreshTokenCredential refreshTokenCredential = (RefreshTokenCredential) o;
    return Objects.equals(this.accessToken, refreshTokenCredential.accessToken) &&
        Objects.equals(this.accessTokenExpiresUtc, refreshTokenCredential.accessTokenExpiresUtc) &&
        Objects.equals(this.accessTokenType, refreshTokenCredential.accessTokenType) &&
        Objects.equals(this.refreshToken, refreshTokenCredential.refreshToken) &&
        Objects.equals(this.refreshTokenEndpoint, refreshTokenCredential.refreshTokenEndpoint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, accessTokenExpiresUtc, accessTokenType, refreshToken, refreshTokenEndpoint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefreshTokenCredential {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    accessTokenExpiresUtc: ").append(toIndentedString(accessTokenExpiresUtc)).append("\n");
    sb.append("    accessTokenType: ").append(toIndentedString(accessTokenType)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    refreshTokenEndpoint: ").append(toIndentedString(refreshTokenEndpoint)).append("\n");
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
