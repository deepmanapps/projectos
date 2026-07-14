package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class WorkEffortSkillStandard {
    private Double estimatedNumPeople;
    private Double estimatedDuration;
    private BigDecimal estimatedCost;

    // Relationships
    private WorkEffort workEffort;
    private SkillType skillType;
}
