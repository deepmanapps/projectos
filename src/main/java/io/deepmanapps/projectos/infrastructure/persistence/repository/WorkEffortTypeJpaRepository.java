package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortTypeJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortTypeJpaRepository extends JpaRepository<WorkEffortTypeJpaEntity, String> {
}
