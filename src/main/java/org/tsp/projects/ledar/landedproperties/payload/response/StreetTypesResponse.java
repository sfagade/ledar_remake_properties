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
public class StreetTypesResponse extends PayloadAbstractBase {

    private String streetTypeName;
    private String description;

    public StreetTypesResponse(long streetTypeId, String streetTypeName, String description, LocalDateTime created,
                               LocalDateTime modified) {
        this.streetTypeName = streetTypeName;
        this.description = description;
        this.baseId = streetTypeId;
        this.modified = modified;
        this.created = created;
    }
}
