package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortSurveyApplJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortSurveyApplId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortSurveyApplJpaRepository extends JpaRepository<WorkEffortSurveyApplJpaEntity, WorkEffortSurveyApplId> {
}
