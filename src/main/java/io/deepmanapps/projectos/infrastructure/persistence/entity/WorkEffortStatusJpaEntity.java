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
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "status_id")
    private String statusId;

    @Id
    @Column(name = "status_datetime")
    private LocalDateTime statusDatetime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_effort_id", insertable = false, updatable = false)
    private WorkEffortJpaEntity workEffort;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id", insertable = false, updatable = false)
    private StatusItemJpaEntity status;

    @Lob
    private String reason;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "setByUserLogin")
    private UserLoginJpaEntity setByUserLogin;
}
