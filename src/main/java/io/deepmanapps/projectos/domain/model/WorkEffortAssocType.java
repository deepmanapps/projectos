package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class WorkEffortAssocType {

    private String workEffortAssocTypeId;
    private Boolean hasTable;
    private String description;
    private WorkEffortAssocType parentType;
    private List<WorkEffortAssoc> associations;
    private List<WorkEffortAssocTypeAttr> attributes;
}
