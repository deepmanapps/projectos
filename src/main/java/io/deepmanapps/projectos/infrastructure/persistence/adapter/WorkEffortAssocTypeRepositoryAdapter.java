package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortAssocType;
import io.deepmanapps.projectos.domain.port.out.WorkEffortAssocTypeRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortAssocTypeMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortAssocTypeJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class WorkEffortAssocTypeRepositoryAdapter implements WorkEffortAssocTypeRepository {

    private final WorkEffortAssocTypeJpaRepository jpaRepository;
    private final WorkEffortAssocTypeMapper mapper;

    @Override
    public Optional<WorkEffortAssocType> findById(String id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public WorkEffortAssocType save(WorkEffortAssocType workEffortAssocType) {
        var entity = mapper.toEntity(workEffortAssocType);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}
