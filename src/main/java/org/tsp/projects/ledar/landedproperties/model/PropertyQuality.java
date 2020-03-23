package org.tsp.projects.ledar.landedproperties.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
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
@Table(name = "property_qualities",
        uniqueConstraints=
        @UniqueConstraint(columnNames={"quality_name", "percentage_value"})
)
@AttributeOverride(name = "id", column = @Column(name = "property_quality_id", nullable = false, columnDefinition = "BIGINT"))
class PropertyQuality extends LedarAbstractBase implements Serializable {
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "quality_name")
    private String qualityName;
    @Column(name = "percentage_value")
    private Float percentageValue;
    @Size(max = 1000)
    @Column(name = "description")
    private String description;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propertyQualities")
    private List<LandProperty> wardLandPropertiesList;
}
