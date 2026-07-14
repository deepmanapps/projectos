package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortPartyAssignmentJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortPartyAssignmentId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortPartyAssignmentJpaRepository extends JpaRepository<WorkEffortPartyAssignmentJpaEntity, WorkEffortPartyAssignmentId> {
}
