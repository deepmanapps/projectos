package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class WorkEffortContent {
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;

    // Relationships
    private WorkEffort workEffort;
    private Content content;
    private WorkEffortContentType workEffortContentType;
}
