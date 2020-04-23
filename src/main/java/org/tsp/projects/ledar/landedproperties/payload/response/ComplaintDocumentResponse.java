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
public class ComplaintDocumentResponse extends PayloadAbstractBase {

    private String documentName;
    private String description;

    private FileUploadResponse complaintFile;
    private PropertyComplaintResponse propertyComplaint;
    private DocumentTypeResponse documentTypeId;
}
