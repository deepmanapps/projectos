package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WorkEffortContentType {
    private String workEffortContentTypeId;
    private String description;
    private WorkEffortContentType parentType;
}
