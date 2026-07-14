package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WorkEffortPurposeType {
    private String workEffortPurposeTypeId;
    private String description;
    private WorkEffortPurposeType parentType;
}
