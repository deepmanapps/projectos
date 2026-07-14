package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortStatus;
import io.deepmanapps.projectos.domain.port.out.WorkEffortStatusRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortStatusMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortStatusJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortStatusRepositoryAdapter implements WorkEffortStatusRepository {

    private final WorkEffortStatusJpaRepository jpaRepository;
    private final WorkEffortStatusMapper mapper;

    @Override
    public WorkEffortStatus save(WorkEffortStatus status) {
        var entity = mapper.toEntity(status);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}
