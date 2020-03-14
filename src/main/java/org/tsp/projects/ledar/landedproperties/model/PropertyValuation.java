package org.tsp.projects.ledar.landedproperties.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author samsonfagade
 */
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Table(name = "property_valuations")
@AttributeOverride(name = "id", column = @Column(name = "property_valuation_id", nullable = false, columnDefinition = "BIGINT"))
class PropertyValuation extends LedarAbstractBase implements Serializable  {
    
    @Basic(optional = false)
    //@NotNull
    @Column(name = "accessed_value")
    private BigDecimal accessedValue;
    @Column(name = "valuation_date")
    @Temporal(TemporalType.DATE)
    private Date valuationDate;
    @Size(max = 35)
    @Column(name = "accessed_by_username")
    private String accessbyUsername;
    @Basic(optional = false)
    
    @Column(name = "luc_charge")
    private BigDecimal lucCharge;
    @Basic(optional = false)
    @Column(name = "land_value")
    private BigDecimal landValue;
    @Basic(optional = false)
    @Column(name = "building_value")
    private BigDecimal buildingValue;
    @Column(name = "valuation_remarks")
    private String valuationRemarks;
    
    @JoinColumn(name = "land_property_id", referencedColumnName = "land_property_id")
    @ManyToOne(optional = false)
    private LandProperty landPropertyId;
}
