package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

import java.util.List;

@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class WardStreetResponse extends PayloadAbstractBase {

    private String streetName;
    private String offStreetOne;
    private String offStreetTwo;
    private String nearestBusStop;
    private Long noOfBuildings;
    private Boolean hasElectricity;
    private Boolean isGeneratorElectricity;
    private Boolean hasStreetLight;
    private Boolean isCommunityLight;
    private String wasteDisposalSystem;
    private String tarredRoad;
    private String untarredRoad;
    private Boolean hasDrainageFacility;
    private Boolean drainageCovered;
    private Boolean hasWalkways;
    private Boolean hasStreetLandscaping;
    private String nearestBusStopType;
    private String nearestRailTerminus;
    private String nearestWaterTerminus;
    private Boolean isVerified;
    private String remarks;
    private String estateName;
    private String verifiedByUsername;
    private SettlementTypeResponse settlementType;
    private StreetTypesResponse streetType;
    private LcdaWardResponse lcdaWardId;
    private List<LandedPropertyResponse> landPropertyList;
    private WardTownResponse wardTownId;
}
