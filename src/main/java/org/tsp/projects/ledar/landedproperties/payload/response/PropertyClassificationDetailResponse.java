package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class PropertyClassificationDetailResponse extends PayloadAbstractBase {

    private Long noOfRooms;
    private Long noOfUnits;
    private Long noOfRoomsPerUnit;
    private Long noOfFlats;
    private Long noOfRoomsPerFlat;
    private Long noOfFloors;
    private String sizePerFloor;
    private String propertyName;
    private String facilities;
    private Long noOfPumps;
    private String forecourtArea;
    private String warehouseInformation;
    private String recreationalInformation;
    private Boolean isPrivateBusiness;
    private Double buildingFootprint;
    private Boolean isCompletedStructure;
    private String updaterUsername;

    private LandedPropertyResponse landProperty;
    private ResidentialTypeResponse residentialType;
    private PropertyClassificationResponse propertyClassificationId;
    private PropertyUsageCategoryResponse usageCategory;
}
