package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

import java.time.LocalDateTime;

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

    public OrganisationResponse(Long organisationId, String organisationName, String organisationCode,
                                String organisationType, SenatorialDistrictResponse senatorialDistrict,
                                LocalDateTime created, LocalDateTime modified) {
        this.organisationName = organisationName;
        this.organisationCode = organisationCode;
        this.organisationType = organisationType;
        this.senatorialDistrict = senatorialDistrict;
        this.baseId = organisationId;
        this.created = created;
        this.modified = modified;
    }
}
