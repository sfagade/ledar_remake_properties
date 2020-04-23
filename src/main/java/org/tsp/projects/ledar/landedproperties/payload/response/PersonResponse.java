package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class PersonResponse extends PayloadAbstractBase {

    private String lastName;
    private String firstName;
    private String middleName;
    private Date dateOfBirth;
    private String maidenName;
    private String gender;
    private String maritalStatus;
    private String createdBy;
    private Boolean updateRequired;
    private String stateOfOrigin;
    private String nationality;
    private String personTitle;
    private String religion;
    private List<ContactInformationResponse> contactInformationResponseList;
    private OwnerAddressResponse ownerAddressResponse;
    private FileUploadResponse pictureUploadId;
    private OrganisationResponse organisationResponse;
    private String fullName;
}
