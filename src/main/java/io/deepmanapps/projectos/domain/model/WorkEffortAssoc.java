package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class WorkEffortAssoc {

    private String workEffortAssocTypeId;
    private Integer sequenceNum;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;

    // Relationships
    private WorkEffort workEffortFrom;
    private WorkEffort workEffortTo;
    private List<WorkEffortAssocAttribute> attributes;
}
