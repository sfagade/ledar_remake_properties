package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

import java.util.Collection;

@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class SenatorialDistrictResponse extends PayloadAbstractBase {

    private String districtName;
    private String senatorialCode;
    private String senatorialRepresentative;
    private String remarks;
    private String districtState;
    private Collection<OrganisationResponse> organisationCollection;
}
