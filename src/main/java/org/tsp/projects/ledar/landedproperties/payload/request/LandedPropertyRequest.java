package org.tsp.projects.ledar.landedproperties.payload.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

import javax.validation.constraints.NotNull;
import java.util.Date;

@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class LandedPropertyRequest extends PayloadAbstractBase {

    @NotNull
    private Integer noOfBuildings;
    private String propertyValuationStatus;
    @NotNull
    private Boolean isBlockNumber;
    @NotNull
    private Boolean titleDocument;
    @NotNull
    private String propertyId;
    private String propertyNumber;
    private Boolean isVerified;
    @NotNull
    private String roadSide;
    @NotNull
    private String propertyLongitude;
    @NotNull
    private String propertyLatitude;
    @NotNull
    private Date dateCaptured;
    @NotNull
    private String propertyTypes;
    @NotNull
    private String landSize;
    @NotNull
    private String electricityType;
    private Boolean hasElectricity;
    private String description;
    private String waterSupply;
    private String wasteDisposalSystem;
    @NotNull
    private String ownershipType;
    @NotNull
    private Double buildingArea;
    @NotNull
    private Long propertyValuationId;
    private String phcnId;
    private String lswcId;
    private String verifiedByUsername;
    private String updatedByUsername;
    private Long ownerOrganisationId;
    private Long contractorId;
    private Long wardStreetId;
    private Long propertyQuality;
    @NotNull
    private boolean documentViewed;
    private Long titleDocumentId;
    private Long noTitleDocumentId;
    private String[] propertyServiceTypes;
    
    private PropertyBioDataRequest propertyBioData;
    private OrganisationRequest ownerOrganisation;
    private PropertyDetailsRequest propertyDetail;

}
