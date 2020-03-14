package org.tsp.projects.ledar.landedproperties.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name = "property_bio_data")
@AttributeOverride(name = "id", column = @Column(name = "property_bio_data_id", nullable = false, columnDefinition = "BIGINT"))
public class PropertyBioData extends LedarAbstractBase implements Serializable {
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "first_name")
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "last_name")
    private String lastName;
    @Size(max = 45)
    @Column(name = "middle_name")
    private String middleName;
    @Size(max = 45)
    @Column(name = "gender")
    private String gender;
    @Size(max = 45)
    @Column(name = "marital_status")
    private String maritalStatus;
    @Size(max = 45)
    @Column(name = "highest_education")
    private String highestEducation;
    @Size(max = 15)
    @Column(name = "home_phone_number")
    private String homePhoneNumber;
    @Size(max = 150)
    @Column(name = "email_address")
    private String emailAddress;
    @Size(max = 15)
    @Column(name = "mobile_phone_number")
    private String mobilePhoneNumber;
    @Size(max = 25)
    @Column(name = "employment_status")
    private String employmentStatus;
    @Column(name = "web_address")
    private String webAddress;
    @Column(name = "occupation")
    private String occupation;
    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Size(max = 20)
    @Column(name = "person_title")
    private String personTitle;
    @Size(max = 15)
    @Column(name = "updated_by_username")
    private String updatedByUsername;
    @JoinColumn(name = "bio_data_person_id", referencedColumnName = "bio_data_person_id")
    @ManyToOne(optional = false)
    private BioDataPersonType bioDataPersonId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propertyBioDataId")
    private List<LandProperty> landPropertyList;
}
