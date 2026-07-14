package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "work_effort_keyword")
@Data
@IdClass(WorkEffortKeywordId.class)
public class WorkEffortKeywordJpaEntity {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortId")
    private WorkEffortJpaEntity workEffort;

    @Id
    private String keyword;

    private Long relevancyWeight;
}
