package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "work_effort_cost_calc")
@Data
@IdClass(WorkEffortCostCalcId.class)
public class WorkEffortCostCalcJpaEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortId")
    private WorkEffortJpaEntity workEffort;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "costComponentTypeId")
    private CostComponentTypeJpaEntity costComponentType;

    @Id
    private LocalDateTime fromDate;

    private LocalDateTime thruDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "costComponentCalcId")
    private CostComponentCalcJpaEntity costComponentCalc;
}
