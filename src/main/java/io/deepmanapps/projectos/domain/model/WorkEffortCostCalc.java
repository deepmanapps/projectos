package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class WorkEffortCostCalc {
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;

    // Relationships
    private WorkEffort workEffort;
    private CostComponentType costComponentType;
    private CostComponentCalc costComponentCalc;
}
