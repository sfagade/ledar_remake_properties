package org.tsp.projects.ledar.landedproperties.builders;

import org.tsp.projects.ledar.landedproperties.model.LocalCouncilDevArea;
import org.tsp.projects.ledar.landedproperties.payload.response.LocalCouncilDevAreaResponse;

public class LocalCouncilDevAreaBuilder {

    public static LocalCouncilDevAreaResponse buildLocalCouncilDevAreaData(LocalCouncilDevArea localCouncilDevArea, Boolean isDetail) {
        LocalCouncilDevAreaResponse localCouncilDevAreaResponse = null;
        if (localCouncilDevArea != null) {
            if (isDetail == null || !isDetail) {
                localCouncilDevAreaResponse = new LocalCouncilDevAreaResponse(localCouncilDevArea.getId(),
                        localCouncilDevArea.getLcdaName(),
                        SenatorialDistrictBuilder.buildSenatorialDistrictData(localCouncilDevArea.getSenatorialDistrictId(), false),
                        localCouncilDevArea.getLongitude(), localCouncilDevArea.getLatitude(),
                        OrganisationBuilder.buildOrganisationData(localCouncilDevArea.getContractorId(), false),
                        localCouncilDevArea.getCreated(), localCouncilDevArea.getModified());
            } else {
                localCouncilDevAreaResponse = buildLocalCouncilDevAreaData(localCouncilDevArea, false);
                //TODO I need to add lcdaWardList to make this a detailed object
            }
        }
        return localCouncilDevAreaResponse;
    }
}
