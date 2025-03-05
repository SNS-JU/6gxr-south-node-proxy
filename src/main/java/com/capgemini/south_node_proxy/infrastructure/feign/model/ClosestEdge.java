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
public class ClosestEdge {

	  @JsonProperty("edgeCloudProvider")
	  private String edgeCloudProvider;
	  
	  @JsonProperty("edgeResourceName")
	  private String edgeResourceName;
}
