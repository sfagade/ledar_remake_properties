package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class PropertyValuationResponse extends PayloadAbstractBase {

    private BigDecimal accessedValue;
    private Date valuationDate;
    private String accessByUsername;
    private BigDecimal lucCharge;
    private BigDecimal landValue;
    private BigDecimal buildingValue;
    private String valuationRemarks;

}
