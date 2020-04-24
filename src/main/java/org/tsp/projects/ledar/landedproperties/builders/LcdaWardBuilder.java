package org.tsp.projects.ledar.landedproperties.builders;

import org.tsp.projects.ledar.landedproperties.model.LcdaWard;
import org.tsp.projects.ledar.landedproperties.payload.response.LcdaWardResponse;

public class LcdaWardBuilder {

    public static LcdaWardResponse buildLcdaWardData(LcdaWard lcdaWard, boolean isDetail) {
        LcdaWardResponse lcdaWardResponse = null;
        if (lcdaWard != null) {
            if (!isDetail) {
                lcdaWardResponse = new LcdaWardResponse(lcdaWard.getId(), lcdaWard.getWardCode(), lcdaWard.getWardName(),
                        LocalCouncilDevAreaBuilder.buildLocalCouncilDevAreaData(lcdaWard.getLocalCouncilDevAreaId(), false),
                        OrganisationBuilder.buildOrganisationData(lcdaWard.getContractorId(), false),
                        lcdaWard.getCreated(), lcdaWard.getModified());
            } else {
                lcdaWardResponse = buildLcdaWardData(lcdaWard, false);
                //NOTICE I need to implement adding the other fields to make this a whole object
            }
        }
        return lcdaWardResponse;
    }
}
