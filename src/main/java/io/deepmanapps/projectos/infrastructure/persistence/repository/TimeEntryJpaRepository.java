package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.TimeEntryJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeEntryJpaRepository extends JpaRepository<TimeEntryJpaEntity, String> {
}
