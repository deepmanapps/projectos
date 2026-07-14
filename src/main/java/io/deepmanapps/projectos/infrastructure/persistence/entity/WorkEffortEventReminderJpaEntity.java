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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortId")
    private WorkEffortJpaEntity workEffort;

    @Id
    private String sequenceId;

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
