package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortIcalDataJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortIcalDataJpaRepository extends JpaRepository<WorkEffortIcalDataJpaEntity, String> {
}
