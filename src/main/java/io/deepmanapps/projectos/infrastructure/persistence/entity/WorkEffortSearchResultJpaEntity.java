package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "work_effort_search_result")
@Data
public class WorkEffortSearchResultJpaEntity {

    @Id
    private String workEffortSearchResultId;

    private String visitId;
    private String orderByName;
    private Boolean isAscending;
    private Long numResults;
    private Double secondsTotal;
    private LocalDateTime searchDate;

    @OneToMany(mappedBy = "workEffortSearchResult", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEffortSearchConstraintJpaEntity> constraints;
}
