package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortSearchResult;
import io.deepmanapps.projectos.domain.port.out.WorkEffortSearchResultRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortSearchResultMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortSearchResultJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class WorkEffortSearchResultRepositoryAdapter implements WorkEffortSearchResultRepository {

    private final WorkEffortSearchResultJpaRepository jpaRepository;
    private final WorkEffortSearchResultMapper mapper;

    @Override
    public Optional<WorkEffortSearchResult> findById(String id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public WorkEffortSearchResult save(WorkEffortSearchResult searchResult) {
        var entity = mapper.toEntity(searchResult);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}
