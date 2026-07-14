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
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "skill_type_id")
    private String skillTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_effort_id", insertable = false, updatable = false)
    private WorkEffortJpaEntity workEffort;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "skill_type_id", insertable = false, updatable = false)
    private SkillTypeJpaEntity skillType;

    private Double estimatedNumPeople;
    private Double estimatedDuration;
    private BigDecimal estimatedCost;
}
