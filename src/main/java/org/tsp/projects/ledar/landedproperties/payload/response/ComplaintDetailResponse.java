package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

import java.util.Date;

@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class ComplaintDetailResponse extends PayloadAbstractBase {

    private String complaint;
    private String recommendation;
    private String complaintUnit;
    private Date handleDate;
    private String handlerUsername;
    private PropertyComplaintResponse propertyComplaintId;
    private ComplaintStatusResponse complaintStatusId;
    private ComplaintTypeResponse complaintTypeId;
}
