package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class WorkEffortPurposeType {
    private String workEffortPurposeTypeId;
    private String description;
    private WorkEffortPurposeType parentType;
    private List<WorkEffort> workEfforts;
}
