package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class ComplainerRelationshipResponse extends PayloadAbstractBase {

    private String relationshipName;
    private String description;
}
