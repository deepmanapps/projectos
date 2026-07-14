package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class WorkEffortGoodStandard {
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private Double estimatedQuantity;
    private BigDecimal estimatedCost;

    // Relationships
    private WorkEffort workEffort;
    private Product product;
    private WorkEffortGoodStandardType workEffortGoodStdType;
    private StatusItem status;
}
