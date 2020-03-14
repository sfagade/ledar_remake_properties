package org.tsp.projects.ledar.landedproperties.model.listener;

import org.tsp.projects.ledar.landedproperties.model.LedarAbstractBase;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

public class RecordUpdateListener {

    @PreUpdate
    public void setUpdateDates(LedarAbstractBase ldrAsb) {
        ldrAsb.setModified(LocalDateTime.now());
    }

    @PrePersist
    public void setCreateDates(LedarAbstractBase ldrAsb) {
        ldrAsb.setModified(LocalDateTime.now());
        ldrAsb.setCreated(LocalDateTime.now());
    }
}
