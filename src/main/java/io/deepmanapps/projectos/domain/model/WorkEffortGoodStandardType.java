package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WorkEffortGoodStandardType {
    private String workEffortGoodStdTypeId;
    private Boolean hasTable;
    private String description;
    private WorkEffortGoodStandardType parentType;
}
