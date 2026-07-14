package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class WorkEffortPartyAssignment {
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private LocalDateTime statusDateTime;
    private String comments;
    private Boolean mustRsvp;

    // Relationships
    private WorkEffort workEffort;
    private Party party;
    private RoleType roleType;
    private UserLogin assignedByUserLogin;
    private StatusItem status;
    private Enumeration expectationEnum;
    private Enumeration delegateReasonEnum;
    private Facility facility;
    private StatusItem availabilityStatus;
}
