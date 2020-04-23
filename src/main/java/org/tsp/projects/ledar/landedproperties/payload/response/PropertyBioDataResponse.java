package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.model.BioDataPersonType;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

import java.util.Date;

@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class PropertyBioDataResponse extends PayloadAbstractBase {

    //TODO I need to associate this object to contact-information
    private String firstName;
    private String lastName;
    private String middleName;
    private String gender;
    private String maritalStatus;
    private String highestEducation;
    private String employmentStatus;
    private String webAddress;
    private String occupation;
    private Date dateOfBirth;
    private String personTitle;
    private String updatedByUsername;
    private BioDataPersonType bioDataPersonId;

}
