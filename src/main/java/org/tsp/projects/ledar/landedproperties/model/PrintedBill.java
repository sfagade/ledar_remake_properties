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
import java.util.List;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Table(name = "printed_bills")
@AttributeOverride(name = "id", column = @Column(name = "printed_bill_id", nullable = false, columnDefinition = "BIGINT"))
public class PrintedBill extends LedarAbstractBase implements Serializable {

    @Size(max = 300)
    @Column(name = "property_idn")
    private String propertyIdn;
    @Size(max = 300)
    @Column(name = "old_property_idn")
    private String oldPropertyIdn;
    @Size(max = 300)
    @Column(name = "e_payment_code")
    private String ePaymentCode;
    @Size(max = 300)
    @Column(name = "bank_payment_code")
    private String bankPaymentCode;
    @Size(max = 300)
    @Column(name = "parcel_idn")
    private String parcelIdn;
    @Size(max = 300)
    @Column(name = "parcel_sheet_number")
    private String parcelSheetNumber;
    @Size(max = 300)
    @Column(name = "house_no")
    private String houseNo;
    @Size(max = 300)
    @Column(name = "plot_no")
    private String plotNo;
    @Size(max = 300)
    @Column(name = "block_no")
    private String blockNo;
    @Size(max = 300)
    @Column(name = "flat_no")
    private String flatNo;
    @Size(max = 300)
    @Column(name = "street_name")
    private String streetName;
    @Size(max = 300)
    @Column(name = "district_name")
    private String districtName;
    @Size(max = 300)
    @Column(name = "lga")
    private String lga;
    @Size(max = 300)
    @Column(name = "owner_house_no")
    private String ownerHouseNo;
    @Size(max = 300)
    @Column(name = "owner_plot_no")
    private String ownerPlotNo;
    @Size(max = 300)
    @Column(name = "owner_block_no")
    private String ownerBlockNo;
    @Size(max = 300)
    @Column(name = "owner_flat_no")
    private String ownerFlatNo;
    @Size(max = 300)
    @Column(name = "owner_street_name")
    private String ownerStreetName;
    @Size(max = 300)
    @Column(name = "owner_district_name")
    private String ownerDistrictName;
    @Size(max = 300)
    @Column(name = "owner_address")
    private String ownerAddress;
    @Size(max = 300)
    @Column(name = "tax_category")
    private String taxCategory;
    @Size(max = 300)
    @Column(name = "usage_description")
    private String usageDescription;
    @Size(max = 300)
    @Column(name = "owner_name")
    private String ownerName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "mill_rate")
    private BigDecimal millRate;
    @Column(name = "assessed_value")
    private BigDecimal assessedValue;
    @Column(name = "balance_cf")
    private BigDecimal balanceCf;
    @Column(name = "luc")
    private BigDecimal luc;
    @Column(name = "amount_due")
    private BigDecimal amountDue;
    @Size(max = 45)
    @Column(name = "billing_year")
    private String billingYear;
    @Column(name = "trigger_date")
    @Temporal(TemporalType.DATE)
    private Date triggerDate;
    @Column(name = "disc_amount")
    private BigDecimal discAmount;
    @Column(name = "disc_date")
    @Temporal(TemporalType.DATE)
    private Date discDate;
    @Column(name = "full_pay_date")
    @Temporal(TemporalType.DATE)
    private Date fullPayDate;
    @Column(name = "start_late_pay_date1")
    @Temporal(TemporalType.DATE)
    private Date startLatePayDate1;
    @Column(name = "end_late_pay_date1")
    @Temporal(TemporalType.DATE)
    private Date endLatePayDate1;
    @Column(name = "amount_late_pay1")
    private BigDecimal amountLatePay1;
    @Column(name = "start_late_pay_date2")
    @Temporal(TemporalType.DATE)
    private Date startLatePayDate2;
    @Column(name = "end_latePayDate2")
    @Temporal(TemporalType.DATE)
    private Date endLatePayDate2;
    @Column(name = "amount_late_pay2")
    private BigDecimal amountLatePay2;
    @Column(name = "start_latePayDate3")
    @Temporal(TemporalType.DATE)
    private Date startLatePayDate3;
    @Column(name = "end_late_pay_date3")
    @Temporal(TemporalType.DATE)
    private Date endLatePayDate3;
    @Column(name = "amount_late_pay3")
    private BigDecimal amountLatePay3;
    @Size(max = 300)
    @Column(name = "payer_id")
    private String payerId;
    @Size(max = 300)
    @Column(name = "name_on_bill")
    private String nameOnBill;
    @Size(max = 300)
    @Column(name = "barcode")
    private String barcode;
    @Column(name = "payment_status")
    private String paymentStatus;
    @Column(name = "current_picture_name")
    private String currentPictureName;
    @Column(name = "reconciliation_status")
    private String reconciliationStatus;
    @JoinColumn(name = "consultant_id", referencedColumnName = "organisation_id")
    @ManyToOne
    private Organisation consultantId;
    @Column(name = "delivery_date")
    @Temporal(TemporalType.DATE)
    private Date deliveryDate;
    @Column(name = "is_delivered")
    private Boolean isDelivered;
    @Column(name = "is_update_required")
    private Boolean isUpdateRequired;
    @Column(name = "total_amount_paid")
    private BigDecimal totalAmountPaid;
    @Column(name = "next_yr_brought_forward")
    private BigDecimal nextYrBroughtForward;
    @Column(name = "delivery_comments")
    private String deliveryComments;
    @Column(name = "has_match_payment", columnDefinition = "tinyint(1) default 0")
    private Boolean hasMatchPayment;
    @Column(name = "is_deleted", columnDefinition = "tinyint(1) default 0")
    private Boolean isDeleted;
    @Column(name = "print_count")
    private int printCount;
    @Column(name = "longitude")
    private String longitude;
    @Column(name = "latitude")
    private String latitude;
    @Column(name = "update_status")
    private String updateStatus;
    @Size(max = 35)
    @Column(name = "delivery_username", nullable = false)
    private String deliveryUsername;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "printedBillId")
    private List<BillPayment> billPaymentsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "printedBillId")
    private List<BillsDeliveryFile> billsDeliveryFilesList;
}
