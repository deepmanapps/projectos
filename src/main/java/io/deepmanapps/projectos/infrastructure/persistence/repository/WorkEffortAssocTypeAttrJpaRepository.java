package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortAssocTypeAttrJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortAssocTypeAttrId;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface WorkEffortAssocTypeAttrJpaRepository extends JpaRepository<WorkEffortAssocTypeAttrJpaEntity, WorkEffortAssocTypeAttrId> {
    List<WorkEffortAssocTypeAttrJpaEntity> findByWorkEffortAssocType_WorkEffortAssocTypeId(String assocTypeId);
}
