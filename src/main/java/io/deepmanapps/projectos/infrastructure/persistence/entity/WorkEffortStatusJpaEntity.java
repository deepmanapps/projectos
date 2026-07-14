package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "work_effort_status")
@Data
@IdClass(WorkEffortStatusId.class)
public class WorkEffortStatusJpaEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortId")
    private WorkEffortJpaEntity workEffort;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statusId")
    private StatusItemJpaEntity status;

    @Id
    private LocalDateTime statusDatetime;

    @Lob
    private String reason;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "setByUserLogin")
    private UserLoginJpaEntity setByUserLogin;
}
