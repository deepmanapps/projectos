package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class WorkEffortStatus {
    private LocalDateTime statusDatetime;
    private String reason;

    // Relationships
    private WorkEffort workEffort;
    private StatusItem status;
    private UserLogin setByUserLogin;
}
