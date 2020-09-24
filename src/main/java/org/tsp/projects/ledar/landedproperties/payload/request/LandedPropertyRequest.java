package org.tsp.projects.ledar.landedproperties.payload.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

import java.util.Date;

@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class LandedPropertyRequest extends PayloadAbstractBase {

    private Integer noOfBuildings;
    private String propertyValuationStatus;
    private String legacyPropertyId;
    private Boolean isBlockNumber;
    private Boolean titleDocument;
    private String propertyId;
    private String propertyNumber;
    private Boolean isIrregularAddress;
    private Boolean isVerified;
    private String roadSide;
    private String propertyLongitude;
    private String propertyLatitude;
    private Date dateCaptured;
    private Date verifiedDate;
    private String propertyTypes;
    private String landSize;
    private String irregularAddress;
    private String electricityType;
    private Boolean hasElectricity;
    private String description;
    private String waterSupply;
    private String wasteDisposalSystem;
    private String nearestBusStop;
    private String nearestRailTerminus;
    private String nearestWaterTerminus;
    private String ownershipType;
    private Double buildingArea;
    private String adminComment;
    private String verifiedByUsername;
    private String updatedByUsername;
}
