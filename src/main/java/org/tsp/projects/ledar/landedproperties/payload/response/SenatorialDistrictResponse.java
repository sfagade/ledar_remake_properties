package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

import java.time.LocalDateTime;
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

    public SenatorialDistrictResponse(Long districtId, String districtName, String senatorialCode, String districtState,
                                      LocalDateTime created, LocalDateTime modified) {
        this.districtName = districtName;
        this.senatorialCode = senatorialCode;
        this.districtState = districtState;
        this.baseId = districtId;
        this.created = created;
        this.modified = modified;
    }
}
