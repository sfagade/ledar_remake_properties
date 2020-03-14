package org.tsp.projects.ledar.landedproperties.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Table(name = "bills_delivery_files")
@AttributeOverride(name = "id", column = @Column(name = "bills_delivery_file_id", nullable = false, columnDefinition = "BIGINT"))
public class BillsDeliveryFile extends LedarAbstractBase implements Serializable {

    @Size(max = 1000)
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "picture_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pictureDate;
    @Column(name = "gps_longitude")
    private String gpsLongitude;
    @Column(name = "gps_latitude")
    private String gpsLatitude;
    @JoinColumn(name = "printed_bill_id", referencedColumnName = "printed_bill_id")
    @ManyToOne(optional = false)
    private PrintedBill printedBillId;
    @JoinColumn(name = "file_upload_id", referencedColumnName = "file_upload_id")
    @ManyToOne(optional = false)
    private FileUpload fileUploadId;

}
