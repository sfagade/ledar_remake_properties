package org.tsp.projects.ledar.landedproperties.builders;

import org.tsp.projects.ledar.landedproperties.model.LandProperty;
import org.tsp.projects.ledar.landedproperties.payload.response.LandedPropertyResponse;

public class LandedPropertyBuilder {

    public static LandedPropertyResponse buildLandPropertyData(LandProperty landProperty, Boolean isDetail) {

        LandedPropertyResponse landedPropertyResponse = null;
        if (landProperty != null) {
            if (isDetail == null || !isDetail) {
                landedPropertyResponse = new LandedPropertyResponse(landProperty.getId(), landProperty.getNoOfBuildings(),
                        landProperty.getPropertyValuationStatus(), landProperty.getPropertyId(),
                        landProperty.getPropertyNumber(), landProperty.getDateCaptured(), landProperty.getVerifiedDate(),
                        landProperty.getLandSize(), landProperty.getOwnershipType(), landProperty.getBuildingArea(),
                        landProperty.getVerifiedByUsername(), landProperty.getUpdatedByUsername(),
                        OrganisationBuilder.buildOrganisationData(landProperty.getContractorId(), false),
                        WardStreetBuilder.buildWardStreetData(landProperty.getWardStreetId(), false),
                        landProperty.getCreated(), landProperty.getModified());
            } else {
                landedPropertyResponse = buildLandPropertyData(landProperty, false);
                //TODO I should add the other fields that are not part of the constructor used to create the non-detail object
            }
        }

        return landedPropertyResponse;
    }
}
