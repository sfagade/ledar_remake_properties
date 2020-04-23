package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class LandedPropertyResponse extends PayloadAbstractBase {

    private Integer noOfBuildings;
    private String propertyValuationStatus;
    private String legacyPropertyId;
    private PropertyValuationResponse propertyValuation;
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
    private OrganisationResponse ownerOrganisationId;
    private OrganisationResponse contractorId;
    private PropertyBioDataResponse propertyOwnerBioData;
    private WardStreetResponse wardStreet;
    private List<PropertyClassificationDetailResponse> propertyClassificationDetailsList;
    private List<PropertyServiceResponse> propertyServiceTypesList; //TODO I need to convert this to an Enum
    private List<PropertyComplaintResponse> propertyComplaintsList;
    private PropertyQualityResponse propertyQualities;
    private Collection<PropertyDocumentResponse> propertyDocumentsCollection;
    private Boolean documentViewed;
    private NoTitleDocumentTypeResponse noTitleDocumentId;
    private TitleDocumentTypeResponse titleDocumentId;
}
