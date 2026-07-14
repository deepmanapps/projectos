package io.deepmanapps.projectos.infrastructure.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkEffortPartyAssignmentId implements Serializable {
    private String workEffortId;
    private String partyId;
    private String roleTypeId;
    private LocalDateTime fromDate;
}
