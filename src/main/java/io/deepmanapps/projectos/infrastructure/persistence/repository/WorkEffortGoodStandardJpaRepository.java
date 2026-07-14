package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortGoodStandardJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortGoodStandardId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortGoodStandardJpaRepository extends JpaRepository<WorkEffortGoodStandardJpaEntity, WorkEffortGoodStandardId> {
}
