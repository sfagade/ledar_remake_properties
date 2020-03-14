package org.tsp.projects.ledar.landedproperties.model;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
@Table(name = "property_services")
@AttributeOverride(name = "id", column = @Column(name = "property_service_id", nullable = false, columnDefinition = "BIGINT"))
public class PropertyService extends LedarAbstractBase implements Serializable {
    
    @Size(max = 500)
    @Column(name = "description")
    private String description;

    @JoinColumn(name = "service_type_id", referencedColumnName = "service_type_id")
    @ManyToOne(optional = false)
    private PropertyServiceType serviceTypeId;
    @JoinColumn(name = "land_property_id", referencedColumnName = "land_property_id")
    @ManyToOne(optional = false)
    private LandProperty landPropertyId;
}
