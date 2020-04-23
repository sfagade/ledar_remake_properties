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
@Table(name = "enumerator_wards")
@AttributeOverride(name = "id", column = @Column(name = "enumerator_ward_id", nullable = false, columnDefinition = "BIGINT"))
public class EnumeratorWard extends LedarAbstractBase implements Serializable {

    @Size(max = 2000)
    @Column(name = "remarks")
    private String remarks;
    @JoinColumn(name = "lcda_ward_id", referencedColumnName = "lcda_ward_id")
    @ManyToOne(optional = false)
    private LcdaWard lcdaWardId;
    
}
