package com.capgemini.south_node_proxy.infrastructure.feign.model;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum QoDProfileIEAPtoNEFMapper {

	QOS_E(Arrays.asList(NEFSliceProfiles.MADRID_LOW, NEFSliceProfiles.BARCELONA_LOW),
			Arrays.asList(NEFSliceProfiles.MADRID_A_LOW, NEFSliceProfiles.MADRID_B_LOW)),

	QOS_S(Arrays.asList(NEFSliceProfiles.MADRID_LOW, NEFSliceProfiles.BARCELONA_LOW),
			Arrays.asList(NEFSliceProfiles.MADRID_A_LOW, NEFSliceProfiles.MADRID_B_LOW)),

	QOS_M(Arrays.asList(NEFSliceProfiles.MADRID_HIGH, NEFSliceProfiles.BARCELONA_HIGH),
			Arrays.asList(NEFSliceProfiles.MADRID_A_HIGH, NEFSliceProfiles.MADRID_B_HIGH)),

	QOS_L(Arrays.asList(NEFSliceProfiles.MADRID_HIGH, NEFSliceProfiles.BARCELONA_HIGH),
			Arrays.asList(NEFSliceProfiles.MADRID_A_HIGH, NEFSliceProfiles.MADRID_B_HIGH));

	List<NEFSliceProfiles> uc2Mappings;
	List<NEFSliceProfiles> dynamiconMappings;
}
