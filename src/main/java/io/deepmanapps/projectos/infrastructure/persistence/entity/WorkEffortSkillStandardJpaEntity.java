package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "work_effort_skill_standard")
@Data
@IdClass(WorkEffortSkillStandardId.class)
public class WorkEffortSkillStandardJpaEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortId")
    private WorkEffortJpaEntity workEffort;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "skillTypeId")
    private SkillTypeJpaEntity skillType;

    private Double estimatedNumPeople;
    private Double estimatedDuration;
    private BigDecimal estimatedCost;
}
