package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortSearchConstraintJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortSearchConstraintId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortSearchConstraintJpaRepository extends JpaRepository<WorkEffortSearchConstraintJpaEntity, WorkEffortSearchConstraintId> {
}
