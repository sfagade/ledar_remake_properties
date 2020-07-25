package org.tsp.projects.ledar.landedproperties.builders;

import org.tsp.projects.ledar.landedproperties.model.Organisation;
import org.tsp.projects.ledar.landedproperties.payload.response.OrganisationResponse;

public class OrganisationBuilder {

    public static OrganisationResponse buildOrganisationData(Organisation organisation, Boolean isDetail) {

        OrganisationResponse organisationResponse = null;

        if  (organisation != null) {
            if (isDetail == null || !isDetail) {
                organisationResponse = new OrganisationResponse(organisation.getId(), organisation.getOrganisationName(),
                        organisation.getOrganisationCode(), organisation.getOrganisationSector(),
                        SenatorialDistrictBuilder.buildSenatorialDistrictData(organisation.getSenatorialDistrictId(), false),
                        organisation.getCreated(), organisation.getModified());
            } else {
                organisationResponse = buildOrganisationData(organisation, false);
                //TODO I will go on here and implement adding more details to make this complete
            }
        }

        return organisationResponse;
    }
}
