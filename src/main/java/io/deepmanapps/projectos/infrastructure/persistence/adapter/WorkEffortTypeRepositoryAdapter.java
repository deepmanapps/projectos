package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortType;
import io.deepmanapps.projectos.domain.port.out.WorkEffortTypeRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortTypeMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortTypeJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class WorkEffortTypeRepositoryAdapter implements WorkEffortTypeRepository {

    private final WorkEffortTypeJpaRepository jpaRepository;
    private final WorkEffortTypeMapper mapper;

    @Override
    public Optional<WorkEffortType> findById(String id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public WorkEffortType save(WorkEffortType type) {
        var entity = mapper.toEntity(type);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}
