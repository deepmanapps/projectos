package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortTypeAttr;
import io.deepmanapps.projectos.domain.port.out.WorkEffortTypeAttrRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortTypeAttrMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortTypeAttrJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortTypeAttrRepositoryAdapter implements WorkEffortTypeAttrRepository {

    private final WorkEffortTypeAttrJpaRepository jpaRepository;
    private final WorkEffortTypeAttrMapper mapper;

    @Override
    public WorkEffortTypeAttr save(WorkEffortTypeAttr attr) {
        var entity = mapper.toEntity(attr);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}
