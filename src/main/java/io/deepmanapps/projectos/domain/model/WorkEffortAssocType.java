package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WorkEffortAssocType {

    private String workEffortAssocTypeId;
    private Boolean hasTable;
    private String description;

    // Self-referencing relationship
    private WorkEffortAssocType parentType;
}
