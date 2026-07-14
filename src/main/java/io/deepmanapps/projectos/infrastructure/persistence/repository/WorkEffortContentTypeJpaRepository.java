package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortContentTypeJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortContentTypeJpaRepository extends JpaRepository<WorkEffortContentTypeJpaEntity, String> {
}
