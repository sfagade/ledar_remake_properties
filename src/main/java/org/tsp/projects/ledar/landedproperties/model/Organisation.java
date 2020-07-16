package org.tsp.projects.ledar.landedproperties.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Table(name = "organisations")
@AttributeOverride(name = "id", column = @Column(name = "organisation_id", nullable = false, columnDefinition = "BIGINT"))
public class Organisation extends LedarAbstractBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @Size(max = 200)
    @Column(name = "organisation_name")
    @Basic(optional = false)
    @NotNull
    private String organisationName;

    @Size(min = 1, max = 20)
    @Column(name = "organisation_number")
    private String organisationNumber;

    @Size(min = 1, max = 12)
    @Column(name = "organisation_code")
    private String organisationCode;
    @Column(name = "enabled")
    private Boolean enabled;
    @Column(name = "owner_person_id")
    private Long ownerPersonId;
    @Size(max = 45)
    @Column(name = "email_address")
    private String emailAddress;
    @Size(max = 45)
    @Column(name = "web_url")
    private String webUrl;
    @NotNull
    @Column(name = "organisation_sector")
    private String organisationSector;

    @JoinColumn(name = "owner_address_id", referencedColumnName = "owner_address_id")
    @ManyToOne
    private OwnerAddress addressId;
    @JoinColumn(name = "organization_logo_id", referencedColumnName = "file_upload_id")
    @ManyToOne
    private FileUpload organizationLogoId;
    @JoinColumn(name = "senatorial_district_id", referencedColumnName = "senatorial_district_id")
    @ManyToOne
    private SenatorialDistrict senatorialDistrictId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ownerOrganisationId")
    private List<LandProperty> landPropertyId;

}
