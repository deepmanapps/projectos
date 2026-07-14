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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workEffortId")
    private WorkEffortJpaEntity workEffort;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "surveyId")
    private SurveyJpaEntity survey;

    @Id
    private LocalDateTime fromDate;

    private LocalDateTime thruDate;
}
