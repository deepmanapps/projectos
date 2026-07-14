package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortGoodStandard;
import io.deepmanapps.projectos.domain.port.out.WorkEffortGoodStandardRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortGoodStandardMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortGoodStandardJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortGoodStandardRepositoryAdapter implements WorkEffortGoodStandardRepository {

    private final WorkEffortGoodStandardJpaRepository jpaRepository;
    private final WorkEffortGoodStandardMapper mapper;

    @Override
    public WorkEffortGoodStandard save(WorkEffortGoodStandard goodStandard) {
        var entity = mapper.toEntity(goodStandard);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}
