package org.tsp.projects.ledar.landedproperties.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Table(name = "landed_property")
@AttributeOverride(name = "id", column = @Column(name = "land_property_id", nullable = false, columnDefinition = "BIGINT"))
public class LandProperty extends LedarAbstractBase implements Serializable {

    @Column(name = "no_of_buildings")
    private Integer noOfBuildings;
    @Size(max = 25)
    @Column(name = "property_valuation_status", columnDefinition = "varchar(25) default 'PENDING VALUATION'")
    private String propertyValuationStatus;
    @Size(max = 18)
    @Column(name = "legacy_property_id")
    private String legacyPropertyId;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "landPropertyId")
    private PropertyValuation propertyValuation;
    @Column(name = "is_block_number")
    private Boolean isBlockNumber;
    @Column(name = "title_document")
    private Boolean titleDocument;
    @Basic(optional = false)
    @Size(min = 1, max = 18)
    @Column(name = "property_id")
    private String propertyId;
    @Column(name = "property_number")
    private String propertyNumber;
    @Column(name = "is_verified")
    private Boolean isVerified;
    @Size(max = 25)
    @Column(name = "road_side")
    private String roadSide;
    @Basic(optional = false)
    @Column(name = "property_longitude")
    private String propertyLongitude;
    @Basic(optional = false)
    @Column(name = "property_latitude")
    private String propertyLatitude;
    @Basic(optional = false)
    @Column(name = "date_captured")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCaptured;
    @Column(name = "verified_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date verifiedDate;
    @Basic(optional = false)
    @Size(min = 1, max = 25)
    @Column(name = "property_types")
    private String propertyTypes;
    @Size(min = 1, max = 25)
    @Column(name = "land_size")
    private String landSize;
    @Size(max = 25)
    @Column(name = "electricity_type")
    private String electricityType;
    @Column(name = "has_electricity")
    private Boolean hasElectricity;
    @Size(max = 1000)
    @Column(name = "description")
    private String description;
    @Size(max = 35)
    @Column(name = "water_supply")
    private String waterSupply;
    @Column(name = "waste_disposal_system")
    private String wasteDisposalSystem;
    @Column(name = "ownership_type")
    private String ownershipType;
    @Column(name = "phcn_id")
    private String phcnId;
    @Column(name = "lswc_id")
    private String lswcId;
    @Column(name = "building_area")
    private Double buildingArea;
    @Column(name = "admin_comment")
    private String adminComment;
    @Column(name = "verified_by_username")
    @Size(max = 35)
    private String verifiedByUsername;
    @Column(name = "updated_by_username")
    @Size(max = 35)
    private String updatedByUsername;
    @JoinColumn(name = "owner_organisation_id", referencedColumnName = "organisation_id")
    @ManyToOne
    private Organisation ownerOrganisationId;
    @JoinColumn(name = "contractor_id", referencedColumnName = "organisation_id")
    @ManyToOne
    private Organisation contractorId;
    @JoinColumn(name = "property_bio_data_id", referencedColumnName = "property_bio_data_id")
    @ManyToOne
    private PropertyBioData propertyBioDataId;
    @JoinColumn(name = "ward_street_id", referencedColumnName = "ward_street_id")
    @ManyToOne
    private WardStreet wardStreetId;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "landPropertyId")
    private List<PropertyClassificationDetail> propertyClassificationDetailsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "landPropertyId")
    private List<PropertyService> propertyServiceTypesList; //TODO I need to convert this to an Enum
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "landPropertyId")
    private List<PropertyComplaint> propertyComplaintsList;
    @JoinColumn(name = "property_quality_id", referencedColumnName = "property_quality_id")
    @ManyToOne
    private PropertyQuality propertyQualities;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "landPropertyId")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Collection<PropertyDocument> propertyDocumentsCollection;
    @Column(name = "document_viewed")
    private Boolean documentViewed;
    @JoinColumn(name = "no_title_document_id", referencedColumnName = "no_title_document_id")
    @ManyToOne
    private NoTitleDocumentType noTitleDocumentId;
    @JoinColumn(name = "title_document_id", referencedColumnName = "title_document_id")
    @ManyToOne
    private TitleDocumentType titleDocumentId;

}
