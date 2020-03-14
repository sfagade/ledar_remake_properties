package org.tsp.projects.ledar.landedproperties.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author samsonfagade
 */
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Table(name = "ref_complaint_types")
@AttributeOverride(name = "id", column = @Column(name = "complaint_type_id", nullable = false, columnDefinition = "BIGINT"))
public class ComplaintType extends LedarAbstractBase implements Serializable {
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "type_name")
    private String typeName;
    @Size(max = 35)
    @Column(name = "handling_group")
    private String handlingGroup;
    @Size(max = 500)
    @Column(name = "description")
    private String description;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "complaintTypeId")
    private List<ComplaintDetail> complaintDetailsList;
}
