package org.tsp.projects.ledar.landedproperties.payload;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public abstract class PayloadAbstractBase {

    protected Long id, createdById;
    protected LocalDateTime created, modified;
}
