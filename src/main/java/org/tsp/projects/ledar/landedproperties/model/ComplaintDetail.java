package org.tsp.projects.ledar.landedproperties.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Table(name = "complaint_details")
@AttributeOverride(name = "id", column = @Column(name = "complaint_detail_id", nullable = false, columnDefinition = "BIGINT"))
public class ComplaintDetail extends LedarAbstractBase implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "complaint")
    private String complaint;
    @Lob
    @Size(max = 65535)
    @Column(name = "recommendation")
    private String recommendation;
    @Size(max = 25)
    @Column(name = "complaint_unit", nullable = false)
    private String complaintUnit;
    @Column(name = "handle_date")
    @Temporal(TemporalType.DATE)
    private Date handleDate;
    @Column(name = "handler_username")
    @Size(max = 35)
    private String handlerUsername;
    @JoinColumn(name = "property_complaint_id", referencedColumnName = "property_complaint_id")
    @ManyToOne(optional = false)
    private PropertyComplaint propertyComplaintId;
    @JoinColumn(name = "complaint_status_id", referencedColumnName = "complaint_status_id")
    @ManyToOne(optional = false)
    private ComplaintStatus complaintStatusId;
    @JoinColumn(name = "complaint_type_id", referencedColumnName = "complaint_type_id")
    @ManyToOne(optional = false)
    private ComplaintType complaintTypeId;
    
}
