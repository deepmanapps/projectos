package io.deepmanapps.projectos.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "work_effort_survey_appl")
@Data
@IdClass(WorkEffortSurveyApplId.class)
public class WorkEffortSurveyApplJpaEntity {

    @Id
    @Column(name = "work_effort_id")
    private String workEffortId;

    @Id
    @Column(name = "survey_id")
    private String surveyId;

    @Id
    @Column(name = "from_date")
    private LocalDateTime fromDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_effort_id", insertable = false, updatable = false)
    private WorkEffortJpaEntity workEffort;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "survey_id", insertable = false, updatable = false)
    private SurveyJpaEntity survey;

    private LocalDateTime thruDate;
}
