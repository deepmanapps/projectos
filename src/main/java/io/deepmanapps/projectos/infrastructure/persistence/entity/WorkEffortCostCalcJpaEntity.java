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
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "cost_component_type_id")
    private String costComponentTypeId;

    @Id
    @Column(name = "from_date")
    private LocalDateTime fromDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_effort_id", insertable = false, updatable = false)
    private WorkEffortJpaEntity workEffort;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cost_component_type_id", insertable = false, updatable = false)
    private CostComponentTypeJpaEntity costComponentType;

    private LocalDateTime thruDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "costComponentCalcId")
    private CostComponentCalcJpaEntity costComponentCalc;
}
