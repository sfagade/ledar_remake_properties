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
@Table(name = "ref_local_council_dev_area")
@AttributeOverride(name = "id", column = @Column(name = "local_council_dev_area_id", nullable = false, columnDefinition = "BIGINT"))
public class LocalCouncilDevArea extends LedarAbstractBase implements Serializable  {
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "lcda_name")
    private String lcdaName;
    @Size(max = 500)
    @Column(name = "remarks")
    private String remarks;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "localCouncilDevAreaId")
    private List<LcdaWards> lcdaWardsList;
    @JoinColumn(name = "senatorial_district_id", referencedColumnName = "senatorial_district_id")
    @ManyToOne(optional = false)
    private SenatorialDistrict senatorialDistrictId;
    @Column(name = "longitude")
    private String longitude;
    @Column(name = "latitude")
    private String latitude;
    @JoinColumn(name = "contractor_id", referencedColumnName = "organisation_id")
    @ManyToOne
    private Organisation contractorId;
}
