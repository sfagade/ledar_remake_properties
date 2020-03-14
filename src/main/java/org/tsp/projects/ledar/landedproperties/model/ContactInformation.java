package org.tsp.projects.ledar.landedproperties.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Table(name = "contact_information")
@AttributeOverride(name = "id", column = @Column(name = "contact_information_id", nullable = false, columnDefinition = "BIGINT"))
public class ContactInformation extends LedarAbstractBase implements Serializable {

    @Size(max = 20)
    @Column(name = "primary_phone_number")
    private String primaryPhoneNumber;
    @Size(max = 20)
    @Column(name = "backup_phone_number")
    private String backupPhoneNumber;
    @Size(max = 45)
    @Column(name = "primary_email_address")
    private String primaryEmailAddress;
    @Size(max = 45)
    @Column(name = "personal_email_address")
    private String personalEmailAddress;
    @Size(max = 60)
    @Column(name = "web_address")
    private String webAddress;
    @JoinColumn(name = "owner_address_id", referencedColumnName = "owner_address_id")
    @ManyToOne
    private OwnerAddress addressId;
    @JoinColumn(name = "person_id", referencedColumnName = "person_id")
    @ManyToOne(optional = false)
    private Person personId;
}
