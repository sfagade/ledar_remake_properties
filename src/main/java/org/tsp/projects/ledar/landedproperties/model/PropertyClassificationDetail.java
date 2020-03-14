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
@Table(name = "property_classification_details")
@AttributeOverride(name = "id", column = @Column(name = "prop_classification_detail_id", nullable = false, columnDefinition = "BIGINT"))
public class PropertyClassificationDetail extends LedarAbstractBase implements Serializable {
    
    @Column(name = "no_of_rooms")
    private Long noOfRooms;
    @Column(name = "no_of_units")
    private Long noOfUnits;
    @Column(name = "no_of_rooms_per_unit")
    private Long noOfRoomsPerUnit;
    @Column(name = "no_of_flats")
    private Long noOfFlats;
    @Column(name = "no_of_rooms_per_flat")
    private Long noOfRoomsPerFlat;
    @Column(name = "no_of_floors")
    private Long noOfFloors;
    @Size(max = 6)
    @Column(name = "size_per_floor")
    private String sizePerFloor;
    @Size(max = 200)
    @Column(name = "property_name")
    private String propertyName;
    @Size(max = 100)
    @Column(name = "facilities")
    private String facilities;
    @Column(name = "no_of_pumps")
    private Long noOfPumps;
    @Size(max = 6)
    @Column(name = "forecourt_area")
    private String forecourtArea;
    @Size(max = 200)
    @Column(name = "warehouse_information")
    private String warehouseInformation;
    @Size(max = 200)
    @Column(name = "recreational_information")
    private String recreationalInformation;
    @Column(name = "is_private")
    private Boolean isPrivateBusiness;
    @Column(name = "building_footprint")
    private Double buildingFootprint;
    @Column(name = "is_completed_structure")
    private Boolean isCompletedStructure;
    @Size(max = 35)
    @Column(name = "updater_username")
    private String updaterUsername;

    @JoinColumn(name = "land_property_id", referencedColumnName = "land_property_id")
    @ManyToOne(optional = false)
    private LandProperty landPropertyId;
    @JoinColumn(name = "residential_type_id", referencedColumnName = "residential_type_id")
    @ManyToOne
    private ResidentialType residentialTypeId;
    @JoinColumn(name = "property_classification_id", referencedColumnName = "property_classification_id")
    @ManyToOne(optional = false)
    private PropertyClassification propertyClassificationId;
    @JoinColumn(name = "usage_category_id", referencedColumnName = "usage_category_id")
    @ManyToOne(optional = false)
    private PropertyUsageCategory usageCategory;
}
