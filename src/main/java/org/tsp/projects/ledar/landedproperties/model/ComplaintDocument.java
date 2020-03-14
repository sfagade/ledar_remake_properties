package org.tsp.projects.ledar.landedproperties.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Table(name = "complaint_documents")
@AttributeOverride(name = "id", column = @Column(name = "complaint_document_id", nullable = false, columnDefinition = "BIGINT"))
public class ComplaintDocument extends LedarAbstractBase implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "document_name")
    private String documentName;
    @Size(max = 1000)
    @Column(name = "description")
    private String description;

    @JoinColumn(name = "complaint_file_id", referencedColumnName = "file_upload_id")
    @ManyToOne(optional = false)
    private FileUpload complaintFileId;
    @JoinColumn(name = "property_complaint_id", referencedColumnName = "property_complaint_id")
    @ManyToOne(optional = false)
    private PropertyComplaint propertyComplaintId;
    @JoinColumn(name = "document_type_id", referencedColumnName = "document_type_id")
    @ManyToOne(optional = false)
    private DocumentType documentTypeId;
}
