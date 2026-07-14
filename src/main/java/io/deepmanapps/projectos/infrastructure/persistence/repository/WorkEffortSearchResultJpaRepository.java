package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortSearchResultJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortSearchResultJpaRepository extends JpaRepository<WorkEffortSearchResultJpaEntity, String> {
}
