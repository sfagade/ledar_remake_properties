package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

import java.time.LocalDateTime;
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

    public WardStreetResponse(Long streetId, String streetName, String offStreetOne, String estateName,
                              SettlementTypeResponse settlementType, StreetTypesResponse streetType,
                              LcdaWardResponse lcdaWardId, LocalDateTime created, LocalDateTime modified) {
        this.streetName = streetName;
        this.offStreetOne = offStreetOne;
        this.estateName = estateName;
        this.settlementType = settlementType;
        this.streetType = streetType;
        this.lcdaWardId = lcdaWardId;
        this.id = streetId;
        this.created = created;
        this.modified = modified;
    }
}
