package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "work_effort_trans_box")
@Data
@IdClass(WorkEffortTransBoxId.class)
public class WorkEffortTransBoxJpaEntity {

    @Id
    @Column(name = "process_work_effort_id")
    private String processWorkEffortId;

    @Id
    @Column(name = "to_activity_id")
    private String toActivityId;

    @Id
    @Column(name = "transition_id")
    private String transitionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "process_work_effort_id", referencedColumnName = "workEffortId", insertable = false, updatable = false)
    private WorkEffortJpaEntity processWorkEffort;
}
