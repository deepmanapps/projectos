package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "work_effort_search_constraint")
@Data
@IdClass(WorkEffortSearchConstraintId.class)
public class WorkEffortSearchConstraintJpaEntity {

    @Id
    @Column(name = "work_effort_search_result_id")
    private String workEffortSearchResultId;

    @Id
    @Column(name = "constraint_seq_id")
    private String constraintSeqId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_effort_search_result_id", insertable = false, updatable = false)
    private WorkEffortSearchResultJpaEntity workEffortSearchResult;

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
