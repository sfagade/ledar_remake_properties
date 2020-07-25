package org.tsp.projects.ledar.landedproperties.builders;

import org.tsp.projects.ledar.landedproperties.model.SenatorialDistrict;
import org.tsp.projects.ledar.landedproperties.payload.response.SenatorialDistrictResponse;

public class SenatorialDistrictBuilder {

    public static SenatorialDistrictResponse buildSenatorialDistrictData(SenatorialDistrict senatorialDistrict, Boolean isDetail) {

        SenatorialDistrictResponse senatorialDistrictResponse = null;

        if (senatorialDistrict != null) {
            if (isDetail == null || !isDetail) {
                senatorialDistrictResponse = new SenatorialDistrictResponse(senatorialDistrict.getId(),
                        senatorialDistrict.getDistrictName(), senatorialDistrict.getSenatorialCode(),
                        senatorialDistrict.getDistrictState(), senatorialDistrict.getCreated(),
                        senatorialDistrict.getModified());
            } else {
                senatorialDistrictResponse = buildSenatorialDistrictData(senatorialDistrict, false);
                //TODO full implementation here would mean that we want to show all contractors for the district
            }
        }

        return senatorialDistrictResponse;
    }
}
