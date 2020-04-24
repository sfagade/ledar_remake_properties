package org.tsp.projects.ledar.landedproperties.builders;

import org.tsp.projects.ledar.landedproperties.model.StreetTypes;
import org.tsp.projects.ledar.landedproperties.payload.response.StreetTypesResponse;

public class StreetTypeBuilder {

    public static StreetTypesResponse buildStreetTypeData(StreetTypes streetType) {
        StreetTypesResponse streetTypesResponse = null;
        if (streetType != null) {
            streetTypesResponse = new StreetTypesResponse(streetType.getId(), streetType.getStreetTypeName(),
                    streetType.getDescription(), streetType.getCreated(), streetType.getModified());
        }
        return streetTypesResponse;
    }
}
