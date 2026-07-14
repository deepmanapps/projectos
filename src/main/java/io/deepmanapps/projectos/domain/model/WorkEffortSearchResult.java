package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class WorkEffortSearchResult {
    private String workEffortSearchResultId;
    private String visitId;
    private String orderByName;
    private Boolean isAscending;
    private Long numResults;
    private Double secondsTotal;
    private LocalDateTime searchDate;

    // Relationship
    private List<WorkEffortSearchConstraint> constraints;
}
