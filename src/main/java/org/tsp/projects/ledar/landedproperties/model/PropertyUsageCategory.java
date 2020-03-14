package org.tsp.projects.ledar.landedproperties.model;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ref_property_usage_categories")
@AttributeOverride(name = "id", column = @Column(name = "usage_category_id", nullable = false, columnDefinition = "BIGINT"))
public class PropertyUsageCategory extends LedarAbstractBase implements Serializable {
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "category_name")
    private String categoryName;
    @Size(max = 1000)
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "property_classification_id", referencedColumnName = "property_classification_id")
    @ManyToOne(optional = false)
    private PropertyClassification propertyClassificationId;
}
