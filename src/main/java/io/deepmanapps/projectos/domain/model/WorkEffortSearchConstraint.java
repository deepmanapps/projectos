package io.deepmanapps.projectos.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WorkEffortSearchConstraint {
    private String constraintSeqId;
    private String constraintName;
    private String infoString;
    private Boolean includeSubWorkEfforts;
    private Boolean isAnd;
    private Boolean anyPrefix;
    private Boolean anySuffix;
    private Boolean removeStems;
    private String lowValue;
    private String highValue;

    // Relationship
    private WorkEffortSearchResult workEffortSearchResult;
}
