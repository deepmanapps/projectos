package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortAssocJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortAssocId;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface WorkEffortAssocJpaRepository extends JpaRepository<WorkEffortAssocJpaEntity, WorkEffortAssocId> {
    List<WorkEffortAssocJpaEntity> findByWorkEffortFrom_WorkEffortId(String workEffortId);
    List<WorkEffortAssocJpaEntity> findByWorkEffortTo_WorkEffortId(String workEffortId);
}
