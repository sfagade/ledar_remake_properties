package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;
import org.tsp.projects.ledar.landedproperties.resource.LandPropertyResource;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class PropertyComplaintResponse extends PayloadAbstractBase {

    private Date complaintDate;
    private String propertyId;
    private String questionnaire;
    private String complaintNumber;
    private String contactFullName;
    private String contactPhoneNumber; //TODO I should extract this to contact-information
    private String contactDesignation;
    private String contactOtherNumber;
    private String contactEmailAddress;
    private String complaintOwnerAddress; //TODO I should extract this to owner address
    private String ownerFirstName; //TODO I should extract this to property owner object
    private String ownerLastName;
    private String ownerOtherName;
    private String ownerEmail;
    private String ownerPhoneNumber;
    private String ownerAddress;
    private Date ownerDob;
    private String propertyCompanyName;
    private String personTitle;
    private List<ComplaintDocumentResponse> complaintDocumentsList;
    private ComplaintSourceResponse complaintSource;
    private LandPropertyResource landPropertyId;
    private List<ComplaintDetailResponse> complaintDetailsList;
    private LcdaWardResponse lcdaWard;
    private LocalCouncilDevAreaResponse localCouncilDevArea;
    private OrganisationResponse organisation;
    private ComplainerRelationshipResponse complainerRelationship;
}
