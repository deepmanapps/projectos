package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortKeywordJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortKeywordId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortKeywordJpaRepository extends JpaRepository<WorkEffortKeywordJpaEntity, WorkEffortKeywordId> {
}
