package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortGoodStandardType;
import io.deepmanapps.projectos.domain.port.out.WorkEffortGoodStandardTypeRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortGoodStandardTypeMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortGoodStandardTypeJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class WorkEffortGoodStandardTypeRepositoryAdapter implements WorkEffortGoodStandardTypeRepository {

    private final WorkEffortGoodStandardTypeJpaRepository jpaRepository;
    private final WorkEffortGoodStandardTypeMapper mapper;

    @Override
    public Optional<WorkEffortGoodStandardType> findById(String id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public WorkEffortGoodStandardType save(WorkEffortGoodStandardType type) {
        var entity = mapper.toEntity(type);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}
