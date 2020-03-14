package org.tsp.projects.ledar.landedproperties.model;

import lombok.Data;
import org.tsp.projects.ledar.landedproperties.model.listener.RecordUpdateListener;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
@EntityListeners(RecordUpdateListener.class)
public abstract class LedarAbstractBase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT")
    protected Long id;

    @Column(name = "created")
    protected LocalDateTime created;

    @Column(name = "modified")
    protected LocalDateTime modified;
    @Size(max = 35)
    @Column(name = "creator_username", nullable = false)
    private String creatorUsername;
}
