package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortReviewJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortReviewId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortReviewJpaRepository extends JpaRepository<WorkEffortReviewJpaEntity, WorkEffortReviewId> {
}
