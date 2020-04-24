package org.tsp.projects.ledar.landedproperties.builders;

import org.tsp.projects.ledar.landedproperties.model.WardStreet;
import org.tsp.projects.ledar.landedproperties.payload.response.WardStreetResponse;

public class WardStreetBuilder {

    public static WardStreetResponse buildWardStreetData(WardStreet wardStreet, boolean isDetail) {
        WardStreetResponse wardStreetResponse = null;
        if (wardStreet != null) {
            if (!isDetail) {
                wardStreetResponse = new WardStreetResponse(wardStreet.getId(), wardStreet.getStreetName(),
                        wardStreet.getOffStreetOne(), wardStreet.getEstateName(),
                        SettlementTypeBuilder.buildSettlementTypeData(wardStreet.getSettlementTypeId()),
                        StreetTypeBuilder.buildStreetTypeData(wardStreet.getStreetTypeId()),
                        LcdaWardBuilder.buildLcdaWardData(wardStreet.getLcdaWardId(), false),
                        wardStreet.getCreated(), wardStreet.getModified());
            } else {
                wardStreetResponse = buildWardStreetData(wardStreet, false);
                //NOTE I need to add the fields to make this a complete details implementation
            }
        }
        return wardStreetResponse;
    }
}
