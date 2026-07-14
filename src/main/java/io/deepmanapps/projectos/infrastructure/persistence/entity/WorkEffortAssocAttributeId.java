package io.deepmanapps.projectos.infrastructure.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkEffortAssocAttributeId implements Serializable {
    private String workEffortIdFrom;
    private String workEffortIdTo;
    private String workEffortAssocTypeId;
    private LocalDateTime fromDate;
    private String attrName;
}
