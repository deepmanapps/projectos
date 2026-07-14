package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortCostCalcJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortCostCalcId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortCostCalcJpaRepository extends JpaRepository<WorkEffortCostCalcJpaEntity, WorkEffortCostCalcId> {
}
