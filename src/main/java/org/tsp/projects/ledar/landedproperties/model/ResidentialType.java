package org.tsp.projects.ledar.landedproperties.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
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
@Table(name = "ref_residential_types")
@AttributeOverride(name = "id", column = @Column(name = "residential_type_id", nullable = false, columnDefinition = "BIGINT"))
class ResidentialType extends LedarAbstractBase implements Serializable {
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "residential_type_name")
    private String residentialTypeName;
    @Size(max = 500)
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "residentialTypeId")
    private List<PropertyClassificationDetail> propertyClassificationDetailsList;
}
