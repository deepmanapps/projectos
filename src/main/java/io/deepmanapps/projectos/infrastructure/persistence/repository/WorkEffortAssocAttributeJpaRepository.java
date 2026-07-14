package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortAssocAttributeJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortAssocAttributeId;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.time.LocalDateTime;

public interface WorkEffortAssocAttributeJpaRepository extends JpaRepository<WorkEffortAssocAttributeJpaEntity, WorkEffortAssocAttributeId> {
    List<WorkEffortAssocAttributeJpaEntity> findByWorkEffortIdFromAndWorkEffortIdToAndWorkEffortAssocTypeIdAndFromDate(
            String workEffortIdFrom, String workEffortIdTo, String assocTypeId, LocalDateTime fromDate);
}
