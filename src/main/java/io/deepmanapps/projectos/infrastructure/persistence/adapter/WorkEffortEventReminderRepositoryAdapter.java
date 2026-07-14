package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortEventReminder;
import io.deepmanapps.projectos.domain.port.out.WorkEffortEventReminderRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortEventReminderMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortEventReminderJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortEventReminderRepositoryAdapter implements WorkEffortEventReminderRepository {

    private final WorkEffortEventReminderJpaRepository jpaRepository;
    private final WorkEffortEventReminderMapper mapper;

    @Override
    public WorkEffortEventReminder save(WorkEffortEventReminder reminder) {
        var entity = mapper.toEntity(reminder);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}
