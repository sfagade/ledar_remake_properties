package org.tsp.projects.ledar.landedproperties.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
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
import javax.persistence.UniqueConstraint;
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
@Table(name = "ref_lcda_wards", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ward_name", "local_council_dev_area_id"})
})
@AttributeOverride(name = "id", column = @Column(name = "lcda_ward_id", nullable = false, columnDefinition = "BIGINT"))
public class LcdaWard extends LedarAbstractBase implements Serializable {

    @Column(name = "building_value")
    private BigDecimal buildingValue;
    @Column(name = "land_value")
    private BigDecimal landValue;
    @Size(max = 25)
    @Column(name = "ward_code")
    private String wardCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ward_name")
    private String wardName;
    @Size(max = 500)
    @Column(name = "remarks")
    private String remarks;
    @JoinColumn(name = "local_council_dev_area_id", referencedColumnName = "local_council_dev_area_id")
    @ManyToOne(optional = false)
    private LocalCouncilDevArea localCouncilDevAreaId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lcdaWardId")
    private List<WardStreet> wardStreetsList;
    @JoinColumn(name = "contractor_id", referencedColumnName = "organisation_id")
    @ManyToOne
    private Organisation contractorId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lcdaWardId")
    private List<WardTown> wardTownsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lcdaWardId")
    private List<EnumeratorWard> enumeratorWardsList;
}
