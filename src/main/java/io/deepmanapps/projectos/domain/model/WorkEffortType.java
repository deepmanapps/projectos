package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class WorkEffortType {
    private String workEffortTypeId;
    private Boolean hasTable;
    private String description;
    private WorkEffortType parentType;
    private List<WorkEffort> workEfforts;
    private List<WorkEffortTypeAttr> attributes;
}
