package org.tsp.projects.ledar.landedproperties.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Table(name = "property_complaints")
@AttributeOverride(name = "id", column = @Column(name = "property_complaint_id", nullable = false, columnDefinition = "BIGINT"))
public class PropertyComplaint extends LedarAbstractBase implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "complaint_date")
    @Temporal(TemporalType.DATE)
    private Date complaintDate;
    @Size(max = 25)
    @Column(name = "property_id")
    private String propertyId;
    @Size(min = 1, max = 5)
    @Column(name = "questionnaire")
    private String questionnaire;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "complaint_number")
    private String complaintNumber;
    @Size(max = 150)
    @Column(name = "contact_full_name")
    private String contactFullName;

    @Size(max = 20)
    @Column(name = "contact_phone_number")
    private String contactPhoneNumber;
    @Size(max = 25)
    @Column(name = "contact_designation")
    private String contactDesignation;
    @Size(max = 20)
    @Column(name = "contact_other_number")
    private String contactOtherNumber;
    @Size(max = 45)
    @Column(name = "contact_email_address")
    private String contactEmailAddress;
    @Size(max = 200)
    @Column(name = "complaint_owner_address")
    private String complaintOwnerAddress;
    @Column(name = "owner_first_name")
    private String ownerFirstName;
    @Column(name = "owner_last_name")
    private String ownerLastName;
    @Column(name = "owner_other_name")
    private String ownerOtherName;
    @Column(name = "owner_email")
    private String ownerEmail;
    @Column(name = "owner_phone_number")
    private String ownerPhoneNumber;
    @Column(name = "owner_address")
    private String ownerAddress;
    @Column(name = "owner_dob")
    @Temporal(TemporalType.DATE)
    private Date ownerDob;
    @Column(name = "property_company_name")
    private String propertyCompanyName;
    @Column(name = "person_title")
    @Size(max = 30)
    private String personTitle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propertyComplaintId")
    private List<ComplaintDocument> complaintDocumentsList;
    @JoinColumn(name = "complaint_source_id", referencedColumnName = "complaint_source_id")
    @ManyToOne(optional = false)
    private ComplaintSource complaintSourceId;
    @JoinColumn(name = "land_property_id", referencedColumnName = "land_property_id")
    @ManyToOne
    private LandProperty landPropertyId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propertyComplaintId")
    private List<ComplaintDetail> complaintDetailsList;
    @JoinColumn(name = "lcda_ward_id", referencedColumnName = "lcda_ward_id")
    @ManyToOne(optional = false)
    private LcdaWards lcdaWardId;
    @JoinColumn(name = "local_council_dev_area_id", referencedColumnName = "local_council_dev_area_id")
    @ManyToOne(optional = false)
    private LocalCouncilDevArea localCouncilDevAreaId;
    @JoinColumn(name = "organisation_id", referencedColumnName = "organisation_id")
    @ManyToOne(optional = false)
    private Organisation organisation;
    @JoinColumn(name = "relationship_id", referencedColumnName = "relationship_id")
    @ManyToOne(optional = false)
    private ComplainerRelationship complainerRelationship;
}
