package org.tsp.projects.ledar.landedproperties.payload.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.tsp.projects.ledar.landedproperties.model.DocumentType;
import org.tsp.projects.ledar.landedproperties.model.FileUpload;
import org.tsp.projects.ledar.landedproperties.model.LandProperty;
import org.tsp.projects.ledar.landedproperties.payload.PayloadAbstractBase;

@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
public class PropertyDocumentResponse extends PayloadAbstractBase {

    private String documentName;
    private String remarks;
    private DocumentType documentTypeId;
    private FileUpload fileUploadId;
    private String pushStatus;

    private LandProperty landPropertyId;
}
