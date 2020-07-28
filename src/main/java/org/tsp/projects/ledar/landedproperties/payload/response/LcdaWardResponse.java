package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class LcdaWardResponse extends PayloadAbstractBase {

    private BigDecimal buildingValue;
    private BigDecimal landValue;
    private String wardCode;
    private String wardName;
    private String remarks;
    private LocalCouncilDevAreaResponse localCouncilDevArea;
    private List<WardStreetResponse> wardStreetsList;
    private OrganisationResponse contractor;
    private List<WardTownResponse> wardTownsList;
    private List<EnumeratorWardResponse> enumeratorWardsListResponse;

    public LcdaWardResponse(Long wardId, String wardCode, String wardName, LocalCouncilDevAreaResponse localCouncilDevArea,
                            OrganisationResponse contractor, LocalDateTime created, LocalDateTime modified) {
        this.wardCode = wardCode;
        this.wardName = wardName;
        this.localCouncilDevArea = localCouncilDevArea;
        this.contractor = contractor;
        this.id = wardId;
        this.created = created;
        this.modified = modified;
    }
}
