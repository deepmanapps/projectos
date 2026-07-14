package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class WorkEffortEventReminder {
    private String sequenceId;
    private LocalDateTime reminderDateTime;
    private Long repeatCount;
    private Long repeatInterval;
    private Long currentCount;
    private Long reminderOffset;
    private String localeId;
    private String timeZoneId;

    // Relationships
    private WorkEffort workEffort;
    private ContactMech contactMech;
    private Party party;
}
