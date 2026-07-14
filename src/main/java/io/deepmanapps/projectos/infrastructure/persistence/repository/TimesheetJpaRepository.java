package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.TimesheetJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimesheetJpaRepository extends JpaRepository<TimesheetJpaEntity, String> {
}
