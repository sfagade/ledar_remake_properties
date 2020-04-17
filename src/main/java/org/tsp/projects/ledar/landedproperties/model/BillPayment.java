package org.tsp.projects.ledar.landedproperties.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Table(name = "bill_payments")
@AttributeOverride(name = "id", column = @Column(name = "payment_id", nullable = false, columnDefinition = "BIGINT"))
public class BillPayment extends LedarAbstractBase implements Serializable {

    @Size(max = 300)
    @Column(name = "v_payer_name")
    private String vPayerName;
    @Size(max = 300)
    @Column(name = "v_payer_id")
    private String vPayerId;
    @Size(max = 300)
    @Column(name = "entry_id")
    private String entryId;
    @Size(max = 300)
    @Column(name = "applied_date")
    private String appliedDate;
    @Column(name = "entry_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    @Column(name = "value_date")
    @Temporal(TemporalType.DATE)
    private Date valueDate;
    @Column(name = "credit_amount")
    private BigDecimal creditAmount;
    @Size(max = 300)
    @Column(name = "receipt_bir")
    private String receiptBir;
    @Size(max = 300)
    @Column(name = "debit_slip_ref")
    private String debitSlipRef;
    @Size(max = 300)
    @Column(name = "agency_reference")
    private String agencyReference;
    @Size(max = 300)
    @Column(name = "rev_code")
    private String revCode;
    @Size(max = 300)
    @Column(name = "transaction_reference")
    private String transactionReference;
    @Column(name = "system_date")
    @Temporal(TemporalType.DATE)
    private Date systemDate;
    @Size(max = 300)
    @Column(name = "assess_reference")
    private String assessReference;
    @Size(max = 300)
    @Column(name = "reference_number")
    private String referenceNumber;
    @Size(max = 300)
    @Column(name = "short_name")
    private String shortName;
    @Size(max = 300)
    @Column(name = "merchant_name")
    private String merchantName;
    @Size(max = 300)
    @Column(name = "lga_name")
    private String lgaName;
    @Size(max = 300)
    @Column(name = "district_name")
    private String districtName;
    @Size(max = 300)
    @Column(name = "address_to_use")
    private String addressToUse;
    @Size(max = 300)
    @Column(name = "payer_address")
    private String payerAddress;
    @Size(max = 300)
    @Column(name = "payer_phone_no")
    private String payerPhoneNo;
    @Size(max = 300)
    @Column(name = "lrc_pin")
    private String lrcPin;
    @Size(max = 300)
    @Column(name = "ppt_address")
    private String pptAddress;
    @Column(name = "lga_location")
    private String lgaLocation;
    @Column(name = "is_processed", columnDefinition = "boolean default false")
    private Boolean isProcessed;
    @Column(name = "is_duplicate", columnDefinition = "boolean default false")
    private Boolean isDuplicate;
    @Column(name = "payment_status")
    private String paymentStatus;
    @JoinColumn(name = "upload_payment_file_id", referencedColumnName = "file_upload_id")
    @ManyToOne(optional = false)
    private FileUpload uploadPaymentFileId;
    @JoinColumn(name = "printed_bill_id", referencedColumnName = "printed_bill_id")
    @ManyToOne
    private PrintedBill printedBillId;
    @JoinColumn(name = "consultant_id", referencedColumnName = "organisation_id")
    @ManyToOne
    private Organisation consultantId;
}
