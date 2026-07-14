package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortJpaRepository extends JpaRepository<WorkEffortJpaEntity, String> {
}
