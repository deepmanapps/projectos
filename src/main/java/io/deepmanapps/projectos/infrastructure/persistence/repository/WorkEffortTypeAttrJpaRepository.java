package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortTypeAttrJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortTypeAttrId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortTypeAttrJpaRepository extends JpaRepository<WorkEffortTypeAttrJpaEntity, WorkEffortTypeAttrId> {
}
