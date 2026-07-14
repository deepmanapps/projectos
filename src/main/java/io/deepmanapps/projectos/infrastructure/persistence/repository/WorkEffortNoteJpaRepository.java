package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortNoteJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortNoteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortNoteJpaRepository extends JpaRepository<WorkEffortNoteJpaEntity, WorkEffortNoteId> {
}
