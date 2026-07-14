package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TimesheetRole {
    private String partyId;
    private String roleTypeId;

    // Relationship
    private Timesheet timesheet;
}
