package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Represents a timesheet which is a collection of time entries.
 * This is a pure domain model with no infrastructure dependencies.
 */
@Data
@Builder
public class Timesheet {

    private String timesheetId;
    private String partyId;
    private String clientPartyId;
    private String statusId;
    private String approvedByUserLoginId;
    private String comments;

    private LocalDateTime fromDate;
    private LocalDateTime thruDate;

    // Relationships
    private List<TimeEntry> timeEntries;
    private List<TimesheetRole> roles;
}
