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
public class OrganisationResponse extends PayloadAbstractBase {

    private String organisationName;
    private String organisationNumber;
    private String organisationCode;
    private Boolean enabled;
    private Long ownerPersonId;
    private String emailAddress;
    private String organisationType;
    private String webUrl;
    private OwnerAddressResponse addressId;
    private FileUploadResponse organizationLogoId;
    private SenatorialDistrictResponse senatorialDistrict;
}
