package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortSkillStandardJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortSkillStandardId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortSkillStandardJpaRepository extends JpaRepository<WorkEffortSkillStandardJpaEntity, WorkEffortSkillStandardId> {
}
