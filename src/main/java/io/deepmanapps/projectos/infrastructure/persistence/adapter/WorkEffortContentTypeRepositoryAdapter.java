package io.deepmanapps.projectos.infrastructure.persistence.adapter;

import io.deepmanapps.projectos.domain.model.WorkEffortContentType;
import io.deepmanapps.projectos.domain.port.out.WorkEffortContentTypeRepository;
import io.deepmanapps.projectos.infrastructure.persistence.mapper.WorkEffortContentTypeMapper;
import io.deepmanapps.projectos.infrastructure.persistence.repository.WorkEffortContentTypeJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class WorkEffortContentTypeRepositoryAdapter implements WorkEffortContentTypeRepository {

    private final WorkEffortContentTypeJpaRepository jpaRepository;
    private final WorkEffortContentTypeMapper mapper;

    @Override
    public Optional<WorkEffortContentType> findById(String id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public WorkEffortContentType save(WorkEffortContentType contentType) {
        var entity = mapper.toEntity(contentType);
        var savedEntity = jpaRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}
