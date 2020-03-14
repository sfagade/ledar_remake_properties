package org.tsp.projects.ledar.landedproperties.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
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
@Table(name = "ref_title_document_types")
@AttributeOverride(name = "id", column = @Column(name = "title_document_id", nullable = false, columnDefinition = "BIGINT"))
public class TitleDocumentType extends LedarAbstractBase implements Serializable {
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "title_name")
    private String titleName;
    @Size(max = 1000)
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "titleDocumentId")
    private List<LandProperty> landPropertyList;
}
