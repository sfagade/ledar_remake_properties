package org.tsp.projects.ledar.landedproperties.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;

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
@Table(name = "people")
@AttributeOverride(name = "id", column = @Column(name = "person_id", nullable = false, columnDefinition = "BIGINT"))
public class Person extends LedarAbstractBase implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 40)
    @Column(name = "middle_name")
    private String middleName;
    @NotNull
    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Size(max = 45)
    @Column(name = "maiden_name")
    private String maidenName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 5, max = 7)
    @Column(name = "gender")
    private String gender;
    @NotNull
    @Size(max = 20)
    @Column(name = "marital_status")
    private String maritalStatus;
    @Size(max = 45)
    @NotNull
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "update_required")
    private Boolean updateRequired;
    @Size(max = 35)
    @NotNull
    @Column(name = "state_of_origin")
    private String stateOfOrigin;
    @Size(max = 35)
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "person_title")
    private String personTitle;
    @Column(name = "religion")
    private String religion;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "personId")
    private List<ContactInformation> contactInformationList;
    @JoinColumn(name = "owner_address_id", referencedColumnName = "owner_address_id")
    @ManyToOne(optional = false)
    private OwnerAddress addressId;
    @JoinColumn(name = "picture_upload_id", referencedColumnName = "file_upload_id")
    @ManyToOne
    private FileUpload pictureUploadId;
    @JoinColumn(name = "organisation_id", referencedColumnName = "organisation_id")
    @ManyToOne
    private Organisation organisation;

    @Formula("Concat_ws(' ',first_name, last_name)")
    private String fullName;
}
