package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Represents a time entry for a work effort.
 * This is a pure domain model with no infrastructure dependencies.
 */
@Data
@Builder
public class TimeEntry {

    private String timeEntryId;
    private String partyId;
    private String rateTypeId;
    private String invoiceId;
    private String invoiceItemSeqId;
    private String comments;

    private LocalDateTime fromDate;
    private LocalDateTime thruDate;

    private Double hours;

    // Relationships
    private WorkEffort workEffort;
    private Timesheet timesheet;
}
