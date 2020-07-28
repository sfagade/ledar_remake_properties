package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class LocalCouncilDevAreaResponse extends PayloadAbstractBase {

    private String lcdaName;
    private String remarks;
    private List<LcdaWardResponse> lcdaWardList;
    private SenatorialDistrictResponse senatorialDistrict;
    private String longitude;
    private String latitude;
    private OrganisationResponse contractorId;

    public LocalCouncilDevAreaResponse(Long lcdaId, String lcdaName, SenatorialDistrictResponse senatorialDistrict,
                                       String longitude, String latitude, OrganisationResponse contractorId,
                                       LocalDateTime created, LocalDateTime modified) {
        this.lcdaName = lcdaName;
        this.senatorialDistrict = senatorialDistrict;
        this.longitude = longitude;
        this.latitude = latitude;
        this.contractorId = contractorId;
        this.id = lcdaId;
        this.created = created;
        this.modified = modified;
    }
}
