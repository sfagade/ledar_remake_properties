package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

import java.math.BigDecimal;
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
}
