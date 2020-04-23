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
public class OwnerAddressResponse extends PayloadAbstractBase {

    private String houseNo;
    private String streetName;
    private String directions;
    private String city;
    private String areaCode;
    private String addressState;
    private String addressCountry;
    private List<ContactInformationResponse> contactInformationList;
    private List<PersonResponse> personResponseListList;
    private List<OrganisationResponse> organisationResponseList;
}
