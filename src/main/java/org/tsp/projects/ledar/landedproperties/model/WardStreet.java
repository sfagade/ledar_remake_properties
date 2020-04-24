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
@Table(name = "ref_ward_streets")
@AttributeOverride(name = "id", column = @Column(name = "ward_street_id", nullable = false, columnDefinition = "BIGINT"))
public class WardStreet extends LedarAbstractBase implements Serializable  {
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "street_name")
    private String streetName;
    @Column(name = "off_street_one")
    private String offStreetOne;
    @Size(max = 100)
    @Column(name = "off_street_two")
    private String offStreetTwo;
    @Size(max = 100)
    @Column(name = "nearest_bus_stop")
    private String nearestBusStop;
    @Column(name = "no_of_buildings")
    private Long noOfBuildings;
    @Column(name = "has_electricity")
    private Boolean hasElectricity;
    @Column(name = "is_generator_electricity")
    private Boolean isGeneratorElectricity;
    @Column(name = "has_street_light")
    private Boolean hasStreetLight;
    @Column(name = "is_community_light")
    private Boolean isCommunityLight;
    @Size(max = 15)
    @Column(name = "waste_disposal_system")
    private String wasteDisposalSystem;
    @Size(max = 15)
    @Column(name = "tarred_road")
    private String tarredRoad;
    @Size(max = 25)
    @Column(name = "untarred_road")
    private String untarredRoad;
    @Column(name = "has_drainage_facility")
    private Boolean hasDrainageFacility;
    @Column(name = "drainage_covered")
    private Boolean drainageCovered;
    @Column(name = "has_walkways")
    private Boolean hasWalkways;
    @Column(name = "has_street_landscaping")
    private Boolean hasStreetLandscaping;
    @Size(max = 15)
    @Column(name = "nearest_bus_stop_type")
    private String nearestBusStopType;
    @Size(max = 15)
    @Column(name = "nearest_rail_terminus")
    private String nearestRailTerminus;
    @Size(max = 15)
    @Column(name = "nearest_water_terminus")
    private String nearestWaterTerminus;
    @Column(name = "is_verified")
    private Boolean isVerified;
    @Size(max = 1000)
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "estate_name")
    private String estateName;
    @Size(max = 35)
    @Column(name = "verified_by_username")
    private String verifiedByUsername;
    @JoinColumn(name = "settlement_type_id", referencedColumnName = "settlement_type_id")
    @ManyToOne
    private SettlementType settlementTypeId;
    @JoinColumn(name = "street_type_id", referencedColumnName = "street_type_id")
    @ManyToOne
    private StreetTypes streetTypeId;
    @JoinColumn(name = "lcda_ward_id", referencedColumnName = "lcda_ward_id")
    @ManyToOne(optional = false)
    private LcdaWard lcdaWardId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "wardStreetId")
    private List<LandProperty> landPropertyList;
    @JoinColumn(name = "ward_town_id", referencedColumnName = "ward_town_id")
    //@ManyToOne(optional = false)
    @ManyToOne
    private WardTown wardTownId;
}
