package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "work_effort_trans_box")
@Data
@IdClass(WorkEffortTransBoxId.class)
public class WorkEffortTransBoxJpaEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "processWorkEffortId")
    private WorkEffortJpaEntity processWorkEffort;

    @Id
    private String toActivityId;

    @Id
    private String transitionId;
}
