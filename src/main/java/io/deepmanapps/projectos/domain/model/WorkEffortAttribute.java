package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WorkEffortAttribute {
    private String attrName;
    private String attrValue;
    private String attrDescription;

    // Relationship
    private WorkEffort workEffort;
}
