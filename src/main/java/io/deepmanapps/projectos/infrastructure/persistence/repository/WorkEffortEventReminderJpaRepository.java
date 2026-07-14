package io.deepmanapps.projectos.infrastructure.persistence.repository;

import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortEventReminderJpaEntity;
import io.deepmanapps.projectos.infrastructure.persistence.entity.WorkEffortEventReminderId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkEffortEventReminderJpaRepository extends JpaRepository<WorkEffortEventReminderJpaEntity, WorkEffortEventReminderId> {
}
