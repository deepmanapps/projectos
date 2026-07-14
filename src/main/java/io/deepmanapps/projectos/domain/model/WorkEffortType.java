package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WorkEffortType {
    private String workEffortTypeId;
    private Boolean hasTable;
    private String description;
    private WorkEffortType parentType;
}
