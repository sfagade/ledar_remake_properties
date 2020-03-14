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
@Table(name = "property_documents")
@AttributeOverride(name = "id", column = @Column(name = "property_document_id", nullable = false, columnDefinition = "BIGINT"))
public class PropertyDocument extends LedarAbstractBase implements Serializable {

    @Size(max = 100)
    @Column(name = "document_name")
    private String documentName;
    @Size(max = 500)
    @Column(name = "remarks")
    private String remarks;
    @JoinColumn(name = "document_type_id", referencedColumnName = "document_type_id")
    @ManyToOne(optional = false)
    private DocumentType documentTypeId;
    @JoinColumn(name = "file_upload_id", referencedColumnName = "file_upload_id")
    @ManyToOne(optional = false)
    private FileUpload fileUploadId;
    @Column(name = "push_status")
    private String pushStatus;

    @JoinColumn(name = "land_property_id", referencedColumnName = "land_property_id")
    @ManyToOne(optional = false)
    private LandProperty landPropertyId;
}
