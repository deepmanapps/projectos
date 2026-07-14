package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "work_effort_event_reminder")
@Data
@IdClass(WorkEffortEventReminderId.class)
public class WorkEffortEventReminderJpaEntity {

    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "sequence_id")
    private String sequenceId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_effort_id", insertable = false, updatable = false)
    private WorkEffortJpaEntity workEffort;

    private LocalDateTime reminderDateTime;
    private Long repeatCount;
    private Long repeatInterval;
    private Long currentCount;
    private Long reminderOffset;
    private String localeId;
    private String timeZoneId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contactMechId")
    private ContactMechJpaEntity contactMech;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "partyId")
    private PartyJpaEntity party;
}
