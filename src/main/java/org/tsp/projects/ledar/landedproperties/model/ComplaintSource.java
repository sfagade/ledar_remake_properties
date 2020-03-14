package org.tsp.projects.ledar.landedproperties.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Table(name = "ref_complaint_sources")
@AttributeOverride(name = "id", column = @Column(name = "complaint_source_id", nullable = false, columnDefinition = "BIGINT"))
public class ComplaintSource extends LedarAbstractBase implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "source_name")
    private String sourceName;
    @Size(max = 500)
    @Column(name = "description")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "complaintSourceId")
    private List<PropertyComplaint> propertyComplaintsList;
}
