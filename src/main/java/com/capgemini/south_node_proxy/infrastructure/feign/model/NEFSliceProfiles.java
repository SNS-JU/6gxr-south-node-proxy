package com.capgemini.south_node_proxy.infrastructure.feign.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum NEFSliceProfiles {
	
	MADRID_LOW("madrid-low","parrot-embb"),
	BARCELONA_LOW("barcelona-low","parrot-embb"),
	MADRID_HIGH("madrid-high","parrot-embb"),
	BARCELONA_HIGH("barcelona-high","parrot-embb"),
	
	MADRID_A_LOW("madrid-a-low","5tonic-flamingo"),
	MADRID_B_LOW("madrid-b-low","internet"),
	MADRID_A_HIGH("madrid-a-high","5tonic-flamingo"),
	MADRID_B_HIGH("madrid-b-high","internet");
	
	String profileName;
	String dnn;
}
