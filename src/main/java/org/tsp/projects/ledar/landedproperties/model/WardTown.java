package org.tsp.projects.ledar.landedproperties.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ref_ward_towns")
@AttributeOverride(name = "id", column = @Column(name = "ward_town_id", nullable = false, columnDefinition = "BIGINT"))
public class WardTown extends LedarAbstractBase implements Serializable {
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "town_name")
    private String townName;
    @Size(max = 500)
    @Column(name = "description")
    private String description;
    
    @JoinColumn(name = "lcda_ward_id", referencedColumnName = "lcda_ward_id")
    @ManyToOne(optional = false)
    private LcdaWards lcdaWardId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "wardTownId")
    private List<WardStreet> wardStreetsList;
}
