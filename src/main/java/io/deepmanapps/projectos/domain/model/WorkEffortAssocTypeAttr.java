package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WorkEffortAssocTypeAttr {
    private String attrName;
    private String description;

    // Relationship
    private WorkEffortAssocType workEffortAssocType;
}
