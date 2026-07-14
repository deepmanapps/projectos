package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortContentJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortContentId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortContentJpaRepository extends JpaRepository<WorkEffortContentJpaEntity, WorkEffortContentId> {
}
