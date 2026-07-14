package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortTransBox;
import io.deepmanapps.projectos.domain.port.out.WorkEffortTransBoxRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortTransBoxMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortTransBoxJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortTransBoxRepositoryAdapter implements WorkEffortTransBoxRepository {

    private final WorkEffortTransBoxJpaRepository jpaRepository;
    private final WorkEffortTransBoxMapper mapper;

    @Override
    public WorkEffortTransBox save(WorkEffortTransBox transBox) {
        var entity = mapper.toEntity(transBox);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}
