package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WorkEffortKeyword {
    private String keyword;
    private Long relevancyWeight;
    private WorkEffort workEffort;
}
