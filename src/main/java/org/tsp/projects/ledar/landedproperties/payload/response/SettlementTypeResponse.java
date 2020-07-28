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
public class SettlementTypeResponse extends PayloadAbstractBase {

    private String settlementTypeName;
    private String description;

    public SettlementTypeResponse(Long settlementTypeId, String settlementTypeName, String description,
                                  LocalDateTime created, LocalDateTime modified) {
        this.settlementTypeName = settlementTypeName;
        this.description = description;
        this.id = settlementTypeId;
        this.created = created;
        this.modified = modified;
    }
}
