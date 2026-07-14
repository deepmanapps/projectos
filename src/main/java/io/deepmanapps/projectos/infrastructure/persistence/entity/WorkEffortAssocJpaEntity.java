package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "work_effort_assoc")
@Data
@IdClass(WorkEffortAssocId.class)
public class WorkEffortAssocJpaEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortIdFrom")
    private WorkEffortJpaEntity workEffortFrom;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortIdTo")
    private WorkEffortJpaEntity workEffortTo;

    @Id
    private String workEffortAssocTypeId;

    @Id
    private LocalDateTime fromDate;

    private Integer sequenceNum;
    private LocalDateTime thruDate;
}
