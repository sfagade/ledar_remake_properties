package org.tsp.projects.ledar.landedproperties.model;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "ref_complainer_relationships")
@AttributeOverride(name = "id", column = @Column(name = "relationship_id", nullable = false, columnDefinition = "BIGINT"))
public class ComplainerRelationship extends LedarAbstractBase implements Serializable {
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 75)
    @Column(name = "relationship_name")
    private String relationshipName;
    @Size(max = 500)
    @Column(name = "description")
    private String description;
}
