package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortAssocTypeJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortAssocTypeJpaRepository extends JpaRepository<WorkEffortAssocTypeJpaEntity, String> {
}
