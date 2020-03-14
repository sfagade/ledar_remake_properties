package org.tsp.projects.ledar.landedproperties.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Table(name = "ref_senatorial_districts")
@AttributeOverride(name = "id", column = @Column(name = "senatorial_district_id", nullable = false, columnDefinition = "BIGINT"))
public class SenatorialDistrict extends LedarAbstractBase implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "district_name")
    private String districtName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "senatorial_code")
    private String senatorialCode;
    @Size(max = 75)
    @Column(name = "senatorial_representative")
    private String senatorialRepresentative;
    @Size(max = 500)
    @Column(name = "remarks")
    private String remarks;
    @Size(max = 35)
    @Column(name = "district_state")
    private String districtState;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "senatorialDistrictId")
    private Collection<Organisation> organisationCollection;


}
