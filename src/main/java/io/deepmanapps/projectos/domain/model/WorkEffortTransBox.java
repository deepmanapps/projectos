package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WorkEffortTransBox {
    private String toActivityId;
    private String transitionId;

    // Relationship
    private WorkEffort processWorkEffort;
}
