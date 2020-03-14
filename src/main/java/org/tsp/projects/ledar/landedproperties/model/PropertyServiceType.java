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
@Table(name = "ref_service_types")
@AttributeOverride(name = "id", column = @Column(name = "service_type_id", nullable = false, columnDefinition = "BIGINT"))
public class PropertyServiceType extends LedarAbstractBase implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "service_type_name")
    private String serviceTypeName;
    @Size(max = 500)
    @Column(name = "description")
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "serviceTypeId")
    private List<PropertyService> propertyServiceTypesList;
}
