package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.model.PropertyServiceType;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class PropertyServiceResponse extends PayloadAbstractBase {

    private String description;
    private PropertyServiceType serviceTypeId;
}
