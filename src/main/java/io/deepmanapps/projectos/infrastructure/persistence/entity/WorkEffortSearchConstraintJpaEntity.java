package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "work_effort_search_constraint")
@Data
@IdClass(WorkEffortSearchConstraintId.class)
public class WorkEffortSearchConstraintJpaEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortSearchResultId")
    private WorkEffortSearchResultJpaEntity workEffortSearchResult;

    @Id
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
}
