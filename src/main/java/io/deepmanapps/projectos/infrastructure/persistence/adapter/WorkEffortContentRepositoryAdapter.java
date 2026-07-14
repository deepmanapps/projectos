package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortContent;
import io.deepmanapps.projectos.domain.port.out.WorkEffortContentRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortContentMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortContentJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortContentRepositoryAdapter implements WorkEffortContentRepository {

    private final WorkEffortContentJpaRepository jpaRepository;
    private final WorkEffortContentMapper mapper;

    @Override
    public WorkEffortContent save(WorkEffortContent workEffortContent) {
        var entity = mapper.toEntity(workEffortContent);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}
