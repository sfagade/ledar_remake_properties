package org.tsp.projects.ledar.landedproperties.builders;

import org.tsp.projects.ledar.landedproperties.model.SettlementType;
import org.tsp.projects.ledar.landedproperties.payload.response.SettlementTypeResponse;

public class SettlementTypeBuilder {

    public static SettlementTypeResponse buildSettlementTypeData(SettlementType settlementType) {
        SettlementTypeResponse settlementTypeResponse = null;
        if (settlementType  != null) {
            settlementTypeResponse = new SettlementTypeResponse(settlementType.getId(),
                    settlementType.getSettlementTypeName(), settlementType.getDescription(),
                    settlementType.getCreated(), settlementType.getModified());
        }
        return settlementTypeResponse;
    }
}
