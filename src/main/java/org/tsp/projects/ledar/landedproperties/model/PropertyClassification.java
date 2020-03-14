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
@Table(name = "ref_property_use")
@AttributeOverride(name = "id", column = @Column(name = "property_classification_id", nullable = false, columnDefinition = "BIGINT"))
public class PropertyClassification extends LedarAbstractBase implements Serializable {
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "classification_name")
    private String classificationName;
    @Size(max = 500)
    @Column(name = "description")
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propertyClassificationId")
    private List<PropertyClassificationDetail> propertyClassificationDetailsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propertyClassificationId")
    private List<PropertyUsageCategory> propertyUsageCategoriesList;
}
