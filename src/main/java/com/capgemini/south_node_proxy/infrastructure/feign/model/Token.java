package com.capgemini.south_node_proxy.infrastructure.feign.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Token {
	
  @JsonProperty("access_token")
  private String accessToken;
}
