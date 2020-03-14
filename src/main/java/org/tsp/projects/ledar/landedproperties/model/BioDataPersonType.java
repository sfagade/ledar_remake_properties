package org.tsp.projects.ledar.landedproperties.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 *
 * @author samsonfagade
 */
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Table(name = "ref_bio_data_person_types")
@AttributeOverride(name = "id", column = @Column(name = "bio_data_person_id", nullable = false, columnDefinition = "BIGINT"))
public class BioDataPersonType extends LedarAbstractBase implements Serializable  {
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "bio_data_type_name")
    private String bioDataTypeName;
    @Size(max = 500)
    @Column(name = "description")
    private String description;
}
