package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortTransBoxJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortTransBoxId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortTransBoxJpaRepository extends JpaRepository<WorkEffortTransBoxJpaEntity, WorkEffortTransBoxId> {
}
