package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortStatusJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortStatusId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortStatusJpaRepository extends JpaRepository<WorkEffortStatusJpaEntity, WorkEffortStatusId> {
}
