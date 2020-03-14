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
@Table(name = "owner_addresses")
@AttributeOverride(name = "id", column = @Column(name = "owner_address_id", nullable = false, columnDefinition = "BIGINT"))
public class OwnerAddress extends LedarAbstractBase implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "address")
    private String address;
    @Size(max = 70)
    @Column(name = "address2")
    private String address2;
    @Size(max = 100)
    @Column(name = "directions")
    private String directions;
    @Size(max = 100)
    @Column(name = "city")
    private String city;
    @Size(max = 8)
    @Column(name = "area_code")
    private String areaCode;
    @Size(max = 35)
    @NotNull
    @Column(name = "address_state")
    private String addressState;
    @Size(max = 35)
    @NotNull
    @Column(name = "address_country")
    private String addressCountry;

    @OneToMany(mappedBy = "addressId")
    private List<ContactInformation> contactInformationList;
    @OneToMany(mappedBy = "addressId")
    private List<Person> personList;
    @OneToMany(mappedBy = "addressId")
    private List<Organisation> organisationsList;

}
