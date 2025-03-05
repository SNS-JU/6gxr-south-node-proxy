package com.capgemini.south_node_proxy.domain.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * A plain credential as a combination of an identifier and a secret.
 */
@Schema(description = "A plain credential as a combination of an identifier and a secret.")
@Validated

public class PlainCredential extends SinkCredential  {
  @JsonProperty("identifier")

  private String identifier = null;

  @JsonProperty("secret")

  private String secret = null;


  public PlainCredential identifier(String identifier) { 

    this.identifier = identifier;
    return this;
  }

  /**
   * The identifier might be an account or username.
   * @return identifier
   **/
  
  @Schema(required = true, description = "The identifier might be an account or username.")
  
  @NotNull
  public String getIdentifier() {  
    return identifier;
  }



  public void setIdentifier(String identifier) { 

    this.identifier = identifier;
  }

  public PlainCredential secret(String secret) { 

    this.secret = secret;
    return this;
  }

  /**
   * The secret might be a password or passphrase.
   * @return secret
   **/
  
  @Schema(required = true, description = "The secret might be a password or passphrase.")
  
  @NotNull
  public String getSecret() {  
    return secret;
  }



  public void setSecret(String secret) { 

    this.secret = secret;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlainCredential plainCredential = (PlainCredential) o;
    return Objects.equals(this.identifier, plainCredential.identifier) &&
        Objects.equals(this.secret, plainCredential.secret) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, secret, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlainCredential {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
