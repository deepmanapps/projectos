package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortAttributeJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortAttributeId;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface WorkEffortAttributeJpaRepository extends JpaRepository<WorkEffortAttributeJpaEntity, WorkEffortAttributeId> {
    List<WorkEffortAttributeJpaEntity> findByWorkEffort_WorkEffortId(String workEffortId);
}
