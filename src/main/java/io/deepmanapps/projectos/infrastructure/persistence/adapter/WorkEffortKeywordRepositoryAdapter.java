package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortKeyword;
import io.deepmanapps.projectos.domain.port.out.WorkEffortKeywordRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortKeywordMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortKeywordJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkEffortKeywordRepositoryAdapter implements WorkEffortKeywordRepository {

    private final WorkEffortKeywordJpaRepository jpaRepository;
    private final WorkEffortKeywordMapper mapper;

    @Override
    public WorkEffortKeyword save(WorkEffortKeyword keyword) {
        var entity = mapper.toEntity(keyword);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}
