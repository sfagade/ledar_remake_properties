package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class ContactInformationResponse extends PayloadAbstractBase {

    private String primaryPhoneNumber;
    private String backupPhoneNumber;
    private String primaryEmailAddress;
    private String personalEmailAddress;
    private String webAddress;
    private OwnerAddressResponse ownerAddressResponse;
    private PersonResponse personId;
}
