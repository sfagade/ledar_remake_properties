package org.tsp.projects.ledar.landedproperties.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
@Table(name = "file_upload")
@AttributeOverride(name = "id", column = @Column(name = "file_upload_id", nullable = false, columnDefinition = "BIGINT"))
public class FileUpload extends LedarAbstractBase implements Serializable {

    @Lob
    @Column(name = "file_content")
    private byte[] fileContent;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "file_name")
    private String fileName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "file_type")
    private String fileType;
    @Column(name = "is_deleted", columnDefinition = "tinyint(1) default 0")
    private Boolean isDeleted;
    @Column(name = "delete_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date deleteDate;
    @Size(min = 1, max = 20)
    @Column(name = "file_side")
    private String fileSide;
    @Column(name = "absolute_path")
    private String absolutePath;
    @Size(max = 15)
    @Column(name = "destroyer_username")
    private String destroyerUsername;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileUploadId")
    private List<PropertyDocument> propertyDocumentsList;
    @Size(min = 3, max = 250)
    @Column(name = "file_path")
    private String filePath;

    @OneToMany(mappedBy = "organizationLogoId")
    private List<Organisation> organisationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "uploadPaymentFileId")
    private List<BillPayment> billPaymentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileUploadId")
    private List<BillsDeliveryFile> billsDeliveryFileList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "complaintFileId")
    private List<ComplaintDocument> complaintDocumentsList;
}
